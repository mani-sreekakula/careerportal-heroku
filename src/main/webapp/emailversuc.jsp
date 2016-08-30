<%-- 
    Document   : emailversuc
    Created on : Jul 2, 2012, 4:30:46 PM
    Author     : manikanta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<%@taglib  uri="/struts-tags" prefix="s" %>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <%
                     response.setDateHeader("Expires", 0);
                     response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
                     response.addHeader("Cache-Control", "post-check=0, pre-check=0");
                     response.setHeader("Pragma", "no-cache");
         %>
        <title> Career Portal</title>

    </head>

    <body>

        <div id=header>
            <a href="http://www.sysbiz.com"><img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/></a>

        </div>
        <div id=navigation>
            <center>
                <ul>

                    <li><a  href="HomePage.jsp"><h3>Home</h3></a></li>
                    <li><a href="http://www.sysbiz.net/web/guest/vision-mission-values"><h3>About Us</h3></a></li>
                    <li><a href="http://www.sysbiz.net/web/guest/life-sciences_pharmaceuticals_device-manufacturers1"><h3>Services</h3></a></li>
                    <li><a href="HomePage.jsp"><h3>Careers</h3></a></li>
                    <li><a href="http://www.sysbiz.com/web/guest/contact-us"><h3>Contact Us</h3></a></li>
                </ul>
            </center>

        </div>


        <div id=menu>
            
 

        </div>
        <div id=menu1>
            <marquee behaviour="scroll" direction="up" height="624" position="fixed" onmouseout="this.start()" scrolldelay="100">
                <img src="images/page1-img3.jpg" width="190" height="156" alt="page1-img3"/>
                <img src="images/page4-img1.jpg" width="190" height="156" alt="page4-img1"/>
                <img src="images/page4-img6.jpg" width="190" height="156" alt="page4-img6"/>
                <img src="images/slider-2.jpg" width="190" height="156" alt="slider-2"/>
            </marquee>
        </div>
        <div id=content_area>
          
            <h2><b> Your Email has been verified. To login click on Home</b></h2>


          
        </div>

        <div id=footer>
            <center>
                <p>@copyright2012<br>
                        Sysbiz Technologies Pvt. Ltd.
            </center>
        </div>

    </body>

</html>

