/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.108
 * Generated at: 2021-05-25 16:48:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.model.User;
import java.util.List;
import com.dao.UserDao;

public final class AjouterEtud_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


UserDao um=new UserDao();

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

User u=(User)session.getAttribute("user");

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("      <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("      <div class=\"content-wrapper\">\r\n");
      out.write("        <!-- Content Header (Page header) -->\r\n");
      out.write("        <section class=\"content-header\">\r\n");
      out.write("          <h1>\r\n");
      out.write("            Etudiants\r\n");
      out.write("            <small>Optional description</small>\r\n");
      out.write("          </h1>\r\n");
      out.write("          <ol class=\"breadcrumb\">\r\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Level</a></li>\r\n");
      out.write("            <li class=\"active\">Here</li>\r\n");
      out.write("          </ol>\r\n");
      out.write("        </section>\r\n");


int id=0;
String nom="";
String log="";
String pass="";

String action="Ajouter";



      out.write("\r\n");
      out.write("        <!-- Main content -->\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Your Page Content Here -->\r\n");
      out.write("         \r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t<div class=\"box box-info\">\r\n");
      out.write("                <div class=\"box-header with-border\">\r\n");
      out.write("                  <h3 class=\"box-title\">Gestion des étudiants</h3>\r\n");
      out.write("                </div><!-- /.box-header -->\r\n");
      out.write("                <!-- form start -->\r\n");
      out.write("                <form class=\"form-horizontal\" action=\"inscription\" method=\"post\">\r\n");
      out.write("                  <div class=\"box-body\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Id</label>\r\n");
      out.write("                      <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"number\" readonly=\"readonly\" value=\"");
      out.print(id );
      out.write("\" name=\"id\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Nom</label>\r\n");
      out.write("                      <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" name=\"nom\"  class=\"form-control\" id=\"inputEmail3\" placeholder=\"Nom\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Login</label>\r\n");
      out.write("                      <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"email\" name=\"log\"  class=\"form-control\" id=\"inputPassword3\" placeholder=\"Email\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                     <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Mot de Passe</label>\r\n");
      out.write("                      <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"password\" name=\"pass\"  class=\"form-control\" id=\"inputPassword3\" placeholder=\"mot de passe\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("            \r\n");
      out.write("                  </div><!-- /.box-body -->\r\n");
      out.write("                  <div class=\"box-footer\">\r\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-default\">Annuler</button>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-info pull-right\" name=\"action\" value=\"");
      out.print(action );
      out.write("\">Ajouter</button>\r\n");
      out.write("                  </div><!-- /.box-footer -->\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("        </section><!-- /.content -->\r\n");
      out.write("      </div><!-- /.content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("      <!-- Main Footer -->\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "controlesidebar.jsp", out, false);
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
