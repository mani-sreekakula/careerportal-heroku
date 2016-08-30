<%-- 
    Document   : showfetch
    Created on : Jun 21, 2012, 10:26:07 PM
    Author     : manikanta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<link rel="stylesheet" type="text/css" href="css/displaytag.css" />


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


        <script type="text/javascript">
           
          
        </script>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link rel="stylesheet" type="text/css" href="css/displaytag.css" />

        <title>JSP Page</title>
    </head>
    <body>
        <div id=header>
            <a href="http://www.sysbiz.com"><img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/></a>
        </div> 

        <div id=navigation>
            <center>
                <ul>

                    &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;

                    <li><a  href="loginHome1.action"><h3>Home</h3></a></li>
                    <li><a href="PostJob.action"><h3>Post Job</h3></a></li>
                    <li><a href="jobPost.action"><h3>View Job</h3></a></li>
                    <li><a href="SearchHome.action"><h3>Search</h3></a></li>
                    <li><a href="logoutAction.action"><h3>Logout</h3></a></li>
                </ul>
            </center>
        </div>

        <div id=content><h3> Welcome <s:property value="#session.aname"/></h3> 
            <center>

                <h1>JOB DETAILS:</h1>

                <display:table class="displayTable" export="false" id="data" name="list1" requestURI="/jobPost.action" pagesize="5">
                    <display:column sortable="true" property="jobPostDate"  title="Job Post Date" />                 
                    <display:column sortable="true" property="jobRole"  title="Job Role" />
                    <display:column property="educationQualification" sortable="true" title="Qualification" />
                    <display:column property="experience" sortable="true"  title="Experience"/>                 
                    <display:column property="jobLocation" sortable="true"  title="Location"/>
                    <display:column property="skills" sortable="true" title="Skills"/>                        
                    <display:column title="More" value="Details" paramId="jobid" paramProperty="jobid" href="moredetails.action"/>
                    <display:column title="Delete Jobs" value="Delete" paramId="jobid" paramProperty="jobid" href="DeleteJob.action">

                    </display:column>
                </display:table>
            </center>
        </div>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>

        <div id=footer>
            <center>
                <p>@copyright2012<br>
                    Sysbiz Technologies Pvt. Ltd.
            </center>
        </div>
    </body>
</html>
