<%-- 
    Document   : uloginsuccess
    Created on : Jun 22, 2012, 4:27:58 PM
    Author     : Alokkumar
--%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
 <link rel="stylesheet" type="text/css" href="css/displaytag.css" />
<title></title>

<html>
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

        <div id="header">
            <a href="http://www.sysbiz.com"><img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/></a>
        </div>

        <div id=navigation>
            <center>
                <ul>
                    <li><a href="loginHome.action"><h3>Home</h3></a></li>
                    <li><a href="fetchPersonal.action"><h3>Personal</h3></a></li>
                    <li><a href="fetchedu.action"><h3>Educational</h3></a></li>
                    <li><a href="fetchskills.action"><h3>Skills</h3></a></li>
                    <li><a href="JobSearch.action"><h3>Job Search</h3></a></li>&nbsp;&nbsp;&nbsp;&nbsp;
                    <li><a href=" ManageAcc.action"><h3>ChangePassword</h3></a></li>
                    <li><a href="logoutAction.action"><h3>Logout</h3></a></li>
                </ul>
            </center>
        </div>
        <h3> Welcome <s:property value="#session.uname"/>&nbsp;&nbsp;&nbsp; User id: <s:property value="#session.userid"/> </h3>

            <center><s:actionerror/></center>
            <div id="content">       
                <center>
                    <h1>JOB DETAILS:</h1>
                    
                    <s:form action="viewjobsbyrole">
                        <table>
                        <tr>
                            <td>
                               <s:select   name="jobRole" headerKey="1" headerValue="--Please Select--"  label="Job Role" list="{'Java Developers','Team Leads','Manager','Supervisor','Administrator','Executive Voice','Network Engineer','Novell Engineer','System Administrator'}" id="jobRole" />
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                  <s:submit value="Search" theme="simple"/>
                            </td>
                        </tr>

                    </table><div>
</div>
                        <div>
                        <s:if test="list!=null">
                   <display:table class="displayTable" export="false" id="data" name="list" requestURI="/viewjobsbyrole.action" pagesize="5">
                    <display:column property="jobPostDate"  title="Job Post Date" />                 
                    <display:column property="jobRole"  title="Job Role" />
                    <display:column property="educationQualification" title="Qualification" />
                    <display:column property="experience"  title="Experience"/>                 
                    <display:column property="jobLocation"  title="Location"/>
                    <display:column property="skills"  title="Skills"/>                        
                    <display:column title="More" value="Details" paramId="jobid" paramProperty="jobid" href="moredetailsloc.action">                  
                        
                    
                    </display:column>
                   
                </display:table>
                        </s:if>
                        </div>
                           
                    
                </s:form>
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
        <br>
        <br>
        <br>
        <br>

        <br>
        <br>
         <br>
            <div id="footer">
                <center>
                   <p>@copyright2012<br>
                        Sysbiz Technologies Pvt. Ltd.
                </center>
            </div>


    </body>
</html>