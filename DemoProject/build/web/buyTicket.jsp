
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.paramValueType"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
    String driverName = "com.mysql.jdbc.Driver";

    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

%>

<html>
    <head>
        <title>Ticket</title>
        <link rel="stylesheet" href="styles/myStyle.css">
       <style>
            body{background-image: url("images/cine_bodyBG.jpg");font-family: cursive;background-color: #f5f5f5}
            div{width: 400px;margin: 0px auto;box-shadow: 0px 1px 10px #a8a8a8;background-color: #fff;padding-bottom: 10px}
            h1{background-color: #34cbd1;text-align: center;margin-top: 0;padding: 20px;color: #fff}
            input{display: block; margin:auto; font-size: 20px}
            p{text-align: center;font-size: 20px;color: #82a28a;}
            input{width: 70%;border: 1px solid #34cbd1;background-color: #fff;outline: none;border-radius: 5px;height:40px;padding: 10px}
            input[type="submit"]:hover{background-color: #54b0bc;border: 0}
            input[type="submit"]{background-color: #34cbd1;color: #fff;cursor: pointer}
            a{padding: 5px; border-radius: 3px; background-color: #c0eb30;text-decoration: none;display: inline-block;color: #000;}
            a:hover{color: #fff; background-color: #4cce56;transition: all 0.3s}
        </style>   

      

    </head>
    <body>

        <%
            session = request.getSession(false);
            System.out.println(session);
            if (session != null) {
                if (session.getAttribute("name") != null) {%>
        <form action="ticketServlet" method="GET">
            <div>
                <h1 style="text-align: center">Buy Tickets</h1>

                <h2>Movie Name</h2>
                <select name="movie" id="movie" onchange="this.form.reload();" >
                    <%try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineplex_database", "root", "");
                        statement = con.createStatement();
                        String query = "select distinct movie_name from show_details";
                        System.out.println(query);
                        resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                %>
                <option value="<%= resultSet.getString("movie_name")%>"><%= resultSet.getString("movie_name")%></option>
                    
                    
                     <%
                         
                         
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>
                </select>
                
                   
                
                <h2>Show Time</h2>
                <select name="time">
                    <option value="1">11:30 am</option>
                    <option value="2">2:00 pm</option>
                    <option value="3">4:30 pm</option>
                    </select>
                

                <h2>Date</h2>
                <select name="date">
                    <%try {
                        //System.out.println(s);
                        
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineplex_database", "root", "");
                        
                        String query = "select distinct show_date from show_details";
                        PreparedStatement psmt =con.prepareStatement(query);
                      //  psmt.setString(1, (String)request.getParameter("movie"));
                        
                        ResultSet rs = psmt.executeQuery();
                        
                        while (rs.next()) {
                %>
                
                    <option value="<%= rs.getString("show_date")%>"><%= rs.getString("show_date")%></option>
                     <%
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>
                </select>
                
               
                <h2>Number of Ticket</h2>
                <input type ="number" name="num_ticket" min="1" max ="4" >
                <input type="submit"  value="submit" style="margin-left:80px">
               <% out.println("<p><a href='index.jsp'>Home</a></p>");%>
            </div>
        </form>


        <%} else {
           
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
        %>

        <%}
            }%>
    </body>
    
</html>
