/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2019-06-22 22:41:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chothue_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"csschothue/general.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"csschothue/style.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"csschothue/post.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"csschothue/basis.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.2/css/all.css\" />\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($)\n");
      out.write("            {\n");
      out.write("                $(\".scroll\").click(function (event)\n");
      out.write("                {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--slider-script-->\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function ()\n");
      out.write("            {\n");
      out.write("                $(\"#slider1\").responsiveSlides({\n");
      out.write("                    auto: true,\n");
      out.write("                    speed: 100,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    pager: true,\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--//slider-script-->\n");
      out.write("        <script>$(document).ready(function (c)\n");
      out.write("            {\n");
      out.write("                $('.alert-close').on('click', function (c) {\n");
      out.write("                    $('.message').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            #btnHuyPost:hover , input[type=submit]:hover\n");
      out.write("            {\n");
      out.write("                color:aqua;\n");
      out.write("                background:rgba(0,0,0,0.7);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background:url(video/bann.jpg) fixed\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <link href=\"/Styles/JqueryFileUpload/Default/jquery.fileupload-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("            <form action=\"ChoThue\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                <div id=\"wrapper\" class=\"\">\n");
      out.write("                    <div class=\"main set-relative\">\n");
      out.write("                        <div class=\"row clearfix \">\n");
      out.write("                            <div class=\"col-gr-100per\">\n");
      out.write("                                <div id=\"MainContent_PostNews1_pnDangtin\">\n");
      out.write("\n");
      out.write("                                    <div class=\"post-title\">\n");
      out.write("                                        <h4 class=\"title text-uppercase fweight-bold\" style=\"color:white;background:rgba(0,0,0,0.4)\" >Th??ng tin c?? b???n\n");
      out.write("                                        </h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"post-field\">\n");
      out.write("                                        <label class=\"first\" style=\"color:white;\">Lo???i nh?? ?????t (<span class=\"red-clr\">*</span>)</label>\n");
      out.write("                                        <div class=\"post-field-option set-relative\">\n");
      out.write("                                            <select name=\"loainhadat\" class=\"form-control\" style=\"background:rgba(0,0,0,0.4);color:white;\" >\n");
      out.write("                                                <option >Ch???n Lo???i nh?? ?????t</option>\n");
      out.write("                                                <option value=\"1\">+Cho thu?? c??n h??? chung c??</option>\n");
      out.write("                                                <option value=\"2\">+Cho thu?? nh?? ri??ng</option>\n");
      out.write("                                                <option value=\"3\">+Cho thu?? nh?? m???t ph???</option>\n");
      out.write("                                                <option value=\"4\">+Cho thu?? nh?? tr???,ph??ng tr???</option>\n");
      out.write("                                                <option value=\"5\">+Cho thu?? v??n ph??ng </option>\n");
      out.write("                                                <option value=\"6\">+Cho thu?? c???a h??ng,ki ???t</option>\n");
      out.write("                                                <option value=\"7\">+Cho thu?? nh?? kho</option>\n");
      out.write("                                                <option value=\"8\">+Cho thu?? nh?? x?????ng,?????t</option>\n");
      out.write("                                            </select>\n");
      out.write("                                            <span style=\"color: red; position: absolute; line-height: 40px; left: 0; top: 30px; display: none;\" id=\"spanLoainhadat\">B???n c???n nh???p lo???i nh?? ?????t</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"post-field mg-top-0\" style=\"padding-top: 25px;\">\n");
      out.write("                                        <label class=\"first\" >Gi??</label>\n");
      out.write("                                        <input name=\"gia\" type=\"text\" id=\"txtDiadiem\" class=\"form-control\" style=\"width:210px;background:rgba(0,0,0,0.4)\"  />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"post-field mg-top-0\" style=\"padding-top: 25px;\">\n");
      out.write("                                        <label class=\"first\" >Di???n T??ch(m<sup>2</sup>)</label>\n");
      out.write("                                        <input name=\"dientich\" type=\"text\" id=\"txtDiadiem\" class=\"form-control\" style=\"width:210px;background:rgba(0,0,0,0.4)\" />\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"post-field\">\n");
      out.write("                                        <label class=\"first\">?????a ??i???m (<span class=\"red-clr\">*</span>)</label>\n");
      out.write("                                        <div class=\"post-field-option\">\n");
      out.write("                                            <input name=\"diadiem\" style=\"background:rgba(0,0,0,0.4)\" type=\"text\" id=\"txtDiadiem\" class=\"form-control\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                    <div style=\"background:rgba(0,0,0,0.4);color:white;padding:26px;margin-top:30px;\">\n");
      out.write("                                        <h4>TH??NG TIN KH??C</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"post-field huongnha\">\n");
      out.write("                                        <label class=\"first  pull-left\" >M???t ti???n (m<sup>2</sup>)</label>\n");
      out.write("                                        <div class=\"post-field-option\">\n");
      out.write("                                            <input name=\"matien\" type=\"text\" maxlength=\"6\" id=\"txtMattien\" style=\"background: rgba(0,0,0,0.4)\" class=\"form-control w-230  pull-left\" />\n");
      out.write("                                            <label class=\"mg-left-40 mg-right-5  pull-left\" >???????ng tr?????c nh?? (m<sup>2</sup>)</label>\n");
      out.write("                                            <input name=\"duongtruocnha\" type=\"text\" maxlength=\"6\" id=\"txtDuongtruocnha\" class=\"form-control w-230  pull-left\" style=\"background: rgba(0,0,0,0.4)\" />\n");
      out.write("                                            <label class=\"mg-left-40 mg-right-5 pull-left\">H?????ng nh??</label>\n");
      out.write("                                            <select name=\"huongnha\" style=\"color:white; background: rgba(0,0,0,0.4)\" id=\"cboDirectionPost\" class=\"form-control w-230 mg-right-0\">\n");
      out.write("                                                <option>Kh??ng X??c ?????nh</option>\n");
      out.write("                                                <option value=\"1\">????ng </option>\n");
      out.write("                                                <option value=\"2\">T??y </option>\n");
      out.write("                                                <option value=\"3\">Nam </option>\n");
      out.write("                                                <option value=\"4\">B???c </option>\n");
      out.write("                                                <option value=\"5\">????ng-B???c</option>\n");
      out.write("                                                <option value=\"6\">T??y-B???c</option>\n");
      out.write("                                                <option value=\"7\">T??y-Nam</option>\n");
      out.write("                                                <option value=\"8\">????ng-Nam</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"post-field huongnha\">\n");
      out.write("                                        <label class=\"first  pull-left\">S??? t???ng</label>\n");
      out.write("                                        <div class=\"post-field-option\">\n");
      out.write("                                            <input name=\"sotang\" type=\"text\" maxlength=\"1\" id=\"txtMattien\" class=\"form-control w-230  pull-left\" style=\"margin-right: 75px;background: rgba(0,0,0,0.4)\" />\n");
      out.write("                                            <label class=\"mg-left-40 mg-right-5  pull-left\">S??? ph??ng</label>\n");
      out.write("\n");
      out.write("                                            <input name=\"sophong\" type=\"text\" maxlength=\"2\" id=\"txtDuongtruocnha\" class=\"form-control w-230  pull-left\" style=\"margin-right: 18px;background: rgba(0,0,0,0.4)\" />\n");
      out.write("                                            <label class=\"mg-left-40 mg-right-5 pull-left\">S??? toilet</label>\n");
      out.write("                                            <input name=\"sotoilet\" type=\"text\" maxlength=\"2\" id=\"txtDuongtruocnha\" class=\"form-control w-230  pull-left\" style=\"background: rgba(0,0,0,0.4)\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                    <div style=\"background:rgba(0,0,0,0.4);color:white;padding:26px;margin-top:30px;\">\n");
      out.write("                                        <h4>M?? T??? CHI TI???T</h4>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"post-field mg-bottom-20\">\n");
      out.write("                                        <label class=\"first\">Ti??u ????? (<span class=\"red-clr\">*</span>)</label>\n");
      out.write("                                        <div class=\"post-field-option\">\n");
      out.write("                                            <input name=\"tieude\" style=\"background:rgba(0,0,0,0.4)\" type=\"text\" maxlength=\"150\" id=\"txtTieude\" class=\"form-control\" />\n");
      out.write("                                            <span style=\"color: Red; display: none; margin-top: 2px; float: left;\" id=\"spanTieude\">B???n c???n nh???p ti??u ?????</span>\n");
      out.write("                                            <span style=\"color: Red; display: none; margin-top: 2px; float: left;\" id=\"spanLimit\">Ti??u ????? ph???i nh???p ??t nh???t 5 ch???!</span>\n");
      out.write("                                            <span style=\"color: Red; display: none; margin-top: 2px; float: left;\" id=\"spanMaxCharacter\">Ti??u ????? kh??ng ???????c nh???p qu?? 150 k?? t???!</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"post-field set-relative mg-top-0\">\n");
      out.write("                                        <label class=\"first\">\n");
      out.write("                                            <span style=\"letter-spacing: -0.5px\">N???i dung m?? t???</span> (<span class=\"red-clr\">*</span>)\n");
      out.write("                                            <br />\n");
      out.write("                                            <span class=\"note\" >L??u ??: t???i ??a ch??? 3000 k?? t???</span>\n");
      out.write("                                        </label>\n");
      out.write("                                        <div id=\"boxarea\" class=\"post-field-option\">\n");
      out.write("                                            <textarea name=\"mota\" style=\"background:rgba(0,0,0,0.4)\" id=\"tarNoidung\" cols=\"60\" rows=\"5\" maxlength=\"3000\" class=\"form-control\" style=\"padding: 8px 15px 25px;\"></textarea>\n");
      out.write("                                            <span style=\"color: Red; display: none;\" id=\"spanNoidungmota\">N???i dung kh??ng ???????c b??? tr???ng!</span>\n");
      out.write("                                            <span style=\"color: Red; display: none;\" id=\"spanLimited\">N???i dung ph???i l???n h??n 100 k?? t???!</span>\n");
      out.write("                                            <div id=\"tarNoidung_counter\" class=\"counter-noidung\" style=\"background:rgba(0,0,0,0.4);color:white;\">\n");
      out.write("                                                1/3000 k?? t???\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"post-field\" style=\"min-height:inherit;\">\n");
      out.write("                                        <label>????ng t???i h??nh ???nh(*)</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"post-field\">\n");
      out.write("                                        <input name=\"hinhanh\" type=\"file\" style=\"width:264px;height:40px;border:1px solid white;padding-top: 7px;border-radius: 4px;\" multiple />\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                    <div style=\"background:rgba(0,0,0,0.4);color:white;padding:26px;margin-top:30px;\">\n");
      out.write("                                        <h4>TH??NG TIN LI??N H???</h4>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"post-field mg-bottom-20\">\n");
      out.write("                                        <label class=\"first\">H??? t??n (<span class=\"red-clr\">*</span>)</label>\n");
      out.write("                                        <div class=\"post-field-option\">\n");
      out.write("                                            <input name=\"hoten\" type=\"text\" id=\"txtHovaten\" class=\"form-control w-390\" style=\"background:rgba(0,0,0,0.4)\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"post-field mg-bottom-20\">\n");
      out.write("                                        <label class=\"first\">?????a Ch??? (<span class=\"red-clr\">*</span>)</label>\n");
      out.write("                                        <div class=\"post-field-option\">\n");
      out.write("                                            <input name=\"diachi\" type=\"text\" id=\"txtHovaten\" class=\"form-control w-390\" style=\"background:rgba(0,0,0,0.4)\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"post-field mg-bottom-20\">\n");
      out.write("                                        <label class=\"first\">??i???n Tho???i (<span class=\"red-clr\">*</span>)</label>\n");
      out.write("                                        <div class=\"post-field-option\">\n");
      out.write("                                            <input name=\"dienthoai\" type=\"text\" id=\"txtHovaten\" class=\"form-control w-390\" style=\"background:rgba(0,0,0,0.4)\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"post-field mg-bottom-20\">\n");
      out.write("                                        <label class=\"first\">Email (<span class=\"red-clr\">*</span>)</label>\n");
      out.write("                                        <div class=\"post-field-option\">\n");
      out.write("                                            <input name=\"email\" type=\"text\" id=\"txtHovaten\" class=\"form-control w-390\" style=\"background:rgba(0,0,0,0.4)\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clear\"></div>\n");
      out.write("                                    <div >\n");
      out.write("                                        <span>\n");
      out.write("                                            <input type=\"submit\" style=\"font-size: 30px;width: 166px;border: 1px solid white;border-radius: 5px;background: rgba(0,0,0,0.4);color: white;\"  value=\"????ng Tin\">\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("                $(function ()\n");
      out.write("                {\n");
      out.write("                    $('#btnHuyPost').click(function () {\n");
      out.write("                        if (confirm(\"B???n c?? ch???c ch???n mu???n h???y ?\"))\n");
      out.write("                        {\n");
      out.write("                            location.reload(true);\n");
      out.write("                        }\n");
      out.write("                    })\n");
      out.write("                })\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
