<%-- 
    Document   : manageaccount
    Created on : Jun 27, 2012, 10:39:15 AM
    Author     : manikanta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib  uri="/struts-tags" prefix="s" %>
<link rel="stylesheet" type="text/css" href="css/styles.css" />
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
            function validate(f1,oldpassword,newpassword,confirmpassword){
                var reg1 = /^\w*(?=\w*\d)(?=\w*[a-z])(?=\w*[A-Z])\w*$/;
                var address3 = document.forms[f1].elements[oldpassword].value;
                var address1 = document.forms[f1].elements[newpassword].value;
                var address2 = document.forms[f1].elements[confirmpassword].value;
                
                if(address3.trim()==""){
                    alert("Enter old Password");
                    return false;
                }
                if(address3.length<5){
                    alert("Password should be atleast 5 characters");
                      document.getElementById("t2").value='';
                    return false;
                }
                if(address3.length>10){
                    alert("Password should contain atmost 10 characters");
                      document.getElementById("t2").value='';
                    return false;
                }
                  if(reg1.test(address3)== false){
                    alert("Password must be a combination of lowercase,uppercase and number.");
                      document.getElementById("t2").value='';
                    return false;
                }
                
                if(address1.trim()==""){
                    alert("Enter New Password");
                    return false;
                }
                if((address1==address3)){
                    alert("Old Password and New Password should not be same");
                    return false;
                }
   
                if(address1.length<5 ){
                    alert("Password should be atleast 5 characters");
                      document.getElementById("t2").value='';
                    return false;
                }
                if(address1.length>10){
                    alert("Password should contain atmost 10 characters");
                      document.getElementById("t2").value='';
                    return false;
                }
                 if(reg1.test(address1)== false){
                    alert("Password must be a combination of lowercase,uppercase and number.");
                      document.getElementById("t2").value='';
                    return false;
                }

                if(address2.trim()==""){
                    alert("Enter Confirm Password");
                    return false;
                }

   
                if(!(address1==address2)){
                    alert("Password Mismatch !");
                    return false;
                }
            }
        </script>
        <title>Manage Account</title>
    </head>
    <body>

        <div id="header">
           <a href="http://www.sysbiz.com"><img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/></a>
        </div>

        <div id="navigation">
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
        <h1><center>Change Password</center></h1>
        <center>
            <s:form action="changepassword" name="f1" id="f1" >
                <s:actionmessage/>
                <s:password name="oldpassword" id="t1" label="Old Password" maxlength="15"/>
                <s:password name="newpassword" id="t2" label="New Password" maxlength="15"/>
                <s:password name="confirmpassword" id="t3" label="Confirm Password" maxlength="15"/>
                <s:submit  align="center" name="save" value="Change" onclick="javascript:return validate('f1','oldpassword','newpassword','confirmpassword');" />
            </s:form>
        </center>
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
