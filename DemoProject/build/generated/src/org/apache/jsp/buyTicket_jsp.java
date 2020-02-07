package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.paramValueType;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class buyTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Ticket</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/myStyle.css\">\n");
      out.write("       <style>\n");
      out.write("            body{background-image: url(\"images/cine_bodyBG.jpg\");font-family: cursive;background-color: #f5f5f5}\n");
      out.write("            div{width: 400px;margin: 0px auto;box-shadow: 0px 1px 10px #a8a8a8;background-color: #fff;padding-bottom: 10px}\n");
      out.write("            h1{background-color: #34cbd1;text-align: center;margin-top: 0;padding: 20px;color: #fff}\n");
      out.write("            input{display: block; margin:auto; font-size: 20px}\n");
      out.write("            p{text-align: center;font-size: 20px;color: #82a28a;}\n");
      out.write("            input{width: 70%;border: 1px solid #34cbd1;background-color: #fff;outline: none;border-radius: 5px;height:40px;padding: 10px}\n");
      out.write("            input[type=\"submit\"]:hover{background-color: #54b0bc;border: 0}\n");
      out.write("            input[type=\"submit\"]{background-color: #34cbd1;color: #fff;cursor: pointer}\n");
      out.write("            a{padding: 5px; border-radius: 3px; background-color: #c0eb30;text-decoration: none;display: inline-block;color: #000;}\n");
      out.write("            a:hover{color: #fff; background-color: #4cce56;transition: all 0.3s}\n");
      out.write("        </style>   \n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            session = request.getSession(false);
            System.out.println(session);
            if (session != null) {
                if (session.getAttribute("name") != null) {
      out.write("\n");
      out.write("        <form action=\"ticketServlet\" method=\"GET\">\n");
      out.write("            <div>\n");
      out.write("                <h1 style=\"text-align: center\">Buy Tickets</h1>\n");
      out.write("\n");
      out.write("                <h2>Movie Name</h2>\n");
      out.write("                <select name=\"movie\" id=\"movie\" onchange=\"this.form.reload();\" >\n");
      out.write("                    ");
try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineplex_database", "root", "");
                        statement = con.createStatement();
                        String query = "select distinct movie_name from show_details";
                        System.out.println(query);
                        resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print( resultSet.getString("movie_name"));
      out.write('"');
      out.write('>');
      out.print( resultSet.getString("movie_name"));
      out.write("</option>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     ");

                         
                         
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
      out.write("\n");
      out.write("                </select>\n");
      out.write("                \n");
      out.write("                   \n");
      out.write("                \n");
      out.write("                <h2>Show Time</h2>\n");
      out.write("                <select name=\"time\">\n");
      out.write("                    <option value=\"1\">11:30 am</option>\n");
      out.write("                    <option value=\"2\">2:00 pm</option>\n");
      out.write("                    <option value=\"3\">4:30 pm</option>\n");
      out.write("                    </select>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <h2>Date</h2>\n");
      out.write("                <select name=\"date\">\n");
      out.write("                    ");
try {
                        //System.out.println(s);
                        
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineplex_database", "root", "");
                        
                        String query = "select distinct show_date from show_details";
                        PreparedStatement psmt =con.prepareStatement(query);
                      //  psmt.setString(1, (String)request.getParameter("movie"));
                        
                        ResultSet rs = psmt.executeQuery();
                        
                        while (rs.next()) {
                
      out.write("\n");
      out.write("                \n");
      out.write("                    <option value=\"");
      out.print( rs.getString("show_date"));
      out.write('"');
      out.write('>');
      out.print( rs.getString("show_date"));
      out.write("</option>\n");
      out.write("                     ");

                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
      out.write("\n");
      out.write("                </select>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <h2>Number of Ticket</h2>\n");
      out.write("                <input type =\"number\" name=\"num_ticket\" min=\"1\" max =\"4\" >\n");
      out.write("                <input type=\"submit\"  value=\"submit\" style=\"margin-left:80px\">\n");
      out.write("               ");
 out.println("<p><a href='index.jsp'>Home</a></p>");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
} else {
           
            out.println("<style>");
            out.println("body{background-image: url(\"images/cine_bodyBG.jpg\");font-family: cursive;background-color: #f5f5f5}");
            out.println("div{width: 400px;margin: 0px auto;box-shadow: 0px 1px 10px #a8a8a8;background-color: #fff;padding-bottom: 10px;position: absolute;top: 50%;left: 50%;transform: translate(-50%,-50%)}");
            out.println("h1{background-color: #34cbd1;text-align: center;margin-top: 0;padding: 20px;color: #fff}");
            out.println("p{text-align: center;font-size: 20px;color: #6a595b;}");
            out.println("</style>");
            out.println("<div>");
            out.println(" <h1>Login First!</h1>");
            out.println("<p><a href='loginPage.jsp'>Login to buy ticket</a></p>");
            out.println("<p><a href='register.html'>New here? Click here to register<a></p>");
            out.println("<p><a href='index.jsp'>Home</a></p>");
            out.println("</div>");
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
}
            }
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
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
