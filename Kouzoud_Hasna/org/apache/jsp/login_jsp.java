/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.108
 * Generated at: 2021-05-25 16:45:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


String message="";
String etat="";

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

if(request.getAttribute("msg")!=null)
{
message= request.getAttribute("msg").toString()+" c'est votre " +request.getAttribute("cpt") +" ieme tentative";
if( Integer.parseInt(request.getAttribute("cpt").toString())>3)
	etat="disabled";
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>App Gestion de r??servation des Livres </title>\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("    <!-- Bootstrap 3.3.5 -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("    <!-- Ionicons -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("    <!-- Theme style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/iCheck/square/blue.css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body class=\"hold-transition login-page\">\n");
      out.write("    <div class=\"login-box\">\n");
      out.write("      <div class=\"login-logo\">\n");
      out.write("        <a href=\"../../index2.html\"><b>Authentification</b></a>\n");
      out.write("      </div><!-- /.login-logo -->\n");
      out.write("      <div class=\"login-box-body\">\n");
      out.write("        <p class=\"login-box-msg\">\n");
      out.write("        se connecter pour commencer votre session</br>\n");
      out.write("        ");
      out.print(message );
      out.write("\n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <form action=\"Serve2\" method=\"post\">\n");
      out.write("          <div class=\"form-group has-feedback\">\n");
      out.write("            <input type=\"email\" name=\"log\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("            <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group has-feedback\">\n");
      out.write("            <input type=\"password\" name=\"pass\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("            <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-7\">\n");
      out.write("              <div class=\"checkbox icheck\">\n");
      out.write("                <label>\n");
      out.write("                  <input type=\"checkbox\"> Remember Me\n");
      out.write("                </label>\n");
      out.write("              </div>\n");
      out.write("            </div><!-- /.col -->\n");
      out.write("            <div class=\"col-xs-5\">\n");
      out.write("              <button type=\"submit\" ");
      out.print(etat );
      out.write(" class=\"btn btn-primary btn-block btn-flat\">se connecter</button>\n");
      out.write("            </div><!-- /.col -->\n");
      out.write("          \n");
      out.write("         \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("         <div class=\"row\">\n");
      out.write("         <div class=\"col-xs-7\">\n");
      out.write("            \n");
      out.write("            </div><!-- /.col -->\n");
      out.write("            <div class=\"col-xs-6\">\n");
      out.write("           <a href=\"register.jsp\" class=\"text-center\"><button class=\"btn btn-primary \">S'inscrire </button></a>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("      </div><!-- /.login-box-body -->\n");
      out.write("      \n");
      out.write("    </div><!-- /.login-box -->\n");
      out.write("\n");
      out.write("    <!-- jQuery 2.1.4 -->\n");
      out.write("    <script src=\"plugins/jQuery/jQuery-2.1.4.min.js\"></script>\n");
      out.write("    <!-- Bootstrap 3.3.5 -->\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <script src=\"plugins/iCheck/icheck.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      $(function () {\n");
      out.write("        $('input').iCheck({\n");
      out.write("          checkboxClass: 'icheckbox_square-blue',\n");
      out.write("          radioClass: 'iradio_square-blue',\n");
      out.write("          increaseArea: '20%' // optional\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
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
