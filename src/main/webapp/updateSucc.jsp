<%-- 
    Document   : updateSucc
    Created on : Jun 26, 2012, 7:08:38 PM
    Author     : alokkumar
--%>
<%@taglib  uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <%
                     response.setDateHeader("Expires", 0);
                     response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
                     response.addHeader("Cache-Control", "post-check=0, pre-check=0");
                     response.setHeader("Pragma", "no-cache");
         %>
        <title>JSP Page</title>
    </head>
    <body>
        
        <div id="header">
<a href="http://www.sysbiz.com"><img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/></a>
        </div>

        <div id="navigation">
<center>
                <ul>
                    <li><a href="uloginsuccess.jsp"><h3>Home</h3></a></li>
                    <li><a href="fetchPersonal.action"><h3>Personal</h3></a></li>
                    <li><a href="fetchedu.action"><h3>Educational</h3></a></li>
                    <li><a href="fetchskills.action"><h3>Skills</h3></a></li>
                    <li><a href="JobSearch.action"><h3>Job Search</h3></a></li>&nbsp;&nbsp;&nbsp;&nbsp;
                    <li><a href=" ManageAcc.action"><h3>ChangePassword</h3></a></li>
                    <li><a href="logoutAction.action"><h3>Logout</h3></a></li>
                </ul>
            </center>
        </div>
        <div id="content_area">



        
        <h3> User Records Successfully Updated</h3>
        <a href="fetchPersonal.action"><h3>Back</h3></a>

        </div>
         <div id="footer">
            <center>
               <p>@copyright2012<br>
                        Sysbiz Technologies Pvt. Ltd.
            </center>
        </div>
    </body>
</html>
