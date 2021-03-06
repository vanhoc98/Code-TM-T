package controller;

import dao.UsersDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tools.Captcha;
import model.Users;
import tools.SendMail;

@WebServlet(name = "UsersServlet", urlPatterns = {"/UsersServlet"})
public class UsersServlet extends HttpServlet {

    UsersDAO usersDAO = new UsersDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String url = "";
        Users users = new Users();

        switch (command) {
            case "them": {

                String mauEmail = "^[\\w-_.]{5,15}+\\@[\\w&&[^0-9]]{5,8}+\\.com+$";
                String mauPass = "^([\\w_\\.!@#$%^&*()([A-Z])]+){8,31}$";
                String maudienthoai = "^[0]([0-9]{9,10})$";
                Pattern pattern = Pattern.compile(mauEmail);
                Matcher matcheremail = pattern.matcher(request.getParameter("email"));
                Matcher matcherpass = Pattern.compile(mauPass).matcher(request.getParameter("pass"));
                Matcher matcherdienthoai = Pattern.compile(maudienthoai).matcher(request.getParameter("phone"));
                try {
                    HttpSession session1 = request.getSession(true);
                    if (usersDAO.kiemtra(request.getParameter("username"))
                            | usersDAO.kiemtraemail(request.getParameter("email"))
                            | request.getParameter("pass").length() < 8
                            | !request.getParameter("repass").equals(request.getParameter("pass"))
                            | !matcheremail.matches()
                            | request.getParameter("username").length() < 5 | request.getParameter("username").length() > 15
                            | !matcherpass.matches()
                            | !matcherdienthoai.matches()) {
                        if (usersDAO.kiemtraemail(request.getParameter("email"))) {
                            request.setAttribute("error", "Email ???? T???n T???i!,Vui L??ng S??? D???ng Email Kh??c");
                        }
                        if (request.getParameter("pass").length() < 8) {
                            request.setAttribute("error2", "????? D??i M???t Kh???u L???n H??n 8 K?? T???");
                        }
                        if (!request.getParameter("repass").equals(request.getParameter("pass"))) {
                            request.setAttribute("error3", "M???t Kh???u Nh???p L???i B??? Sai");
                        }
                        if (!matcheremail.matches()) {
                            request.setAttribute("error4", "Sai ?????nh D???ng Email/Gmail");
                        }
                        if (!matcherpass.matches()) {
                            request.setAttribute("error5", "M???t kh???u ch???a ??t nh???t 1 t??? Hoa,1 t??? th?????ng,k??m 1 k?? t??? ?????c bi???t,????? d??i l???n h??n 8");
                        }
                        if (!matcherdienthoai.matches()) {
                            request.setAttribute("error6", "Sai ?????nh D???ng ??i???n Tho???i,g???m 10 ho???c 11 s??? v?? b???t ?????u t??? s??? 0");
                        }
                        url = "/register.jsp";
                        break;
                    } else {
                        String uuid = UUID.randomUUID().toString();
                        users.setHovaten(request.getParameter("hovaten"));
                        users.setUserEmail(request.getParameter("email"));
                        users.setUserName(request.getParameter("username"));
                        users.setUserPass(request.getParameter("pass"));
                        users.setSdt(request.getParameter("phone"));
                        users.setDiachi(request.getParameter("diachi"));
                        users.setUser_role(0);
                        users.setUser_kichhoat(0);
                        users.setUser_code(uuid);
                        {
                            try {
                                usersDAO.themTK(users);
                                String kichhoat = "http://localhost:8081/MuaBanNha/kichhoat.jsp?ID=" + uuid + "&TK=" + users.getUserEmail();
                                SendMail.sendMail(request.getParameter("email"), "Hoan T??t Qu?? Trinh ????ng Ky",
                                        "Ch??o Ban," + users.getHovaten() + "\n"
                                        + "C??m on ban ??a ????ng ky t??i khoan t???i web site bat ??ong san C??I BANG.Vui long k??ch hoat x??c nhan t??i khoan b??n d????i :\n"
                                        + "Ban c?? th?? copy link v?? d??n v??o trinh duy??t : \n"
                                        + kichhoat + "\n " + "Tr??n Trong,\n "
                                        + "Team ch??m s??c KH,Team DTU\n" + "N??u ban c?? th??c m??c ,ban vui long send email to Leanhhieu2210@gmail.com");

                            } catch (SQLException ex) {
                                System.out.println("Loi " + ex.getMessage());
                            }
                        }
                        request.setAttribute("dangky", "???? ????ng K?? T??i Kho???n " + users.getUserName());
                        url = "/login.jsp";
                        break;
                    }
                } catch (SQLException ex) {
                    System.out.println("Loi " + ex.getMessage());
                }
            }
            case "login": {
                try {

                    if (UsersDAO.kiemtraUser_Pass(request.getParameter("username"), request.getParameter("pass"))) 
                    {
                        String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
                        if (Captcha.verify(gRecaptchaResponse)) 
                        {
                            HttpSession session = request.getSession(true);
                            users = UsersDAO.login(request.getParameter("username"), request.getParameter("pass"));
                            if (users != null) {
                                if (users.getUser_kichhoat() == 1) {
                                    if (users.getUser_role() == 1) {
                                        session.setAttribute("admin", users);
                                        url = "/index_Admin.jsp";
                                        break;
                                    } else {
                                        if (users.getUser_role() == 0) {

                                            session.setAttribute("user", users);
                                            url = "/index.jsp";
                                            break;
                                        }
                                    }
                                } else {
                                    request.setAttribute("error2", users.getHovaten() + "! ,B???n Ch??a K??ch Ho???t T??i Kho???n,1 H???p Th?? ???? G???i ?????n ?????a Ch??? Email/Gmail " + users.getUserEmail());
                                    url = "/login.jsp";
                                    break;
                                }
                            }
                        } 
                        else if(!Captcha.verify(gRecaptchaResponse))
                        {
                            request.setAttribute("error3", "Ch??a X??c Nh???n Captcha");
                            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                            rd.forward(request, response);
                        }

                    } else {
                        request.setAttribute("error", "Sai T??n ????ng Nh???p Ho???c M???t Kh???u!");
                        url = "/login.jsp";
                    }

                } catch (Exception ex) {
                    System.out.println("L???i " + ex.getMessage());
                }
            }
            break;

        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }
}
