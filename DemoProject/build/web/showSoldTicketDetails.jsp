

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
        <title>Show Time</title>
        <link rel="stylesheet" href="styles/myStyle.css">
        <style>
            body {
                background-image: url("images/cine_bodyBG.jpg");
                background-position: center 0;
                backface-visibility: visible;
                background-color: #030202!important;
                background-repeat: no-repeat;
            }
        </style>

    </head>
    <body>
        
        <div class= "dv">
            <h1 style="text-align: center">Schedule</h1>
            <table>
                <tr>
                    <th>Ticket Id</th>
                    <th>User Email</th>
                    <th>Movie Name</th>
                    <th>Show Time</th>
                    <th>Show Date </th>
                    <th>Seat No</th>
                    <th>Ticket Price</th>
                </tr>
                <%try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cineplex_database", "root", "");
                        statement = con.createStatement();
                        String query ="select * from ticket_details inner join time_slot "
                                + "on ticket_details.time_slot_id = time_slot.time_slot_id";
                        System.out.println(query);
                        resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                %>
                <tr bgcolor="#DEB887">

                    <td><%=resultSet.getString("ticket_id")%></td>
                    <td><%=resultSet.getString("user_email")%></td>
                    <td><%=resultSet.getString("movie_name")%></td>
                    <td><%=resultSet.getString("start_time")%></td>
                    <td><%=resultSet.getString("show_date")%></td>
                    <td><%=resultSet.getString("seat_no")%></td>
                    <td><%=resultSet.getString("ticket_price")%></td>
                </tr>
                <%
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>
            </table>
            <p style="margin-left:450px"><a href='index.jsp'>Home</a></p>
            <p style="margin-left:450px"><a href='addMovieAdmin.jsp'>Add Movie details</a></p>
        </div>
    </body>
</html>
