/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.108
 * Generated at: 2021-05-25 16:48:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.dao.UserDao;

public final class pageEtudiant_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"content-wrapper\">\r\n");
      out.write("                  <h3 class=\"box-title\">Consulter Les étudiants</h3>\r\n");
      out.write("                  <div class=\"box-footer\">\r\n");
      out.write("                    <a href=\"AjouterEtud.jsp\" class=\"text-center\"><button class=\"btn btn-primary \">Ajouter étudiant </button></a>\r\n");
      out.write("                  </div><!-- /.box-footer -->\r\n");
      out.write("       \r\n");
      out.write(" ");
UserDao em=new UserDao(); 
           List<com.model.User> ls1=em.alluser();

      out.write("\r\n");
      out.write("                <div class=\"box-body\">\r\n");
      out.write("                  <table id=\"example1\" class=\"table table-bordered table-striped\">\r\n");
      out.write("                  <thead>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                  <th>Id</th>\r\n");
      out.write("                  <th>Nom</th>\r\n");
      out.write("                  <th>Login</th>\r\n");
      out.write("                  <th>Password</th>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  </thead>\r\n");
      out.write("                    \r\n");
      out.write("                    <tbody>\r\n");
      out.write("                   ");
for (com.model.User e : ls1){ 
      out.write(" \r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td>");
      out.print(e.getId());
      out.write("</td>\r\n");
      out.write("\t\t\t            <td>");
      out.print(e.getNom());
      out.write("</td>\r\n");
      out.write("\t\t\t            <td>");
      out.print(e.getLog());
      out.write("</td>\r\n");
      out.write("\t\t\t            <td>");
      out.print(e.getPass());
      out.write("</td>\r\n");
      out.write("\t\t\t            <td><a href='inscription?id=");
      out.print(e.getId() );
      out.write("'>delete</a></td>\r\n");
      out.write("\t\t\t           \r\n");
      out.write("                        \r\n");
      out.write("                      </tr>\r\n");
      out.write("                      ");
} 
      out.write("\r\n");
      out.write("                   </tbody>\r\n");
      out.write("                  </table>\r\n");
      out.write("                </div><!-- /.box-body -->\r\n");
      out.write("                 </div><!-- ./wrapper -->\r\n");
      out.write("        <!-- Main Footer -->\r\n");
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "controlesidebar.jsp", out, false);
      out.write('\r');
      out.write('\n');
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
