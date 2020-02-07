
<%@ page import ="java.io.*,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Home | Movie Theatre Website</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="styles/myStyle.css">

        <style>
            body {
                background-image: url("images/cine_bodyBG.jpg");
                background-position: center 0;
                backface-visibility: visible;
                background-color: #030202!important;
                background-repeat: no-repeat;

            }
            button[type=submit] {
                width: 100%;
                background-color: white;
                color: Black;
                padding: 14px 20px;
                margin: 2px 2px;
                border: none;
                max-width: 220px;
                border-radius: 4px;
                display:block;
                cursor: pointer;
            }
            button[type=submit]:hover {
                background-color: DeepSkyBlue;
            }
        </style>
    </head>
    <body>
        <ul>
            <li><a class="active" href="index.jsp">Home</a></li>
            <li><a href="showtime.jsp">Show Time</a></li>
            <li><a href="ticket.jsp">Ticket Price</a></li>
            <li><a href="concession.jsp">Concession</a></li>
            
            <li><a href="about.jsp">About Movie Theatre</a></li>
            <li><a href="contact.jsp">Contact</a></li>
            <li><a href="loginPageAdmin.jsp">Admin Panel</a></li>
        </ul>

        </br>		
        </br>

        <div class="slideshow-container">
            <div class="mySlides fade">
                <div class="numbertext">1 / 5</div>
                <img src="images/endgam.jpg" style="width:100%; height:410px;">
                <div class="carousel-caption">
                    <h2> Avengers Endgame</h2>
                </div>
            </div>
            <div class="mySlides fade">
                <div class="numbertext">2 / 5</div>
                <img src="images/X-men.jpg" style="width:100%; height:410px;">
                <div class="carousel-caption"><h2>Dark Phoenix</h2></div>
            </div>
            <div class="mySlides fade">
                <div class="numbertext">3 / 5</div>
                <img src="images/durgeshh.jpg" style="width:100%; height:410px;">
                <div class="carousel-caption"><h2>Durgeshgorer Guptodhon</h2></div>
            </div>
            <div class="mySlides fade">
                <div class="numbertext">4 / 4</div>
                <img src="images/fast.jpg" style="width:100%; height:410px;">
                <div class="carousel-caption"><h2>Fast & Furious Presents: Hobbs & Shaw</h2></div>
            </div>
            <div class="mySlides fade">
                <div class="numbertext">5 / 5</div>
                <img src="images/spiderman.jpg" style="width:100%; height:410px;">
                <div class="carousel-caption"><h2>Spider-Man: Far From Home</h2></div>
            </div>

        </div>
        <br>

        <div style="text-align:center">
            <span class="dot"></span> 
            <span class="dot"></span> 
            <span class="dot"></span>
            <span class="dot"></span>
            <span class="dot"></span>
        </div>

        </br>

        <script src="myScript.js"></script>
        <div class="homes">
            <div>
                <nav>
                    <%
                        session = request.getSession(false);
                        System.out.println(session);
                        if (session != null) {
                            if (session.getAttribute("name") != null) {%>
                    <h4>Welcome 
                        <%
                            String name = (String) session.getAttribute("name");
                            out.print(name);
                        %>
                    </h4>
                    <form action="logoutController" method="post">
                        <input type ="submit" value= "logout">
                    </form>
                    <%} else {%>
                    <a href="loginPage.jsp">Login to buy ticket.</a>
                    </br>
                    </br>
                    <a href="register.jsp">New here? Click here to register.</a>                           
                    <%}
                        }%>

                </nav>
            </div>
            <article>

                <ul style="margin-left:0px;">
                    <li class="active"><a data-toggle="tab" href="#sectionA">Now Showing</a></li>
                    <li><a data-toggle="tab" href="buyTicket.jsp">Buy Ticket</a></li>
                    <li><a data-toggle="tab" href="#sectionB">Coming Soon</a></li>
                    <li><a data-toggle="tab" href="#sectionC">Trailers</a></li>
                </ul>
                <div id = "sectionA" style="margin-left:0px" class="dv">
                    <img src="images/endgam.jpg" style="width:100%; height:50%; text-align: center;">
                    <input style="margin-left:35%" type="submit" value="Details" onclick="alert('Avengers Endgame  is Showing Now!!!!!')">

                </div>

                <h2 style="text-align:center">Coming Soon!!!</h2>
                <h4 style="text-align:center">Click Photo To Open In Full Size</h4>

               <div id="sectionB"style="margin-left:0px" class="dv">
                <div class="row">
                    <div class="column">
                        <img src="images/Gemini Man.jpg" style="width:100%" onclick="openModal();currentSlide(1)" class="hover-shadow cursor">
                    </div>
                    <div class="column">
                        <img src="images/terminatorr.jpg" style="width:100%" onclick="openModal();currentSlide(2)" class="hover-shadow cursor">
                    </div>
                    <div class="column">
                        <img src="images/froz.jpg" style="width:100%" onclick="openModal();currentSlide(3)" class="hover-shadow cursor">
                    </div>
                    <div class="column">
                        <img src="images/marjavan.jpg" style="width:100%" onclick="openModal();currentSlide(4)" class="hover-shadow cursor">
                    </div>
                </div>

                </br>

                <div class="row">
                    <div class="column">
                        <img src="images/star.jpg" style="width:100%" onclick="openModal();currentSlide(5)" class="hover-shadow cursor">
                    </div>
                    <div class="column">
                        <img src="images/war.jpg" style="width:100%" onclick="openModal();currentSlide(6)" class="hover-shadow cursor">
                    </div>
                    <div class="column">
                        <img src="images/zoombie.jpg" style="width:100%" onclick="openModal();currentSlide(7)" class="hover-shadow cursor">
                    </div>
                    <div class="column">
                        <img src="images/midway.jpg" style="width:100%" onclick="openModal();currentSlide(8)" class="hover-shadow cursor">
                    </div>
                </div>
                </div>

                <div id="myModal" class="modal">
                    <span class="close cursor" onclick="closeModal()">&times;</span>
                    <div class="modal-content">

                        <div class="myGallerySlides">
                            <div class="numbertext">1 / 8</div>
                            <img src="images/Gemini Man.jpg" style="width:100%">
                        </div>

                        <div class="myGallerySlides">
                            <div class="numbertext">2 / 8</div>
                            <img src="images/terminatorr.jpg" style="width:100%">
                        </div>

                        <div class="myGallerySlides">
                            <div class="numbertext">3 / 8</div>
                            <img src="images/froz.jpg" style="width:100%">
                        </div>
                        <div class="myGallerySlides">
                            <div class="numbertext">4 / 8</div>
                            <img src="images/marjavan.jpg" style="width:100%">
                        </div>
                        <div class="myGallerySlides">
                            <div class="numbertext">5 / 8</div>
                            <img src="images/star.jpg" style="width:100%">
                        </div>
                        <div class="myGallerySlides">
                            <div class="numbertext">6 / 8</div>
                            <img src="images/war.jpg" style="width:100%">
                        </div>
                        <div class="myGallerySlides">
                            <div class="numbertext">7 / 8</div>
                            <img src="images/zoombie.jpg" style="width:100%">
                        </div>
                        <div class="myGallerySlides">
                            <div class="numbertext">8 / 8</div>
                            <img src="images/midway.jpg" style="width:100%">
                        </div>


                        <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
                        <a class="next" onclick="plusSlides(1)">&#10095;</a>

                        <div class="caption-container">
                            <p id="caption"></p>
                        </div>


                        
                    </div>
                </div>

                </br>
                </br>
                <div id="sectionC"style="margin-left:0px" class="dv">
                <h2 style="text-align:center">Now Showing - Trailers</h2>
                <h4 style="text-align:center">View Full Size To Have Better Resolution</h4>

                <div class="row">
                    <div class="column">
                        <video width="100%" controls>
                            <source src="video/avengers.mp4" type="video/mp4">
                            Your browser does not support HTML5 video.
                        </video>

                        <p>
                            Video courtesy of 
                            <a href="https://www.youtube.com/" target="_blank">YouTube</a>.
                        </p>
                    </div>

                    <div class="column">
                        <video width="100%" controls>
                            <source src="video/dark.mp4" type="video/mp4">
                            Your browser does not support HTML5 video.
                        </video>

                        <p>
                            Video courtesy of 
                            <a href="https://www.youtube.com/" target="_blank">YouTube</a>.
                        </p>
                    </div>

                    <div class="column">
                        <video width="100%" controls>
                            <source src="video/hobs.mp4" type="video/mp4">
                            Your browser does not support HTML5 video.
                        </video>

                        <p>
                            Video courtesy of 
                            <a href="https://www.youtube.com/" target="_blank">YouTube</a>.
                        </p>
                    </div>

                    <div class="column">
                        <video width="100%" controls>
                            <source src="video/spider.mp4" type="video/mp4">
                            Your browser does not support HTML5 video.
                        </video>

                        <p>
                            Video courtesy of 
                            <a href="https://www.youtube.com/" target="_blank">YouTube</a>.
                        </p>
                    </div>
                </div>
                </div>

            </article>
        </div>

        <footer>
            
        </footer>
    </body>
</html>
