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

public final class controlesidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("      <!-- Control Sidebar -->\n");
      out.write("      <aside class=\"control-sidebar control-sidebar-dark\">\n");
      out.write("        <!-- Create the tabs -->\n");
      out.write("        <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\n");
      out.write("          <li><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\n");
      out.write("          <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- Tab panes -->\n");
      out.write("        <div class=\"tab-content\">\n");
      out.write("          <!-- Home tab content -->\n");
      out.write("          <div class=\"tab-pane\" id=\"control-sidebar-home-tab\">\n");
      out.write("            <h3 class=\"control-sidebar-heading\">Recent Activity</h3>\n");
      out.write("            <ul class=\"control-sidebar-menu\">\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <i class=\"menu-icon fa fa-birthday-cake bg-red\"></i>\n");
      out.write("                  <div class=\"menu-info\">\n");
      out.write("                    <h4 class=\"control-sidebar-subheading\">Langdon's Birthday</h4>\n");
      out.write("                    <p>Will be 23 on April 24th</p>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <i class=\"menu-icon fa fa-user bg-yellow\"></i>\n");
      out.write("                  <div class=\"menu-info\">\n");
      out.write("                    <h4 class=\"control-sidebar-subheading\">Frodo Updated His Profile</h4>\n");
      out.write("                    <p>New phone +1(800)555-1234</p>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <i class=\"menu-icon fa fa-envelope-o bg-light-blue\"></i>\n");
      out.write("                  <div class=\"menu-info\">\n");
      out.write("                    <h4 class=\"control-sidebar-subheading\">Nora Joined Mailing List</h4>\n");
      out.write("                    <p>nora@example.com</p>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <i class=\"menu-icon fa fa-file-code-o bg-green\"></i>\n");
      out.write("                  <div class=\"menu-info\">\n");
      out.write("                    <h4 class=\"control-sidebar-subheading\">Cron Job 254 Executed</h4>\n");
      out.write("                    <p>Execution time 5 seconds</p>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul><!-- /.control-sidebar-menu -->\n");
      out.write("\n");
      out.write("            <h3 class=\"control-sidebar-heading\">Tasks Progress</h3>\n");
      out.write("            <ul class=\"control-sidebar-menu\">\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                    Custom Template Design\n");
      out.write("                    <span class=\"label label-danger pull-right\">70%</span>\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"progress progress-xxs\">\n");
      out.write("                    <div class=\"progress-bar progress-bar-danger\" style=\"width: 70%\"></div>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                    Update Resume\n");
      out.write("                    <span class=\"label label-success pull-right\">95%</span>\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"progress progress-xxs\">\n");
      out.write("                    <div class=\"progress-bar progress-bar-success\" style=\"width: 95%\"></div>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                    Laravel Integration\n");
      out.write("                    <span class=\"label label-warning pull-right\">50%</span>\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"progress progress-xxs\">\n");
      out.write("                    <div class=\"progress-bar progress-bar-warning\" style=\"width: 50%\"></div>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"javascript::;\">\n");
      out.write("                  <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                    Back End Framework\n");
      out.write("                    <span class=\"label label-primary pull-right\">68%</span>\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"progress progress-xxs\">\n");
      out.write("                    <div class=\"progress-bar progress-bar-primary\" style=\"width: 68%\"></div>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul><!-- /.control-sidebar-menu -->\n");
      out.write("\n");
      out.write("          </div><!-- /.tab-pane -->\n");
      out.write("          <!-- Stats tab content -->\n");
      out.write("          <div class=\"tab-pane\" id=\"control-sidebar-stats-tab\">Stats Tab Content</div><!-- /.tab-pane -->\n");
      out.write("          <!-- Settings tab content -->\n");
      out.write("          <div class=\"tab-pane\" id=\"control-sidebar-settings-tab\">\n");
      out.write("            <form method=\"post\">\n");
      out.write("              <h3 class=\"control-sidebar-heading\">General Settings</h3>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Report panel usage\n");
      out.write("                  <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                </label>\n");
      out.write("                <p>\n");
      out.write("                  Some information about this general settings option\n");
      out.write("                </p>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Allow mail redirect\n");
      out.write("                  <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                </label>\n");
      out.write("                <p>\n");
      out.write("                  Other sets of options are available\n");
      out.write("                </p>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Expose author name in posts\n");
      out.write("                  <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                </label>\n");
      out.write("                <p>\n");
      out.write("                  Allow the user to show his name in blog posts\n");
      out.write("                </p>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("\n");
      out.write("              <h3 class=\"control-sidebar-heading\">Chat Settings</h3>\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Show me as online\n");
      out.write("                  <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                </label>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Turn off notifications\n");
      out.write("                  <input type=\"checkbox\" class=\"pull-right\">\n");
      out.write("                </label>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-sidebar-subheading\">\n");
      out.write("                  Delete chat history\n");
      out.write("                  <a href=\"javascript::;\" class=\"text-red pull-right\"><i class=\"fa fa-trash-o\"></i></a>\n");
      out.write("                </label>\n");
      out.write("              </div><!-- /.form-group -->\n");
      out.write("            </form>\n");
      out.write("          </div><!-- /.tab-pane -->\n");
      out.write("        </div>\n");
      out.write("      </aside><!-- /.control-sidebar -->\n");
      out.write("      <!-- Add the sidebar's background. This div must be placed\n");
      out.write("           immediately after the control sidebar -->\n");
      out.write("      <div class=\"control-sidebar-bg\"></div>\n");
      out.write("    </div><!-- ./wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery 2.1.4 -->\n");
      out.write("    <script src=\"../../plugins/jQuery/jQuery-2.1.4.min.js\"></script>\n");
      out.write("    <!-- Bootstrap 3.3.5 -->\n");
      out.write("    <script src=\"../../bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- DataTables -->\n");
      out.write("    <script src=\"../../plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"../../plugins/datatables/dataTables.bootstrap.min.js\"></script>\n");
      out.write("    <!-- SlimScroll -->\n");
      out.write("    <script src=\"../../plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("    <!-- FastClick -->\n");
      out.write("    <script src=\"../../plugins/fastclick/fastclick.min.js\"></script>\n");
      out.write("    <!-- AdminLTE App -->\n");
      out.write("    <script src=\"../../dist/js/app.min.js\"></script>\n");
      out.write("    <!-- AdminLTE for demo purposes -->\n");
      out.write("    <script src=\"../../dist/js/demo.js\"></script>\n");
      out.write("    <!-- page script -->\n");
      out.write("    <script>\n");
      out.write("      $(function () {\n");
      out.write("        $(\"#example1\").DataTable();\n");
      out.write("        $('#example2').DataTable({\n");
      out.write("          \"paging\": true,\n");
      out.write("          \"lengthChange\": false,\n");
      out.write("          \"searching\": false,\n");
      out.write("          \"ordering\": true,\n");
      out.write("          \"info\": true,\n");
      out.write("          \"autoWidth\": false\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
