/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2019-01-02 14:05:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bai8_slideImage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link  rel=\"stylesheet\" href=\"resources/css/bootstrap-grid.min.css\" type=\"text/css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\" />\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color:black;\n");
      out.write("            }\n");
      out.write("            .khoi-slide {\n");
      out.write("                width:  100%;\n");
      out.write("                height:  700px;\n");
      out.write("                position:  relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img {\n");
      out.write("                width:  100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .cac-slide {\n");
      out.write("                width:  100%;\n");
      out.write("                height:  700px;\n");
      out.write("                overflow:  hidden;\n");
      out.write("            }\n");
      out.write("            .slide {\n");
      out.write("                position:  absolute;\n");
      out.write("                top: 0px;\n");
      out.write("                left: 0px;\n");
      out.write("                opacity:  0;\n");
      out.write("                visibility:  hidden;\n");
      out.write("            }\n");
      out.write("            .slide.active{\n");
      out.write("                opacity:  1;\n");
      out.write("                visibility:  visible;\t\n");
      out.write("            }\n");
      out.write("            .nut-slide span{\n");
      out.write("                color: white;\n");
      out.write("                font-size: 60px;\n");
      out.write("                opacity: 0.6;\n");
      out.write("            }\n");
      out.write("            span#btn-prev{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 30%;\n");
      out.write("                left: 0%;\n");
      out.write("                z-index: 10;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            span#btn-next{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 30%;\n");
      out.write("                right: 0%;\n");
      out.write("                z-index: 10;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .nut-slide ul {\n");
      out.write("                position:  absolute;\n");
      out.write("                z-index:  10;\n");
      out.write("                width:  100px;\n");
      out.write("                bottom:  25%;\n");
      out.write("                left:  50%;\n");
      out.write("                margin-left: -50px;\n");
      out.write("                display:  flex;\n");
      out.write("                justify-content:  space-between;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nut-slide ul li {\n");
      out.write("                width:  20px;\n");
      out.write("                height:  20px;\n");
      out.write("                background:  white;\n");
      out.write("                opacity:  0.6;\n");
      out.write("                list-style:  none;\n");
      out.write("                border-radius:  50%;\n");
      out.write("                cursor:  pointer;\n");
      out.write("                transition: 0.6s;\n");
      out.write("            }\n");
      out.write("            .bien-mat-ben-trai{\n");
      out.write("                animation: bien-mat-ben-trai 1s forwards;\n");
      out.write("            }\n");
      out.write("            @-webkit-keyframes bien-mat-ben-trai{\n");
      out.write("                from{\n");
      out.write("                    transform: translateX(0%);\n");
      out.write("                }\n");
      out.write("                to{\n");
      out.write("                    transform: translateX(-100%);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            .di-vao-ben-phai{\n");
      out.write("                animation: di-vao-ben-phai 1s forwards;\n");
      out.write("            }\n");
      out.write("            @-webkit-keyframes di-vao-ben-phai{\n");
      out.write("                from{\n");
      out.write("                    transform: translateX(100%);\n");
      out.write("                }\n");
      out.write("                to{\n");
      out.write("                    transform: translateX(0%);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            /*x??? l?? n??t prev*/\n");
      out.write("            .bien-mat-ben-phai{\n");
      out.write("                animation: bien-mat-ben-phai 1s forwards;\n");
      out.write("            }\n");
      out.write("            @-webkit-keyframes bien-mat-ben-phai{\n");
      out.write("                from{\n");
      out.write("                    transform: translateX(0%);\n");
      out.write("                }\n");
      out.write("                to{\n");
      out.write("                    transform: translateX(100%);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            .di-vao-ben-trai{\n");
      out.write("                animation: di-vao-ben-trai 1s forwards;\n");
      out.write("            }\n");
      out.write("            @-webkit-keyframes di-vao-ben-trai{\n");
      out.write("                from{\n");
      out.write("                    transform: translateX(-100%);\n");
      out.write("                }\n");
      out.write("                to{\n");
      out.write("                    transform: translateX(0%);\n");
      out.write("                }\n");
      out.write("            }            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"khoi-slide\">\n");
      out.write("            <div class=\"cac-slide\">\n");
      out.write("                <div class=\"slide active\"><img src=\"resources/img/1.png\" ></div>\n");
      out.write("                <div class=\"slide\"><img src=\"resources/img/2.png\" ></div>\n");
      out.write("                <div class=\"slide\"><img src=\"resources/img/3.png\"></div>\n");
      out.write("                <div class=\"slide\"><img src=\"resources/img/4.png\" ></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nut-slide\">\n");
      out.write("                <span id=\"btn-prev\"><i class=\"fas fa-chevron-left\"></i></span>\n");
      out.write("                <span id=\"btn-next\"><i class=\"fas fa-chevron-right\"></i></span>\n");
      out.write("                <ul>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                    <li></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#btn-next').click(function (event) {\n");
      out.write("                    var slide_sau = $('.active').next();\n");
      out.write("                    if (slide_sau.length != 0) {\n");
      out.write("                        $('.active').addClass('bien-mat-ben-trai').one('webkitAnimationEnd', function (event) {\n");
      out.write("                            $('.bien-mat-ben-trai').removeClass('bien-mat-ben-trai').removeClass('active');\n");
      out.write("                        });\n");
      out.write("                        slide_sau.addClass('active').addClass('di-vao-ben-phai').one('webkitAnimationEnd', function (event) {\n");
      out.write("                            $('.di-vao-ben-phai').removeClass('di-vao-ben-phai');\n");
      out.write("                        });\n");
      out.write("                    } else {\n");
      out.write("                        $('.active').addClass('bien-mat-ben-trai').one('webkitAnimationEnd', function (event) {\n");
      out.write("                            $('.bien-mat-ben-trai').removeClass('bien-mat-ben-trai').removeClass('active');\n");
      out.write("                        });\n");
      out.write("                        $('.slide:first-child').addClass('active').addClass('di-vao-ben-phai').one('webkitAnimationEnd', function (event) {\n");
      out.write("                            $('.di-vao-ben-phai').removeClass('di-vao-ben-phai');\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
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
