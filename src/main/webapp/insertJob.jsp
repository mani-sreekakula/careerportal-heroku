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
<%@taglib  uri="/struts-jquery-tags" prefix="sx" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <%
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
            response.addHeader("Cache-Control", "post-check=0, pre-check=0");
            response.setHeader("Pragma", "no-cache");
        %>
        <META HTTP-EQUIV="Refresh" />

        <script type="text/javascript">
            function postvalidate(){        
                v1=document.getElementById("JobField").selectedIndex;
                v2=document.getElementById("jobRole").selectedIndex;            
                v3=document.getElementById("educationalQualification").selectedIndex;              
                v4=document.getElementById("experience").selectedIndex;              
                v5=document.getElementById("yearOfPassing").selectedIndex;              
                v6=document.getElementById("salaryPay").selectedIndex;              
                v7=document.getElementById("jobLocation").selectedIndex;
                v8=document.getElementById("jobDescription").value;
                v12=document.getElementById("noOfVacancies").value;
                v13=document.getElementById("skills").value;
                v11=document.getElementById("contactno").value;
                //v9=document.getElementById("jobPostDate");
                v9=dojo.widget.byId("jobPostDate");
        
                if(v9.getValue()==""){
                    alert("please select Job Post Date");
                    return false;}
                if(v1==0){
                    alert("Please select Job Field");
                    return false;
                }
                if(v2==0){
                    alert("Please select Job Role");
                    return false;
                }
                if(v3==0){
                    alert("Please select Qualification");
                    return false;
                }
                if(v4==0){
                    alert("Please select Experience");
                    return false;
                }
                if(v5==0){
                    alert("Please select Year of Passing");
                    return false;
                }
                if(v8=="" || v8.trim()==''){
                    alert("Please enter Job Description");
                    return false;
                }
                if(v6==0){
                    alert("Please select Salary Pay");
                    return false;
                }
                if(v7==0){
                    alert("Please select Job Location");
                    return false;
                }
                if(v12=="" || v12.trim()==''){
                    alert("Please select Vacancies");
                    return false;
                }
                if(v12<0)
                {
                    alert("Vacancies cannot be negative");
                    return false;
                }
                if(v12==0)
                {
                    alert("Vacancies cannot be zero");
                    return false;
                }
                
                if(!(parseFloat(v12) == parseInt(v12))){
                    alert("Vacancies should contain numeric values only.");
                    return false;
                } 
                if((isNaN(v12))){
                    alert("Vacancies should contain numeric values only.");
                    return false;
                }
                
                
               
                if(v13=="" || v13.trim()==''){
                    alert("Please enter Skills");
                    return false;
                }
                if(v11=="" || v11.trim()==''){
                    alert("Please enter Contact");
                    return false;
                    
                }
                if(v11<10){
                    alert("Contact should not be less than 10 digit.");
                    return false;
                }
              
                if(!(parseFloat(v11) == parseInt(v11))){
                    alert("Contact should be numeric value.");
                    return false;
                }
                if((isNaN(v11))){
                    alert("Contact should be numeric value.");
                    return false;
                }

                v14=document.getElementById("insertjob");    
                var id=Math.random().toString().substring(2,16);
                v14.jobid.value=id;
                alert("job id is:"+v14.jobid.value);
                return true;
                   
            }
 
            function refresh(){
               
                document.getElementById("JobField").selectedIndex=0;  
                document.getElementById("jobType").selectedIndex=0;
                document.getElementById("jobRole").selectedIndex=0;
                document.getElementById("educationalQualification").selectedIndex=0;
                document.getElementById("experience").selectedIndex=0;
                document.getElementById("yearOfPassing").selectedIndex=0;
                document.getElementById("jobDescription").value="";
                document.getElementById("salaryPay").selectedIndex=0;
                document.getElementById("jobLocation").selectedIndex=0;
                document.getElementById("noOfVacancies").value="";
                document.getElementById("skills").value="";
                document.getElementById("contactno").value="";
            }
            function set(){
           
                dojo.widget.byId("jobPostDate").setValue(new Date());
            }
        </script>   
        <s:head/>
        <sx:head/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Job Post Form</title>
    </head>
    <body onload="set()">

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
        <div id="menu"><h3> Welcome <s:property value="#session.aname"/></h3>

        </div>


        <div id=content_area>
            <div align="center">

                <h3>Post a New Job</h3>
                <s:actionmessage />
                <s:form  action="insertJob" id="insertjob" name="insertJob"  >
                	<sx:datepicker displayFormat="dd-MM-yyyy" name="jobPostDate" id="jobPostDate" label="Job Posted Date" disabled="true" />
                    <s:select  headerKey="1" headerValue="--Please Select--" label="Job Field" list="{'IT','Software','BPO','Hardware','Networking'}" id="JobField" name="JobField" />
                    <s:select   name="jobType" label="Job Type" list="{'Full Time','Part time'}" id="jobType"/>
                    <s:select  name="jobRole" headerKey="1" headerValue="--Please Select--"  label="Job Role" list="{'Java Developers','Team Leads','Manager','Supervisor','Administrator','Executive Voice','Network Engineer','Novell Engineer','System Administrator'}" id="jobRole" />
                    <s:select  name="Qualification" headerKey="1" headerValue="--Please Select--" list="{'BE/BTech','MCA','MBA','Diploma','Any Graduate'}" id="educationalQualification" label="Qualification"/>
                    <s:select  name="experience"  headerKey="1" headerValue="--Please Select--"  label="Experience" list="{'Fresher','<1 year','1-2 years','2-3 years','>3 years'}" id="experience" />
                    <s:select   name="yearOfPassing" headerKey="1" headerValue="--Please Select--"  label="Year of Passing" list="{'1990','1991','1992','1993','1994','1995','1996','1997','1998','1999','2001','2002','2003','2004','2005','2006','2007','2008','2009','2010','2011','2012','2013'}" id="yearOfPassing" />
                    <s:textarea   name="jobDescription" label="Job Description" id="jobDescription" rows="4" cols="20"  />
                    <s:select name="salaryPay"   id="salaryPay" headerKey="1" headerValue="-Select Range-"  label="Salary Pay" list="{'<2LPA','2-3LPA','3-4LPA','4-5LPA','>5LPA'}" />
                    <s:select name="Location" headerKey="1"  headerValue="-Select-"  label="Job Location" id="jobLocation" list="{'Chennai','Bengaluru','Hyderabad','Delhi','Mumbai','Kolkata'}" />
                    <s:textfield name="noOfVacancies"  label="Vacancies" id="noOfVacancies"  />
                    <s:textarea id="skills" name="skill" label="Skills" rows="4" cols="20" />
                    <s:textfield label="Contact" name="contact"  id="contactno" maxLength="10"/> 
                    <s:hidden name="jobid"/>
                    <div>
                        <table>
                            <tr><td> <s:submit   action="insertJob" onclick="javascript:return postvalidate()" value="Post" theme="simple" /></td>
                                <td><input type="button" onclick="refresh()" value="Clear" theme="simple" /></td></tr>
                        </table>
                        <s:if test="contact==''">
                            <s:submit value="aa" disabled="true"/>
                        </s:if>
                    </div>
                </s:form>

            </div>
        </div>
        <div id=footer>
            <center>
                <p>@copyright2012<br>
                    Sysbiz Technologies Pvt. Ltd.</p>
            </center>
        </div>
    </body>
</html>
