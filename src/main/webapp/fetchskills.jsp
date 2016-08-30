<%-- 
    Document   : fetchskills
    Created on : Jun 27, 2012, 10:02:49 AM
    Author     : beenabasanthi
--%>


<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css" >
        <s:head theme="ajax"/>
        <title>Skills fetching Page</title>
        <style  type="text/css">
            .opt{
                width:150px;
            }
        </style>
        <script type="text/javascript">
            function validate2(){
                var letterNumber = /^[0-9a-zA-Z\ ]+$/;
                var letterNumbers = /^[a-zA-Z\ ]+$/;
                var iChars = "!@#$%^&*()+=-[]\\\';,./{}|\":<>?";

                var exp=document.getElementById("experience_in_years").selectedIndex;

                if(document.getElementsByName("experience_or_fresher")[1].checked==false){
                    var exp1=document.getElementById("experience_in_months").selectedIndex;
                    var org=document.getElementById("orgname").value;
                    var ind=document.getElementById("indname").value;
                    var jobrole1=document.getElementById("jobrole1").value;
                    var cursal=document.getElementById("cursal").value;
                    var expsal=document.getElementById("expsal").value;};

                if (!document.getElementsByName("experience_or_fresher")[0].checked && !document.getElementsByName("experience_or_fresher")[1].checked)
                {
                    alert("Please Let us know whether you are \"Experienced or Fresher\".");
                    return false;
                }
                if(document.getElementsByName("experience_or_fresher")[0].checked==true)
                {

                    if(exp == 0){
                        alert("Select your Experience in years");
                        return false;
                    }
                    if(exp1 == 0){
                        alert("Select your Experience in months");
                        return false;
                    }
                    if(org=="")
                    {
                        alert("Current Organization required");

                        return false;
                    }
                    if(org.trim()==''){
                        alert("Enter Current Organization");
                        return false;
                    }
                    if(!isNaN(org)){
                        alert("Current Organization cannot  be a number");
                        return false;
                    }
                    if(!(org.match(letterNumbers)))

                    {
                        alert("Current Organization can only have alphabet.");
                        return false;
                    }
   
                    if(ind=="")
                    {
                        alert("Current Industry required");

                        return false;
                    }
                    if(ind.trim()==''){
                        alert("Enter Current Industry");
                        return false;
                    }
                    if(!isNaN(ind)){
                        alert("Current Industry cannot  be a number");
                        return false;
                    }
                    if(!(ind.match(letterNumbers)))

                    {
                        alert("Current Industry can only have alphabet.");
                        return false;
                    }
                    if(jobrole1=="")
                    {
                        alert("Current Job Role required");

                        return false;
                    }
                    if(jobrole1.trim()==''){
                        alert("Enter Current Job Role");
                        return false;
                    }
                    if(!isNaN(jobrole1)){
                        alert("Current Job Role cannot be a number");
                        return false;
                    }

                    if(!(jobrole1.match(letterNumbers)))

                    {
                        alert("Current Job Role  can only have alphabet");
                        return false;
                    }
    
                    if(cursal=="")
                    {
                        alert("Current Salary required");

                        return false;
                    }
                    if((cursal.match(letterNumbers))){
                        alert("Current Salary cannot have alphabet");
                        return false;

                    }
                    for (var i = 0; i < document.f1.cursal.value.length; i++){

                        if (iChars.indexOf(document.f1.cursal.value.charAt(i)) != -1) {
                            alert("Current Salary should not have special character");
                            return false;
                        }

                    }

                    if(cursal.trim()==''){
                        alert("Enter Current Salary");
                        return false;
                    }

                    if(expsal=="")
                    {
                        alert("Expected Salary required");

                        return false;
                    }
                    if((expsal.match(letterNumbers))){
                        alert("Expected Salary cannot have alphabet");
                        return false;

                    }

                    if(expsal.trim()==''){
                        alert("Enter Expected Salary");
                        return false;
                    }
                    for (var i = 0; i < document.f1.expsal.value.length; i++){

                        if (iChars.indexOf(document.f1.expsal.value.charAt(i)) != -1) {
                            alert("Expected Salary should not have special character");
                            return false;
                        }

                    }
                }
                var aca_ach=document.getElementById("academic_achievements").value;
                var coc_ach=document.getElementById("cocurricular_achievements").value;
                if(aca_ach=="")
                {
                    alert("Academic Achievements required");

                    return false;
                }
                if(aca_ach.trim()==''){
                    alert("Enter Academic Achievements");
                    return false;
                }
                if(!isNaN(aca_ach)){
                    alert("Academic Achievements cannot  be a number");
                    return false;
                }
               
                if(coc_ach=="")
                {
                    alert("Cocurricular Achievements required");

                    return false;
                }
                if(coc_ach.trim()==''){
                    alert("Enter Cocurricular Achievements");
                    return false;
                }
                if(!isNaN(coc_ach)){
                    alert("Cocurricular Achievements cannot  be a number");
                    return false;
                }
                var list = document.getElementById("selectedskills");
              
                if(list.options.length==0){

                    var r=confirm("You didn't select any skills.Are you sure?");
                    if (r==false)
                    {
                        alert("Please mention your Skills");
                        return false;
                    }
                    
                }
         var fup = document.getElementById('filename');
                var fileName = fup.value;
               
                if(fileName!=""){
                var ext = fileName.substring(fileName.lastIndexOf('.') + 1);
                if(ext == "doc" || ext == "pdf" || ext=="odt"){
                    return true;
                }
                else
                {
                    alert("Upload  Resume in pdf or doc format  only");
                    fup.focus();
                    return false;
                }
                }
               return true;
            }
            function validate4(){
                
                
                var exp=document.getElementById("experience_in_years");
                var exp1=document.getElementById("experience_in_months");
                var org=document.getElementById("orgname");
                var ind=document.getElementById("indname");
                var jrole=document.getElementById("jobrole1");
                var csal=document.getElementById("cursal");
                var esal=document.getElementById("expsal");
                if(document.getElementsByName("experience_or_fresher")[1].checked==true){
                    exp.disabled=true;
                    document.getElementById("experience_in_years").selectedIndex=0;
                    exp1.disabled=true;
                    document.getElementById("experience_in_months").selectedIndex=0;
                    org.disabled=true;
                    document.getElementById("orgname").value="";
                    ind.disabled=true;
                    document.getElementById("indname").value="";
                    jrole.disabled=true;
                    document.getElementById("jobrole1").value="";
                    csal.disabled=true;
                    document.getElementById("cursal").value="";
                    esal.disabled=true;
                    document.getElementById("expsal").value="";
                }
                else
                {
                    exp.disabled=false;
                    exp1.disabled=false;
                    org.disabled=false;
                    ind.disabled=false;
                    jrole.disabled=false;
                    csal.disabled=false;
                    esal.disabled=false;
                }
            }
            
            function Checkfiles()
            {
                var fup = document.getElementById('filename');
                var fileName = fup.value;
                var ext = fileName.substring(fileName.lastIndexOf('.') + 1);
                if(ext == "doc" || ext == "pdf" || ext=="odt"){
                    return true;
                }
                else
                {
                    alert("Upload  Resume in pdf or doc format  only");
                    fup.focus();
                    return false;
                }

            }
            function refresh(){

                document.getElementById("experience_in_years").selectedIndex=0;
                document.getElementById("experience_in_months").selectedIndex=0;
                document.getElementById("orgname").value="";
                document.getElementById("indname").value="";
                document.getElementById("jobrole1").value="";
                document.getElementById("cursal").value="";
                document.getElementById("expsal").value="";
                document.getElementById("academic_achievements").value="";
                document.getElementById("cocurricular_achievements").value="";
                document.getElementsByName("experience_or_fresher")[0].checked=false;
                document.getElementsByName("experience_or_fresher")[1].checked=false;

         

            }
                                
        </script>       
    </head>
    <body onload="validate4()" bgcolor="#D8D8D8">
        <div id="header">
            <a href="http://www.sysbiz.com"><img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/></a>
        </div><!--Header-->

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
        </div><!--Navigation-->



        <div id="content"><h3> Welcome &nbsp;<s:property value="#session.uname"/>&nbsp;&nbsp; User id: <s:property value="#session.userid"/> </h3>
            <div align="center">


                <s:form  method="post" validate="true"  name="f1" id="f1" onsubmit="return validate2();" enctype="multipart/form-data" >

                    <s:actionmessage />
                    <h3>Skills and Achievements</h3>
                    <s:textfield name="userId" value="%{userId}"  readonly="true" label="User Id"/>

                    <s:optiontransferselect
                        name="skills"
                        id="skills"
                        leftTitle="All Skills"
                        rightTitle="Selected Skills"
                        list="skills"

                        cssClass="opt"
                        doubleCssClass="opt"
                        doubleName="selectedskills"
                        doubleId="selectedskills"
                        doubleList="selectedskills"   label="SkillSet" size="5"   doubleSize="5" allowAddAllToLeft="false " allowSelectAll="false" allowAddAllToRight="false"   allowUpDownOnLeft="false" allowUpDownOnRight="false" allowAddToLeft="true"/>



                    <s:radio value="%{experience_or_fresher}" name="experience_or_fresher" list="{'Experienced','Fresher'}" onchange="return validate4();" label="Experienced/Fresher"/>




                    <s:select  name="experience_in_years" id="experience_in_years"   
                               headerKey="0" headerValue="Select" 
                               list="{'1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30+'}"  value="%{experience_in_years}" label="ExperienceInYears">
                    </s:select>
                    <s:select  name="experience_in_months" id="experience_in_months" 
                               headerKey="0" headerValue="Select"
                               list="{'1','2','3','4','5','6','7','8','9','10','11'}"  value="%{experience_in_months}" label="ExperienceInMonths">
                    </s:select> 


                    <s:textfield value="%{orgname}" name="orgname" id="orgname" label="Current Organization"  size="30"/>



                    <s:textfield value="%{indname}" name="indname" id="indname"  label="Current Industry"
                                 size="30"/>


                    <s:textfield value="%{jobrole1}" label="Current Job Role" name="jobrole1" id="jobrole1" size="30"/> 


                    <s:textfield value="%{cursal}" label="Current Salary" name="cursal" id="cursal" size="30"/> 


                    <s:textfield value="%{expsal}" label="Expected Salary" name="expsal" id="expsal" size="30"/>




                    <s:textarea value="%{academic_achievements}" name="academic_achievements" rows="4" cols="23" label="Academic Achievements" id="academic_achievements"/>



                    <s:textarea value="%{cocurricular_achievements}" name="cocurricular_achievements"  rows="4" cols="23" label="Co-curricular Achievements" id="cocurricular_achievements"/>
                    <table>
                        <tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                            <td nowrap align="center"><s:fielderror /></td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                        </tr><tr>
                            <td>
                                <s:hidden name="displayfile" value="%{uploadFileFileName}" />
                                You have uploaded the following file:
                                File Name : ${uploadFileFileName}
                                <hr>
                                <b>Upload Resume</b>
                                <s:file  name="uploadFile" accept="text/*" theme="simple" id="filename" onkeypress="return Checkfiles();"/>
                            </td>
                        </tr>  
                    </table>
                            <table><tr></tr><tr></tr>
                    <s:if test="academic_achievements==null">
                        
                            <tr>
                                <td>
                                    <s:submit type="button" name="save2"  action="saveskills" value="Save" theme="simple"/>
                                </s:if></td>
                            <td>
                                <s:else>
                                    <s:submit action="updateskills" name="save3" value="Update" align="center" theme="simple" />
                                </s:else></td>
                            <td>


                                <input type="button" onclick="refresh()" name="reset" value="Reset" align="center" theme="simple"/>
                            </td>
                        </tr>
                    </table>
                </s:form>  </div>
        </div>

        <br>
        <br>


        <div id="footer">
            <center>
                <p>@copyright2012<br>
                    Sysbiz Technologies Pvt. Ltd.
            </center>
        </div><!--Footer-->
    </body>
</html>