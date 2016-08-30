<%-- 
    Document   : showfetch
    Created on : Jun 21, 2012, 10:26:07 PM
    Author     : manikanta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
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
        <link rel="stylesheet" type="text/css" href="css/styles.css">
        
        <title>JSP Page</title>
    </head>
    <body>
        <div id=header>
            <a href="http://www.sysbiz.com"><img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/></a>
            </div> 
        
        <div id=navigation>
                <center>
                <ul>
                    <li><a href="homepage.jsp"><img src="images/images1.jpeg" width="70" height="40" alt="images1"/></a></li>
                    &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;
                    
                    <li><a  href="adminsuccess.jsp"><h3>Home</h3></a></li>
                    <li><a href="insertJob.jsp"><h3>Post Job</h3></a></li>
                    <li><a href=""><h3>View Job</h3></a></li>
                    <li><a href="searchhome.jsp"><h3>Search</h3></a></li>
                    <li><a href="HomePage.jsp"><h3>Logout</h3></a></li>
                </ul>
            </center>
            </div>
        <div id=content_area>
        <center>
        <h1>Job Detail:</h1>
        <s:form>
            <table align="center" width="2" border="2" cellspacing="1" cellpadding="1">

                <s:iterator value="innerlist">
                    <tr>
                        <td align="center">Job ID:</td>
                        <td align="center"><s:property value="jobid" /></td>
                    </tr>
                    <tr>
                        <td align="center" >Job Post Date:</td>
                        <td align="center"><s:property value="jobPostDate" /></td>
                    </tr>
                    <tr>
                        <td align="center">Job field:</td>
                        <td align="center"><s:property value="jobField" /></td>
                    </tr>
                    <tr>
                        <td align="center">Job Type:</td>
                        <td align="center"><s:property value="jobType" /></td>
                    </tr>
                    <tr>
                        <td align="center">Job Role:</td>
                        <td align="center"><s:property value="jobRole" /></td>
                    </tr>
                    <tr>
                        <td align="center">Qualification:</td>
                        <td align="center"><s:property value="educationQualification" /></td>
                    </tr>
                    <tr>
                        <td align="center">Experience:></td>
                        <td align="center"><s:property value="experience" /></td>
                    </tr>
                    <tr>
                        <td align="center">Year of Passing:</td>
                        <td align="center"><s:property value="yearOfPassing" /></td>
                    </tr>
                    <tr>
                        <td align="center">Job Description:</td>
                        <td align="center"><s:property value="jobDescription" /></td>
                    </tr>
                    <tr>
                        <td align="center">Salary:</td>
                        <td align="center"><s:property value="salaryPay" /></td>
                    </tr>
                    <tr>
                        <td align="center">Location:</td>
                        <td align="center"><s:property value="jobLocation" /></td>
                    </tr>
                    <tr>
                        <td align="center">No. of Vacancies:</td>
                        <td align="center"><s:property value="noOfVacancies" /></td>
                    </tr>
                    <tr>
                        <td align="center">Skills:</td>
                        <td align="center"><s:property value="skills" /></td>
                    </tr>
                    <tr>
                        <td align="center">Contact:</td>
                        <td align="center"><s:property value="contactno" /></td>
                    </tr>
                    
                </s:iterator>   </table>
           <s:submit value="Apply"  theme="simple"/>
            </s:form>
         </center>
        </div>
        <div id=footer>
            <center>
                <p>@copyright 2012<br>
                    Sysbiz Technologies Pvt. Ltd.</p><s:property value= "#session.loggedin" />
            </center>
        </div>
    </body>
</html>
