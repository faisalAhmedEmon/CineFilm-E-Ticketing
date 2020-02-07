package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Registration Page</title>\n");
      out.write("        <style>\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1>Register</h1>\n");
      out.write("            <form action=\"register\" method=\"get\">\n");
      out.write("                <p>Enter your name</p>\n");
      out.write("                 <input type=\"text\" name=\"name\">\n");
      out.write("                <p>Enter your email</p>\n");
      out.write("\n");
      out.write("                <input  name=\"email\" type=\"email\"  title=\" (format: xxx@xxx.xxx)\" \n");
      out.write("                 pattern=\"[a-zA-Z0-9!#$%&amp;'*+\\/=?^_`{|}~.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\">\n");
      out.write("                <p>Enter your password</p>\n");
      out.write("                <input type=\"password\" name=\"pass\" pattern=\".{6,}\" title=\"Six or more characters\">\n");
      out.write("                <p>Enter your mobile number</p>\n");
      out.write("               <input type=\"tel\" name=\"mob\" pattern=\"[0-9]{11}\" required><br>\n");
      out.write("                <input type=\"submit\" value=\"Submit\">\n");
      out.write("                <p><a href=\"index.jsp\">Home</a></p>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
