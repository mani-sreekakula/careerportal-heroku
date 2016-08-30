
<%-- 
    Document   : home2
    Created on : Jun 16, 2012, 6:48:24 PM
    Author     : avinashkumar
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<%@taglib  uri="/struts-tags" prefix="s" %>
<html>
    <title> Career Portal</title>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <%
                     response.setDateHeader("Expires", 0);
                     response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
                     response.addHeader("Cache-Control", "post-check=0, pre-check=0");
                     response.setHeader("Pragma", "no-cache");
         %>

    </head>

    <body>
        <!-- Now we will divide the webpage into different sections using division (<div>) tag  while definning " id="" " in them-->

        <div id=header>
           <a href="http://www.sysbiz.com"><img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/></a>

        </div>
        <div id=navigation>
            <center>
                <ul>
                    
                    <li><a href="loginHome1.action"><h3>Home</h3></a></li>
                    <li><a href="insertJob.jsp"><h3>Post Job</h3></a></li>
                    <li><a href="jobPost.action"><h3>View Job</h3></a></li>
                    <li><a href="SearchHome.action"><h3>Search</h3></a></li>  &nbsp;&nbsp;&nbsp;
                    <li><a href="logoutAction.action"><h3>Logout</h3></a></li>

                </ul>
            </center>

        </div>
   
        <div id=menu><h3> Welcome <s:property value="#session.aname"/></h3>
           
           
        

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
            <p>
                <b> Vision</b><br><br>
                To build an Ecosystem of Creativity and Innovation.<br>
                <br><br><b> Mission </b><br><br>
                To enable people and companies to increase their productivity through the use of Information Technologies.<br>
                <br><br><b>Values </b><br><br>
                
                We believe that our most valuable possession is our People. Sysbiz is not just a gathering of highly skilled individuals, but a family. It is built not only on someone's exceptional skills, but rather on collaboration and teamwork.
<br><br><br>
<b> Ecosystem</b><br><br>
We respect the ecosystem that we live in and do whatever possible to preserve it. We understand the phrase "Software has gone from obscurity to indispensability in less than fifty years" The diversity <br>of our ecosystem helps it to stay resilient.


</p>
        </div>

        <div id=footer>
            <center>
                <p>@copyright 2012<br>
                    Sysbiz Technologies Pvt. Ltd.
            </center>
        </div>

    </body>

</html>

