/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class AddMovieForAdmin extends HttpServlet {

   
    @Override
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        /* Html design for Registration */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Register</title>");
        out.println("<style>");
        out.println("body{background-image: url(\"images/cine_bodyBG.jpg\");font-family: cursive;background-color: #f5f5f5}");
        out.println("div{width: 400px;margin: 0px auto;box-shadow: 0px 1px 10px #a8a8a8;background-color: #fff;padding-bottom: 10px;position: absolute;top: 50%;left: 50%;transform: translate(-50%,-50%)}");
        out.println("h1{background-color: #34cbd1;text-align: center;margin-top: 0;padding: 20px;color: #fff}");
        out.println("p{text-align: center;font-size: 20px;color: #6a595b;}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div>");
        
         /* get data from form */
        String movieName = request.getParameter("movieName");
        String showDate = request.getParameter("showDate");
        String timeSlotId = request.getParameter("timeSlotId");
        String totalSeat = request.getParameter("totalSeat");
        Connection con = null;
        try {
             /* add jdbc driver*/
            Class.forName("com.mysql.jdbc.Driver");
             /* connect with desired database*/
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineplex_database", "root", "");
             /* query statement for database */
            PreparedStatement ps = con.prepareStatement("insert into show_details values(?,?,?,?)");
            ps.setString(1, movieName);
            ps.setString(2, showDate);
            ps.setString(3, timeSlotId);
            ps.setString(4, totalSeat);
             /* execute query*/
            int count = ps.executeUpdate();
             /* check query result */
            if (count == 0) {
                out.println("<h1 style='background-color: #eb1616'>Registration Failed</h1>");
            } else {
                out.println("<h1>Movie Add sucessfull</h1>");
            }
            
        }
         /* handle Exception */
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                 /* Close Connection with database */
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        out.println("<p><a href='addMovieAdmin.jsp'>Add Another Movie Details</a></p>");
        out.println("<p><a href='showSoldTicketDetails.jsp'>Show Sold Ticket Details</a></p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

        
}


