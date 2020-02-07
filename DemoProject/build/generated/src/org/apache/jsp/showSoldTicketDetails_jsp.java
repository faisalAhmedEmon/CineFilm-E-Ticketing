package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class showSoldTicketDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");


    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
    String driverName = "com.mysql.jdbc.Driver";

    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Show Time</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/myStyle.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(\"images/cine_bodyBG.jpg\");\n");
      out.write("                background-position: center 0;\n");
      out.write("                backface-visibility: visible;\n");
      out.write("                background-color: #030202!important;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class= \"dv\">\n");
      out.write("            <h1 style=\"text-align: center\">Schedule</h1>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Ticket Id</th>\n");
      out.write("                    <th>User Email</th>\n");
      out.write("                    <th>Movie Name</th>\n");
      out.write("                    <th>Show Time</th>\n");
      out.write("                    <th>Show Date </th>\n");
      out.write("                    <th>Seat No</th>\n");
      out.write("                    <th>Ticket Price</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineplex_database", "root", "");
                        statement = con.createStatement();
                        String query ="select * from ticket_details inner join time_slot "
                                + "on show_details.time_slot_id = time_slot.time_slot_id";
                        System.out.println(query);
                        resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                
      out.write("\n");
      out.write("                <tr bgcolor=\"#DEB887\">\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(resultSet.getInt("ticket_id"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("user_email"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("movie_name"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("start_time"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("show_date"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getString("seat_no"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(resultSet.getInt("ticket_price"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <p style=\"margin-left:450px\"><a href='index.jsp'>Home</a></p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
