<%-- 
    Document   : showfetch
    Created on : Jun 22, 2012, 10:38:22 AM
    Author     : beenabasanthi
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
      
        <link rel="stylesheet" type="text/css" href="css/styles.css" >
        <title>Fetched educational details</title>
         <script type="text/javascript">
                    function validate()
            {
                var pgaggregate=document.getElementById("pgaggregate").value;
                var pginstitute=document.getElementById("pginstitute").value;  
                var ugaggregate=document.getElementById("ugaggregate").value;
                var uginstitute=document.getElementById("uginstitute").value; 
                var intaggregate=document.getElementById("intaggregate").value;
                var intinstitute=document.getElementById("intinstitute").value;
                var tenthaggregate=document.getElementById("tenthaggregate").value;
                var tenthinstitute=document.getElementById("tenthinstitute").value; 
                var pguniversity=document.getElementById("pguniversity").value; 
                var uguniversity=document.getElementById("uguniversity").value;
                var intuniversity=document.getElementById("intuniversity").value;
                var tenthuniversity=document.getElementById("tenthuniversity").value;
                var pglocation=document.getElementById("pglocation").value;
                var uglocation=document.getElementById("uglocation").value;
                var intlocation=document.getElementById("intlocation").value;
                var tenthlocation=document.getElementById("tenthlocation").value;                              
                var pgdegree=document.getElementById("pgdegree").selectedIndex;
                var ugdegree=document.getElementById("ugdegree").selectedIndex;
                var intdegree=document.getElementById("intdegree").selectedIndex;
              
                var pgstate=document.getElementById("pgstate").selectedIndex;
                var ugstate=document.getElementById("ugstate").selectedIndex;
                var intstate=document.getElementById("intstate").selectedIndex;
                var tenthstate=document.getElementById("tenthstate").selectedIndex;   
                var pgyearofpass=document.getElementById("pgyearofpass").selectedIndex; 
                var ugyearofpass=document.getElementById("ugyearofpass").selectedIndex; 
                var tenthyearofpass=document.getElementById("tenthyearofpass").selectedIndex; 
                var intyearofpass=document.getElementById("intyearofpass").selectedIndex;
                var pgbranch=document.getElementById("pgbranch").selectedIndex;
                var ugbranch=document.getElementById("ugbranch").selectedIndex;
                var intbranch=document.getElementById("intbranch").selectedIndex;
                var letterNumber = /^[a-zA-Z\ ]+$/;  

                
                
                if(pgdegree != 0){                  
                    
                
                    if(pgbranch == 0){                  
                        alert("Select PG Branch");                     
                        return false;
                    }
                    if(pginstitute=="")                       
                    {
                        alert("PG Institute is required");                        
                        return false;
                    }
                    if(pginstitute.trim()==''){
                        alert("Enter PG Institute");
                        return false;
                    }
                    if(!isNaN(pginstitute)){
                        alert("PG Institute cannot be a number");
                        return false;
                    }
                    if(!(pginstitute.match(letterNumber))) 
                    
                    {
                       alert("PG Institute can contain only alphabets");
                       return false;
                    }  
                    if(pguniversity=="")
                    {
                        alert("PG University/Board required");
                         
                        return false;
                    }
                    if(pguniversity.trim()==''){
                        alert("Enter PG University/Board");
                        return false;
                    }
                    if(!isNaN(pguniversity)){
                        alert("PG University/Board cannot be a number");
                        return false;
                    }
                     if(!(pguniversity.match(letterNumber))) 
                    
                    {
                       alert("PG University/Board can contain only alphabets.");
                       return false;
                    }  
                    if(pgstate == 0){                  
                        alert("Select PG State");                     
                        return false;
                    }
                    if(pglocation=="")
                    {
                        alert("PG Location required");
                         
                        return false;
                    }
                    if(pglocation.trim()==''){
                        alert("Enter PG Location");
                        return false;
                    }
                    if(!isNaN(pglocation)){
                        alert("PG Location cannot  be a number");
                        return false;
                    }
                     if(!(pglocation.match(letterNumber))) 
                    
                    {
                       alert("PG Location can contain only alphabets.");
                       return false;
                    }  
                    if(isNaN(pgaggregate)){
                        alert("PG Aggregate should be a number");
                         
                        return false;
                    }
                    if((pgaggregate <= 0.0) || (pgaggregate > 100.0))
                    {
                        alert("PG Aggregate should be within a range of 0 to 100");
                        return false;
                    }
                    if(pgaggregate.trim()==''){
                        alert("Enter PG Aggregate");
                        return false;
                    }
                    if(pgyearofpass == 0){                  
                        alert("Select the Year of Passing for PG");                     
                        return false;
                    }
                
                }
                  
                if(ugdegree == 0){                  
                    alert("Select UG Degree");                     
                    return false;
                }
                if(ugbranch == 0){                  
                    alert("Select UG Branch");                     
                    return false;
                }
                if( uginstitute=="")
                {
                    alert("UG Institute required");
                         
                    return false;
                }
                if(uginstitute.trim()==''){
                    alert("Enter UG Institute");
                    return false;
                }
                if(!isNaN(uginstitute)){
                    alert("UG Institute cannot be a number");
                    return false;
                }
                 if(!(uginstitute.match(letterNumber))) 
                    
                    {
                       alert("UG Institute can contain only alphabets.");
                       return false;
                    }  
                if(uguniversity=="")
                {
                    alert("UG University/Board is required");
                         
                    return false;
                }
                if(uguniversity.trim()==''){
                    alert("Enter UG University/Board");
                    return false;
                }
                if(!isNaN(uguniversity)){
                    alert("UG University/Board cannot  be a number");
                    return false;
                }
                 if(!(uguniversity.match(letterNumber))) 
                    
                    {
                       alert("UG University/Board can contain only alphabets.");
                       return false;
                    }  
                if(ugstate == 0){                  
                    alert("Select UG State");                     
                    return false;
                }
                if(uglocation=="")
                {
                    alert("UG Location required");
                         
                    return false;
                }
                if(uglocation.trim()==''){
                    alert("Enter UG Location");
                    return false;
                }
                if(!isNaN(uglocation)){
                    alert("UG Location cannot  be a number");
                    return false;
                }
                 if(!(uglocation.match(letterNumber))) 
                    
                    {
                       alert("UG Location can contain only alphabets.");
                       return false;
                    } 
                    if(ugaggregate.trim()==''){
                    alert("Enter UG Aggregate");
                    return false;
                }
                if(isNaN(ugaggregate)){
                    alert("UG Aggregate should be a number");
                         
                    return false;
                }
                if((ugaggregate <= 0.0) || (ugaggregate > 100.0))
                {
                    alert("UG Aggregate should be within a range of 0 to 100");
                    return false;
                }
               
                if(ugyearofpass == 0){                  
                    alert("Select the Year of Passing for UG");                     
                    return false;
                }
                if((pgdegree != 0) && (pgyearofpass < ugyearofpass)){
                    alert("Please check, your Year of passing for PG is less than that of UG");                     
                    return false;
                }
                if(intdegree == 0){                  
                    alert("Select Intermediate degree");                     
                    return false;
                }
                if(intbranch == 0){                  
                    alert("Select Intermediate branch");                     
                    return false;
                }
                if(intinstitute=="")
                {
                    alert("Intermediate Institute required");
                         
                    return false;
                }
                if(intinstitute.trim()==''){
                    alert("Enter Intermediate Institute");
                    return false;
                }
                if(!isNaN(intinstitute)){
                    alert("Intermediate Institute cannot  be a number");
                    return false;
                }
                 if(!(intinstitute.match(letterNumber))) 
                    
                    {
                       alert("Intermediate institute can contain only alphabets.");
                       return false;
                    }  
                if(intuniversity=="")
                {
                    alert("Intermediate University/Board  required");
                         
                    return false;
                }
                if(intuniversity.trim()==''){
                    alert("Enter Intermediate University/Board");
                    return false;
                }
                if(!isNaN(uguniversity)){
                    alert("Intermediate University/Board  cannot  be a number");
                    return false;
                }
                 if(!(intuniversity.match(letterNumber))) 
                    
                    {
                       alert("Intermediate University/Board can contain only alphabets.");
                       return false;
                    }  
                if(intstate == 0){                  
                    alert("Please select Intermediate State");                     
                    return false;
                }
                
                if(intlocation=="")
                {
                    alert("Intermediate Location required");
                         
                    return false;
                }
                if(intlocation.trim()==''){
                    alert("Enter your Intermediate Location");
                    return false;
                }
                if(!isNaN(intlocation)){
                    alert("Intermediate Location cannot  be a number");
                    return false;
                }
                 if(!(intlocation.match(letterNumber))) 
                    
                    {
                       alert("Intermediate Location contain only alphabets");
                       return false;
                    }  
                if(isNaN(intaggregate)){
                    alert("Intermediate Aggregate should be a number");
                         
                    return false;
                }
                if((intaggregate <= 0.0) || (intaggregate > 100.0))
                {
                    alert("Intermediate Aggregate should be within a range of 0 to 100");
                    return false;
                }
                if(intaggregate.trim()==''){
                    alert("Enter Intermediate Aggregate");
                    return false;
                }
                if(intyearofpass == 0){                  
                    alert("Select the Year of Passing for Intermediate");                     
                    return false;
                }
                if((pgdegree != 0) &&(pgyearofpass < intyearofpass)){
                     
                     alert("Please check, your Year of passing for PG is less than that of Intermediate");
                    return false;
                }
                if(ugyearofpass < intyearofpass){
                    
                     alert("Please check, your Year of passing for UG is less than that of Intermediate");
                    return false;
                }
                
                
                if(tenthinstitute=="")
                
                {
                    alert("Tenth Institute required");
                         
                    return false;
                }
                if(tenthinstitute.trim()==''){
                    alert("Enter Tenth Institute");
                    return false;
                }
                if(!isNaN(tenthinstitute)){
                    alert("Tenth Institute cannot  be a number");
                    return false;
                }
                 if(!(tenthinstitute.match(letterNumber))) 
                    
                    {
                       alert("Tenth Institute name can contain only alphabets.");
                       return false;
                    }  
                if(tenthuniversity=="")
                {
                    alert("Tenth University/Board required");
                         
                    return false;
                }
                if(tenthuniversity.trim()==''){
                    alert("Enter Tenth University/Board");
                    return false;
                }
                if(!isNaN(tenthuniversity)){
                    alert("Tenth University/Board cannot  be a number");
                    return false;
                }
                if(!(tenthuniversity.match(letterNumber))) 
                    
                    {
                       alert("Tenth University/Board name can contain only alphabets.");
                       return false;
                    }  
                if(tenthstate == 0){                  
                    alert("Select Tenth state");                     
                    return false;
                }
                if(tenthlocation=="")
                {
                    alert("Tenth Location required");
                         
                    return false;
                }
                if(tenthlocation.trim()==''){
                    alert("Enter Tenth Location");
                    return false;
                }
                if(!isNaN(tenthlocation)){
                    alert("Tenth Location cannot  be a number");
                    return false;
                }
                if(!(tenthlocation.match(letterNumber))) 
                    
                    {
                       alert("Tenth Location can contain only alphabets.");
                       return false;
                    }  
                
                if(isNaN(tenthaggregate)){
                    alert("Tenth Aggregate should be a number");
                         
                    return false;
                }
                if((tenthaggregate <= 0.0) || (tenthaggregate > 100.0))
                {
                    alert("Tenth Aggregate should be within a range of 0 to 100");
                    return false;
                } 
                if(tenthaggregate.trim()==''){
                    alert("Enter Tenth Aggregate");
                    return false;
                }
                if(tenthyearofpass == 0){                  
                    alert("Select the Year of Passing for Tenth");                     
                    return false;
                }
                if((pgdegree != 0) && (pgyearofpass < tenthyearofpass)){
                  
                    alert("Please check, your Year of passing for PG is less than that of Tenth");                     
                    return false;
                }
                if(ugyearofpass < tenthyearofpass){
                  
                    alert("Please check, your Year of passing for UG is less than that of Tenth");                                         
                    return false;
                }
                if(intyearofpass < tenthyearofpass){
                    
                    alert("Please check, your Year of passing for Intermediate is less than that of Tenth");                     
                    return false;
                }                                           
            }  
            function validate3(){
                var pgdegree=document.getElementById("pgdegree").selectedIndex;
                var pginstitute=document.getElementById("pginstitute");
                var pgbranch=document.getElementById("pgbranch");
                var pguniversity=document.getElementById("pguniversity");
                var pgstate=document.getElementById("pgstate");
                var pglocation=document.getElementById("pglocation");
                var pgaggregate=document.getElementById("pgaggregate");
                var pgyearofpass=document.getElementById("pgyearofpass");
            
                if(pgdegree != 0){  
                  
                    pginstitute.disabled=false;
                    pgbranch.disabled=false;
                    pguniversity.disabled=false;
                    pgstate.disabled=false;
                    pglocation.disabled=false;
                    pgaggregate.disabled=false;
                    pgyearofpass.disabled=false;                        
                }
                else{
                    pginstitute.disabled=true;
                    document.getElementById("pginstitute").value="";
                    pgbranch.disabled=true;
                    document.getElementById("pgbranch").selectedIndex=0;
                    pguniversity.disabled=true;
                    document.getElementById("pguniversity").value="";
                    pgstate.disabled=true;
                    document.getElementById("pgstate").selectedIndex=0;
                    pglocation.disabled=true;
                    document.getElementById("pglocation").value="";
                    pgaggregate.disabled=true;
                    document.getElementById("pgaggregate").value="";
                    pgyearofpass.disabled=true;
                    document.getElementById("pgyearofpass").selectedIndex=0;
                }                   
                return false;
            }  
           
            function refresh(){
                 document.getElementById("pgaggregate").value="";
                document.getElementById("pginstitute").value="";
                document.getElementById("ugaggregate").value="";
                document.getElementById("uginstitute").value="";
                document.getElementById("intaggregate").value="";
                document.getElementById("intinstitute").value="";
                document.getElementById("tenthaggregate").value="";
                document.getElementById("tenthinstitute").value="";
                document.getElementById("pguniversity").value="";
                document.getElementById("uguniversity").value="";
                document.getElementById("intuniversity").value="";
                document.getElementById("tenthuniversity").value="";
                document.getElementById("pglocation").value="";
                document.getElementById("uglocation").value="";
                document.getElementById("intlocation").value="";
                document.getElementById("tenthlocation").value="";
                document.getElementById("pgdegree").selectedIndex="";
                document.getElementById("ugdegree").selectedIndex="";
                document.getElementById("intdegree").selectedIndex="";

                document.getElementById("pgstate").selectedIndex=0;
                document.getElementById("ugstate").selectedIndex=0;
                document.getElementById("intstate").selectedIndex=0;
                document.getElementById("tenthstate").selectedIndex=0;
               document.getElementById("pgyearofpass").selectedIndex=0;
                document.getElementById("ugyearofpass").selectedIndex=0;
                document.getElementById("tenthyearofpass").selectedIndex=0;
                document.getElementById("intyearofpass").selectedIndex=0;
                document.getElementById("pgbranch").selectedIndex=0;
                document.getElementById("ugbranch").selectedIndex=0;
                document.getElementById("intbranch").selectedIndex=0;


            }
        </script> 

    </head>
    <body>
   
        <div id="header">
  <img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/>
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
<!--Menu-->

        <div id="content"><h3> Welcome &nbsp;<s:property value="#session.uname"/>&nbsp;&nbsp; User id: <s:property value="#session.userid"/> </h3>

            <div align="center">
       
        <s:form onsubmit="return validate();">
              <s:actionmessage/>
              <tr><td><s:textfield name="userId" value="%{userId}" label="User Id" readonly="true"/></td></tr>
           
            <table>
                <table bgcolor="#FFCC66" width="10">
                     <b>Post Graduation(PG)</b> <br>
                    <tr>
                        <td>
                            Degree
                        </td>
                        <td>    
                            <s:select name="pgdegree" id="pgdegree"     
                                      headerKey="0" headerValue="Click to select"
                                      list="{'M.Com','M.Tech','M.E','MSW','MCA','MBA','M.Sc'}"  
                                      theme="simple" value="#{pgdegree}" onchange="validate3();">
                            </s:select>
                        </td>
                        <td>
                            Branch
                        </td>
                        <td>
                            <s:select name="pgbranch" id="pgbranch" 
                                      headerKey="0" headerValue="Click to select" 
                                      list="{'Information Technology','Computer Science and Engineering','Electronics and Comm. Engineering','Electrical Engineering','Finance','Marketing','Human Resource','Accounts','Software Engineering', 'Human Resource','Physics','Chemistry','Biology','Business Administration'}"
                                      theme="simple" disabled="true" value="#{pgbranch}" >		 
                            </s:select>
                        </td>           
                    </tr>
                    <tr>  
                        <td>
                            Institute
                        </td>
                        <td>
                            <s:textfield value="%{pginstitute}" name="pginstitute" theme="simple"  id="pginstitute" disabled="true"></s:textfield>
                        </td>
                        <td>    
                            University/Board
                        </td>
                        <td>
                            <s:textfield value="%{pguniversity}" name="pguniversity" theme="simple" id="pguniversity" disabled="true"> </s:textfield>
                        </td>
                    </tr>
                    <tr>
                        <td>    
                            State
                        </td>
                        <td>
                            <s:select name="pgstate" id="pgstate" 
                                      headerKey="0" headerValue="Click to select"
                                      list="{'Andhra Pradesh',
                                            'Arunachal Pradesh',
                                            'Assam',
                                            'Bihar',
                                            'Chattisgarh',
                                            'Jharkhand',
                                            'Goa',
                                            'Gujarat',
                                            'Haryana',
                                            'Himachal Pradesh',
                                            'Jammu & Kashmir',
                                            'Karnataka',
                                            'Kerala',
                                            'Madhya Pradesh',
                                            'Maharashtra',
                                            'Manipur',
                                            'Meghalaya',
                                            'Mizoram',
                                            'Nagaland',
                                            'Orissa',
                                            'Punjab',
                                            'Rajasthan',
                                            'Sikkim',
                                            'Tamil Nadu',
                                            'Tripura',
                                            'Uttar Pradesh',
                                            'Uttarakhand',
                                            'West Bengal',
                                            'Andaman & Nicobar Islands',
                                            'Chandigarh',
                                            'Delhi',
                                            'Dadar and Nagar Haveli',
                                            'Daman and Diu',
                                            'Lakshadeep',
                                            'Pondicherry'}" 
                                            theme="simple"  value="#{pgstate}" disabled="true">                   
                            </s:select>
                        </td>
                        <td>
                            Location
                        </td>
                        <td>
                            <s:textfield value="%{pglocation}" name="pglocation" id="pglocation" theme="simple" disabled="true"></s:textfield>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Aggregate Range
                        </td>
                        <td>
                            <s:textfield value="%{pgaggregate}" name="pgaggregate" theme="simple" id="pgaggregate" disabled="true"></s:textfield>  
                        </td>
                        <td>
                            Year of Passing
                        </td>
                        <td>
                            <s:select name="pgyearofpass"   id="pgyearofpass"  
                                      headerKey="0" headerValue="Click to select"
                                      list="{'1979','1980','1981','1982','1983','1984','1985','1986','1987','1988','1989','1990','1991','1992','1993','1994','1995',
                                                '1996','1997','1998','1999','2000','2001','2002','2003','2004','2005','2006','2007','2008','2009','2010','2011','2012','2013','2014','2015','2016','2017','2018','2019','2020'}"
         theme="simple"  value="#{pgyearofpass}" disabled="true">		 
                            </s:select>
                        </td>
                    </tr>
                </table>
                <!--UG-->
                <b>Under Graduation(UG)</b>  
                <table bgcolor="#FFCC66" width="10">
                    <tr>
                        <td>
                            Degree

                        </td>
                        <td>    
                            <s:select name="ugdegree" id="ugdegree" 
                                      headerKey="0" headerValue="Click to select"
                                      list="{ 'B.Com',
                                                'B.Tech',
                                                'B.E',
                                                'BCA',
                                                'B.Sc',
                                                'BBM',
                                                'BBA'}" 
                                      theme="simple"  value="#{ugdegree}">		 
                            </s:select>
                        </td>
                        <td>
                            Branch
                        </td>
                        <td>
                            <s:select name="ugbranch"     id="ugbranch" value="#{ugbranch}"
                                      headerKey="0" headerValue="Click to select"
                                      list="{'Information Technology','Computer Science and Engineering','Electronics and Comm. Engineering','Electrical Engineering','Finance','Marketing','Human Resource','Accounts','Software Engineering', 'Human Resource','Physics','Chemistry','Biology','Business Administration'}"
                                      theme="simple">		 
                            </s:select>
                        </td>           
                    </tr>
                    <tr>
                        <td>
                            Institute
                        </td>
                        <td>
                            <s:textfield name = "uginstitute" value="%{uginstitute}"  id="uginstitute"   theme="simple"></s:textfield>
                        </td>
                        <td>    
                            University/Board
                        </td>
                        <td>
                            <s:textfield value="%{uguniversity}" name="uguniversity" theme="simple" id="uguniversity"></s:textfield>
                        </td>
                    </tr>
                    <tr>
                        <td>    
                            State
                        </td>
                        <td>
                            <s:select name="ugstate"  id="ugstate" value="#{ugstate}"  
                                      headerKey="0" headerValue="Click to select"
                                      list="{'Andhra Pradesh',
                                            'Arunachal Pradesh',
                                            'Assam',
                                            'Bihar',
                                            'Chattisgarh',
                                            'Jharkhand',
                                            'Goa',
                                            'Gujarat',
                                            'Haryana',
                                            'Himachal Pradesh',
                                            'Jammu & Kashmir',
                                            'Karnataka',
                                            'Kerala',
                                            'Madhya Pradesh',
                                            'Maharashtra',
                                            'Manipur',
                                            'Meghalaya',
                                            'Mizoram',
                                            'Nagaland',
                                            'Orissa',
                                            'Punjab',
                                            'Rajasthan',
                                            'Sikkim',
                                            'Tamil Nadu',
                                            'Tripura',
                                            'Uttar Pradesh',
                                            'Uttarakhand',
                                            'West Bengal',
                                            'Andaman & Nicobar Islands',
                                            'Chandigarh',
                                            'Delhi',
                                            'Dadar and Nagar Haveli',
                                            'Daman and Diu',
                                            'Lakshadeep',
                                            'Pondicherry'}"  theme="simple" >
                            </s:select>
                        </td>
                        <td>
                            Location
                        </td>
                        <td>
                            <s:textfield value="%{uglocation}" name="uglocation" theme="simple" id="uglocation"></s:textfield>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Aggregate Range
                        </td>
                        <td>
                            <s:textfield  value="%{ugaggregate}" name="ugaggregate" theme="simple" id="ugaggregate"></s:textfield>  
                        </td>
                        <td>
                            Year of Passing
                        </td>
                        <td>
                            <s:select name="ugyearofpass"   id="ugyearofpass"  
                                      headerKey="0" headerValue="Click to select"
                                      list="{'1979','1980','1981','1982','1983','1984','1985','1986','1987','1988','1989','1990','1991','1992','1993','1994','1995',
                                                '1996','1997','1998','1999','2000','2001','2002','2003','2004','2005','2006','2007','2008','2009','2010','2011','2012','2013','2014','2015','2016','2017','2018','2019','2020'}" theme="simple" value="#{ugyearofpass}">		 
                            </s:select>
                        </td>
                    </tr>
                </table>
                <!--Intermediate/Equivalent-->
                <b>Intermediate or Equivalent</b>    
                <table bgcolor="#FFCC66"  width="10">
                    <tr>
                        <td>
                            Degree
                        </td>
                        <td>    
                            <s:select name="intdegree"   id="intdegree"  value="#{intdegree}" 
                                      headerKey="0" headerValue="Click to select"
                                      list="{'Intermediate','Polytechnic','ITI'}" theme="simple">		 
                            </s:select>
                        </td>
                        <td>
                            Branch
                        </td>

                        <td>
                            <s:select name="intbranch"     id="intbranch" value = "#{intbranch}"
                                      headerKey="0" headerValue="Click to select                     "
                                      list="{'MPC','BIPC','CEC','HEC','Mechanical',
                                             'Civil','Computers','Electrical','Computers'}" theme="simple">		 
                            </s:select>
                        </td>
                     
                    </tr>
                    <tr>
                        <td>
                            Institute
                        </td>
                        <td>
                            <s:textfield name="intinstitute" id="intinstitute" value="%{intinstitute}" theme="simple"></s:textfield>
                        </td>
                        <td>    
                            University/Board
                        </td>
                        <td>
                            <s:textfield name="intuniversity" theme="simple" id="intuniversity" value="%{intuniversity}" cssStyle="width:235px"></s:textfield>
                        </td>
                    </tr>
                    <tr>
                        <td>    
                            State
                        </td>
                        <td>
                            <s:select name="intstate"   id="intstate" value="#{intstate}"
                                      headerKey="0" headerValue="Click to select"
                                     list="{'Andhra Pradesh',
                                            'Arunachal Pradesh',
                                            'Assam',
                                            'Bihar',
                                            'Chattisgarh',
                                            'Jharkhand',
                                            'Goa',
                                            'Gujarat',
                                            'Haryana',
                                            'Himachal Pradesh',
                                            'Jammu & Kashmir',
                                            'Karnataka',
                                            'Kerala',
                                            'Madhya Pradesh',
                                            'Maharashtra',
                                            'Manipur',
                                            'Meghalaya',
                                            'Mizoram',
                                            'Nagaland',
                                            'Orissa',
                                            'Punjab',
                                            'Rajasthan',
                                            'Sikkim',
                                            'Tamil Nadu',
                                            'Tripura',
                                            'Uttar Pradesh',
                                            'Uttarakhand',
                                            'West Bengal',
                                            'Andaman & Nicobar Islands',
                                            'Chandigarh',
                                            'Delhi',
                                            'Dadar and Nagar Haveli',
                                            'Daman and Diu',
                                            'Lakshadeep',
                                            'Pondicherry'}"  theme="simple">                   
                            </s:select>
                        </td>
                        <td>
                            Location
                        </td>
                        <td>
                            <s:textfield name="intlocation" theme="simple" id="intlocation" value="%{intlocation}"></s:textfield>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Aggregate Range
                        </td>
                        <td>
                            <s:textfield name="intaggregate"  id="intaggregate" theme="simple" value="%{intaggregate}"></s:textfield>  
                        </td>
                        <td>
                            Year of Passing
                        </td>
                        <td>
                            <s:select name="intyearofpass"   id="intyearofpass" value="#{intyearofpass}" 
                                      headerKey="0" headerValue="Click to select"
                                      list="{'1979','1980','1981','1982','1983','1984','1985','1986','1987','1988','1989','1990','1991','1992','1993','1994','1995',
                                                '1996','1997','1998','1999','2000','2001','2002','2003','2004','2005','2006','2007','2008','2009','2010','2011','2012','2013','2014','2015','2016','2017','2018','2019','2020'}" theme="simple">		 
                            </s:select>
                        </td>
                    </tr>
                </table>
                <!--Tenth/Equivalent-->
                <b>Tenth or Equivalent</b>    
                <table bgcolor="#FFCC66"  width="10">

                    <tr>
                        <td>
                            Institute
                        </td>
                        <td>
                            <s:textfield name="tenthinstitute" id="tenthinstitute" theme="simple" value="%{tenthinstitute}" ></s:textfield>
                        </td>
                        <td>    
                            University/Board
                        </td>
                        <td>
                            <s:textfield name="tenthuniversity" theme="simple" id="tenthuniversity" value="%{tenthuniversity}" cssStyle="width:235px"></s:textfield>
                        </td>
                    </tr>
                    <tr>
                        <td>    
                            State
                        </td>
                        <td>
                            <s:select name="tenthstate"    id="tenthstate" 
                                      headerKey="0" headerValue="Click to select"
                                      list="{'Andhra Pradesh',
                                            'Arunachal Pradesh',
                                            'Assam',
                                            'Bihar',
                                            'Chattisgarh',
                                            'Jharkhand',
                                            'Goa',
                                            'Gujarat',
                                            'Haryana',
                                            'Himachal Pradesh',
                                            'Jammu & Kashmir',
                                            'Karnataka',
                                            'Kerala',
                                            'Madhya Pradesh',
                                            'Maharashtra',
                                            'Manipur',
                                            'Meghalaya',
                                            'Mizoram',
                                            'Nagaland',
                                            'Orissa',
                                            'Punjab',
                                            'Rajasthan',
                                            'Sikkim',
                                            'Tamil Nadu',
                                            'Tripura',
                                            'Uttar Pradesh',
                                            'Uttarakhand',
                                            'West Bengal',
                                            'Andaman & Nicobar Islands',
                                            'Chandigarh',
                                            'Delhi',
                                            'Dadar and Nagar Haveli',
                                            'Daman and Diu',
                                            'Lakshadeep',
                                            'Pondicherry'}"  theme="simple" value="#{tenthstate}">                   
                            </s:select>
                        </td>
                        <td>
                            Location
                        </td>
                        <td>
                            <s:textfield name="tenthlocation" theme="simple" id="tenthlocation" value="%{tenthlocation}"></s:textfield>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Aggregate Range
                        </td>
                        <td>
                            <s:textfield name="tenthaggregate" id="tenthaggregate"  theme="simple" value="%{tenthaggregate}"></s:textfield>  
                        </td>
                        <td>
                            Year of Passing
                        </td>
                        <td>
                            <s:select name="tenthyearofpass"   id="tenthyearofpass"  
                                      headerKey="0" headerValue="Click to select"
                                      list="{'1979','1980','1981','1982','1983','1984','1985','1986','1987','1988','1989','1990','1991','1992','1993','1994','1995',
                                                '1996','1997','1998','1999','2000','2001','2002','2003','2004','2005','2006','2007','2008','2009','2010','2011','2012','2013','2014','2015','2016','2017','2018','2019','2020'}" theme="simple" value="#{tenthyearofpass}">		 
                            </s:select>
                        </td>
                    </tr>
                </table>
            </table>
                         <s:if test="uginstitute==null">
                                <s:submit name="submit" type="button" action="dbhelp"  value="Save" theme= "simple" align="center"/>
                            </s:if>
                            <s:else>
                            <s:submit  action="update_edu" theme="simple"  value="Update"  />
                            </s:else>
                        <input type="button" onclick="refresh()" name="reset" value="Reset" align="center" theme="simple"/>

        </s:form>
            </div>

    </div><!--Content-->

        <div id="footer">
<center>
                <p>@copyright2012<br>
                        Sysbiz Technologies Pvt. Ltd.
            </center>
        </div><!--Footer-->

    </body>
</html>


