/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.108
 * Generated at: 2021-05-25 16:45:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.model.User;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

User u=(User)session.getAttribute("user");

      out.write("\n");
      out.write("<!-- Left side column. contains the logo and sidebar -->\n");
      out.write("      <aside class=\"main-sidebar\">\n");
      out.write("\n");
      out.write("        <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("        <section class=\"sidebar\">\n");
      out.write("\n");
      out.write("          <!-- Sidebar user panel (optional) -->\n");
      out.write("          <div class=\"user-panel\">\n");
      out.write("            <div class=\"pull-left image\">\n");
      out.write("              <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pull-left info\">\n");
      out.write("            \n");
      out.write("              <!-- Status -->\n");
      out.write("              <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!-- search form (Optional) -->\n");
      out.write("          <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("              <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("              <span class=\"input-group-btn\">\n");
      out.write("                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("              </span>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("          <!-- /.search form -->\n");
      out.write("\n");
      out.write("          <!-- Sidebar Menu -->\n");
      out.write("          <ul class=\"sidebar-menu\">\n");
      out.write("            <li class=\"header\">HEADER</li>\n");
      out.write("            <!-- Optionally, you can add icons to the links -->\n");
      out.write("            <li class=\"active\"><a href=\"pageEtudiant.jsp\"><i class=\"fa fa-link\"></i> <span>Gestion des ??tudiants</span></a></li>\n");
      out.write("            <li><a href=\"pageCategorie.jsp\"><i class=\"fa fa-link\"></i> <span>Gestion des Categories</span></a></li>\n");
      out.write("            <li >\n");
      out.write("              <a href=\"pageLivre.jsp\"><i class=\"fa fa-link\"></i> <span>Gestion des livres</span> <i class=\"fa fa-angle-left pull-right\"></i></a>\n");
      out.write("              \n");
      out.write("            </li>\n");
      out.write("          </ul><!-- /.sidebar-menu -->\n");
      out.write("        </section>\n");
      out.write("        <!-- /.sidebar -->\n");
      out.write("      </aside>\n");
      out.write("\n");
      out.write("    ");
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
