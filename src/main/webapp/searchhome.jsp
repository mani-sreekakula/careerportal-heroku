<%-- 
    Document   : searchhome
    Created on : Jun 26, 2012, 4:30:47 PM
    Author     : avinashkumar
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
        <!-- Now we will divide the webpage into different sections using division (<div>) tag  while definning " id="" " in them-->

        <div id=header>
            <a href="http://www.sysbiz.com"><img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/></a>

        </div>
        <div id=navigation>
            <center>
                <ul>
                    
                    <li><a href="loginHome1.action"><h3>Home</h3></a></li>
                    <li><a href="PostJob.action"><h3>Post Job</h3></a></li>
                    <li><a href="jobPost.action"><h3>View Job</h3></a></li>
                    <li><a href="SearchHome.action"><h3>Search</h3></a></li>  &nbsp;&nbsp;&nbsp;
                    <li><a href="logoutAction.action"><h3>Logout</h3></a></li>

                </ul>
            </center>

        </div>

        <div id=menu><h3> Welcome <s:property value="#session.aname"/></h3>
           
        

                </div>
        <div id=menu1>
           
        </div>
        <div id=content_area>
            <center>
                <h3>Search Category</h3><br><br>
                <a href="showallusers.action"> View All Users</a><br><br><br>
                <a href="SearchJobPos.action"> Search By Job Role</a> <br><br><br><br>
                <a href="SearchExperience.action">Search By Experience</a>
                
            </center>
        </div>

        <div id=footer>
            <center>
                <p>@copyright 2012<br>
                    Sysbiz Technologies Pvt. Ltd.</p>
            </center>
        </div>

    </body>

</html>

