<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    
<head>
    <meta charset="UTF-8">

    <title>Update</title>

    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
    
    <link href="movie_details.css" rel="stylesheet" media="all">
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
    <div>
            <h1>Add Movie Details</h1>
            <form action="addMovieForAdmin" method="get">
                <p>Enter Movie name </p>
                <input type="text" name="movieName">
                <p>Enter show Date</p>
                <input type="text" name="showDate">
                <p>Enter Time Slot id</p>
                <input type="text" name="timeSlotId">
                <p>Enter Total no of seat</p>
                <input type="text" name="totalSeat"><br>
                <input type="submit" value="Submit">
                <p><a href="showSoldTicketDetails.jsp">Show sold ticket details</a></p>
            </form>
    </div>
</body>

   
</html>

