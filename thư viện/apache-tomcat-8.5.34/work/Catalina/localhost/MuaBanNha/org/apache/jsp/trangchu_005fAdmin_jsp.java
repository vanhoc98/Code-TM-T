/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2019-06-22 22:44:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;
import dao.ProductDAO;
import dao.UsersDAO;

public final class trangchu_005fAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dao.UsersDAO");
    _jspx_imports_classes.add("dao.ProductDAO");
    _jspx_imports_classes.add("model.Users");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin's Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-responsive.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fullcalendar.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/matrix-style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/matrix-media.css\" />\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.gritter.css\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            Users u = (Users) session.getAttribute("admin");
            if (u == null) {
                response.sendRedirect("404.jsp");
            }
        
      out.write("\n");
      out.write("        <!--main-container-part-->\n");
      out.write("        <div id=\"content\" style=\"background: rgba(0,0,0,0);\">\n");
      out.write("            <!--breadcrumbs-->\n");
      out.write("            <div id=\"content-header\">\n");
      out.write("                <div id=\"breadcrumb\" style=\"background: rgba(0,0,0,0.4);\"> <a href=\"index_Admin.jsp\" title=\"Go to Home\" class=\"tip-bottom\"><i class=\"icon-home\"></i> Home</a></div>\n");
      out.write("            </div>\n");
      out.write("            <!--End-breadcrumbs-->\n");
      out.write("\n");
      out.write("            <!--Action boxes-->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"quick-actions_homepage\">\n");
      out.write("                    <ul class=\"quick-actions\">\n");
      out.write("                        <li class=\"bg_lb\"> <a href=\"#\"> <i class=\"icon-dashboard\"></i> <span class=\"label label-important\">20</span>Th???ng K?? </a> </li>\n");
      out.write("                        <li class=\"bg_lg span3\"> <a href=\"#\"> <i class=\"icon-signal\"></i>Bi???u ?????</a> </li>\n");
      out.write("                        <li class=\"bg_ly\"> <a href=\"#\"> <i class=\"icon-inbox\"></i><span class=\"label label-success\">101</span> Ti???n ??ch </a> </li>\n");
      out.write("                        <li class=\"bg_lo\"> <a href=\"#\"> <i class=\"icon-th\"></i> B???ng B??o C??o</a> </li>\n");
      out.write("                        <li class=\"bg_ls\"> <a href=\"#\"> <i class=\"icon-fullscreen\"></i>M??? R???ng M?? H??nh</a> </li>\n");
      out.write("                        <li class=\"bg_lo span3\"> <a href=\"#\"> <i class=\"icon-th-list\"></i>M???c Qu???n L?? Nh?? ?????t</a> </li>\n");
      out.write("                        <li class=\"bg_ls\"> <a href=\"#\"> <i class=\"icon-tint\"></i>?? T?????ng Cho Web</a> </li>\n");
      out.write("                        <li class=\"bg_lb\"> <a href=\"#\"> <i class=\"icon-pencil\"></i>L??u C??ng Vi???c</a> </li>\n");
      out.write("                        <li class=\"bg_lg\"> <a href=\"#\"> <i class=\"icon-calendar\"></i>L???ch L??m Vi???c </a> </li>\n");
      out.write("                        <li class=\"bg_lr\"> <a href=\"#\"> <i class=\"icon-info-sign\"></i> Error</a> </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!--End-Action boxes-->    \n");
      out.write("\n");
      out.write("                <!--Chart-box-->    \n");
      out.write("                <div class=\"row-fluid\">\n");
      out.write("                    <div class=\"widget-box\" style=\"background: rgba(0,0,0,0);\" >\n");
      out.write("                        <div class=\"widget-title bg_lg\"><span class=\"icon\"><i class=\"icon-signal\"></i></span>\n");
      out.write("                            <h5>Bi???u ?????</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"widget-content\" >\n");
      out.write("                            <div class=\"row-fluid\">\n");
      out.write("                                <div class=\"span9\">\n");
      out.write("                                    <div class=\"chart\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"span3\">\n");
      out.write("                                    <ul class=\"site-stats\">\n");
      out.write("                                        <li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-user\"></i><small>T???ng C???ng<strong>");
      out.print(UsersDAO.countuser());
      out.write("</strong> User</small> </li>\n");
      out.write("                                        <a href=\"insert_thanhvien_Admin.jsp\"><li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-plus\" ></i> <strong>1</strong> <small>Th??m User</small></li></a>\n");
      out.write("                                        <li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-shopping-cart\"></i> <strong>");
 out.print(ProductDAO.countbaidangmua() + ProductDAO.countbaidangban());
      out.write("</strong> <small>T???ng C???ng B??i ????ng</small></li>\n");
      out.write("                                        <li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-tag\"></i> <strong>");
      out.print(ProductDAO.countbaidangmua());
      out.write(" </strong> <small>L?????ng B??i ????ng Mua</small></li>\n");
      out.write("                                        <li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-repeat\"></i> <strong>");
      out.print(ProductDAO.countbaidangban());
      out.write("</strong> <small>L?????ng B??i ????ng B??n</small></li>\n");
      out.write("                                        <li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-globe\"></i> <strong>0</strong> <small>Online Users</small></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--End-Chart-box--> \n");
      out.write("                <hr/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/excanvas.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery.ui.custom.js\"></script> \n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery.flot.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery.flot.resize.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery.peity.min.js\"></script> \n");
      out.write("        <script src=\"js/fullcalendar.min.js\"></script> \n");
      out.write("        <script src=\"js/matrix.js\"></script> \n");
      out.write("        <script src=\"js/matrix.dashboard.js\"></script> \n");
      out.write("        <script src=\"js/jquery.gritter.min.js\"></script> \n");
      out.write("        <script src=\"js/matrix.interface.js\"></script> \n");
      out.write("        <script src=\"js/matrix.chat.js\"></script> \n");
      out.write("        <script src=\"js/jquery.validate.js\"></script> \n");
      out.write("        <script src=\"js/matrix.form_validation.js\"></script> \n");
      out.write("        <script src=\"js/jquery.wizard.js\"></script> \n");
      out.write("        <script src=\"js/jquery.uniform.js\"></script> \n");
      out.write("        <script src=\"js/select2.min.js\"></script> \n");
      out.write("        <script src=\"js/matrix.popover.js\"></script> \n");
      out.write("        <script src=\"js/jquery.dataTables.min.js\"></script> \n");
      out.write("        <script src=\"js/matrix.tables.js\"></script> \n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            // This function is called from the pop-up menus to transfer to\n");
      out.write("            // a different page. Ignore if the value returned is a null string:\n");
      out.write("            function goPage(newURL) {\n");
      out.write("\n");
      out.write("                // if url is empty, skip the menu dividers and reset the menu selection to default\n");
      out.write("                if (newURL != \"\") {\n");
      out.write("\n");
      out.write("                    // if url is \"-\", it is this page -- reset the menu:\n");
      out.write("                    if (newURL == \"-\") {\n");
      out.write("                        resetMenu();\n");
      out.write("                    }\n");
      out.write("                    // else, send page to designated URL            \n");
      out.write("                    else {\n");
      out.write("                        document.location.href = newURL;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // resets the menu selection upon entry to this page:\n");
      out.write("            function resetMenu() {\n");
      out.write("                document.gomenu.selector.selectedIndex = 2;\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
