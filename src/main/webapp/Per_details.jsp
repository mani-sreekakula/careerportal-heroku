<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="css/styles.css" >
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
                 <meta http-equiv="refresh" content="300" />
        <s:head theme="ajax" />

      <script type="text/javascript">
             var dob = dojo.widget.byId("dob");
                var dobValue = dob.getValue();
            function validate()
            { 
                var iChars = "!@#$%^&*()+=-[]\\\';,./{}|\":<>?";
                var letterNumber = /^[a-zA-Z\ ]+$/;
                var firstName=document.getElementById("firstName").value;
                var lastName=document.getElementById("lastName").value;
                var dob = dojo.widget.byId("dob");
                var dobValue = dob.getValue();
                var mobileNum=document.getElementById("mobileNum").value;
                var tempAddr1=document.getElementById("AddrLine1").value;
                var tempAddr2=document.getElementById("AddrLine2").value;
                var Dist=document.getElementById("Dist").value;
                var city=document.getElementById("city").value;
                var stateValue=document.getElementById("state").value;
                var zipcode=document.getElementById("pin").value;

                var AddrLine12=document.getElementById("AddrLine12").value;
                var AddrLine22=document.getElementById("AddrLine22").value;
                var Dist2=document.getElementById("Dist2").value;
                var city2=document.getElementById("city2").value;
                var state2=document.getElementById("state2").value;
                var pin2=document.getElementById("pin2").value;
                
                if(firstName.trim()=="" || firstName==null)
                {
                    alert("First Name Required");
                    return false;
                }

             
                for (var i = 0; i < document.f1.firstName.value.length; i++){

    if (iChars.indexOf(document.f1.firstName.value.charAt(i)) != -1) {
        alert("First Name should not have special character");
        return false;
           }

    }
    if(!(firstName.match(letterNumber))){
        alert("First Name should have only alphabets");
        return false;
    }
                if(lastName.trim()==""|| lastName==null){
                    alert("Last Name Required");
                    return false;
                }
                if(!(lastName.match(letterNumber))){
        alert("Last Name should have only alphabets");
        return false;
    }
                for (var i = 0; i < document.f1.lastName.value.length; i++){

    if (iChars.indexOf(document.f1.lastName.value.charAt(i)) != -1) {
        alert("Last Name should not have special character");
        return false;
           }

    }
                  
                if(dobValue.trim()==""){
                    alert("Date of Birth Required");
                    return false;
                }
                if (!document.getElementsByName("mStatus")[0].checked && !document.getElementsByName("mStatus")[1].checked)
                {
                    alert("Marital Status Reqired");
                    return false;
                }
                
                if (!document.getElementsByName("sex")[0].checked && !document.getElementsByName("sex")[1].checked)
                {
                    alert("Sex Reqired");
                    return false;
                }
               
                if(mobileNum.trim()==""){
                    alert("Mobile No Required");
                    return false;
                }

         for (var i = 0; i < document.f1.mobileNum.value.length; i++){

    if (iChars.indexOf(document.f1.mobileNum.value.charAt(i)) != -1) {
        alert("Mobile No should not have special character");
        return false;
           }
         }
          if(!(parseFloat(mobileNum) == parseInt(mobileNum))){
                    alert("Mobile No should contain numeric values only.");
                    return false;
                }
            if((mobileNum.match(letterNumber))){
        alert("Mobile No should not have alphabets");
        return false;
    }

                if(mobileNum.length<10){
                    alert("Mobile No should contain 10 characters");
                    return false; 
                }
                if(mobileNum.length>10){
                    alert("Mobile No cannot be more than 10 characters");
                }
                
                if(tempAddr1.trim()==""){
                    alert("Address Line1 Required");
                    return false;  
                }
               
                if(Dist.trim()==""){
                    alert("District Required");
                    return false;
                }
                
                            if(!(Dist.match(letterNumber))){
        alert("District should have only alphabets");
        return false;
    }

                 for (var i = 0; i < document.f1.Dist.value.length; i++){

    if (iChars.indexOf(document.f1.Dist.value.charAt(i)) != -1) {
        alert("District should not have special character");
        return false;
           }
         }
                if(city.trim()==""){
                    alert("City Required");
                    return false;
                }
                 if(!(city.match(letterNumber))){
        alert("City should have only alphabets");
        return false;
    }
     for (var i = 0; i < document.f1.city.value.length; i++){

    if (iChars.indexOf(document.f1.city.value.charAt(i)) != -1) {
        alert("City should not have special character");
        return false;
           }
         }
               
                if(stateValue.trim()==""){
                    alert("State Required ");
                    return false;
                }
                if(zipcode.trim()==""){
                    alert("Zip Code Required");
                    return false;
                }
                if(zipcode.length<6){
                    alert("Zip Code cannot be less than 6 digit.");
                    return false;
                }
                 if(zipcode.length>6){
                    alert("Zip Code cannot be more than 6 digit.");
                    return false;
                }
                  if(!(parseFloat(zipcode) == parseInt(zipcode))){
                    alert("Zip Code should contain numeric values only.");
                    return false;
                }
                    if((isNaN(zipcode))){
                    alert("Zipcode should contain numeric values only.");
                    return false;
                }
                if(AddrLine12.trim()==""){
                    alert("Address Line1 Required");
                    return false;
                }
                if(AddrLine22.trim()==""){
                    alert("Address Line2 Required");
                    return false;
                }
                if(Dist2.trim()==""){
                    alert("District Required");
                    return false;
                }
                
                 if(!(Dist2.match(letterNumber))){
        alert("District should have only alphabets");
        return false;
    }
                   for (var i = 0; i < document.f1.Dist2.value.length; i++){

    if (iChars.indexOf(document.f1.Dist2.value.charAt(i)) != -1) {
        alert("District should not have special character");
        return false;
           }
         }
                if(city2.trim()==""){
                    alert("City Required");
                    return false;
                }
              if(!(city2.match(letterNumber))){
        alert("City should have only alphabets");
        return false;
    }
        for (var i = 0; i < document.f1.city2.value.length; i++){

    if (iChars.indexOf(document.f1.city2.value.charAt(i)) != -1) {
        alert("City should not have special character");
        return false;
           }
         }
                if(state2.trim()==""){
                    alert("State Required");
                    return false;
                }
                if(pin2.trim()==""){
                    alert("Zip Code Required");
                    return false;
                }
              if(pin2.length<6){
                    alert("Zip Code cannot be less than 6 digit.");
                    return false;
                }
                 if(pin2.length>6){
                    alert("Zip Code cannot be more than 6 digit.");
                    return false;
                }
                  if(!(parseFloat(pin2) == parseInt(pin2))){
                    alert("Zip Code should contain numeric values only.");
                    return false;
                }
                    if((isNaN(pin2))){
                    alert("Zipcode should contain numeric values only.");
                    return false;
                }
                var AddrLine121=document.getElementById("AddrLine12");
                var AddrLine221=document.getElementById("AddrLine22");
                var Dist21=document.getElementById("Dist2");
                var city21=document.getElementById("city2");
                var state21=document.getElementById("state2");
                var pin21=document.getElementById("pin2");
                 AddrLine121.disabled=false;
                 AddrLine221.disabled=false;
                 Dist21.disabled=false;
                 city21.disabled=false;
                 state21.disabled=false;
                 pin21.disabled=false;
            }
            
            function validate2(){
               
        
                var ch2=document.getElementById("ch1").checked;
                var tempAddr1=document.getElementById("AddrLine1").value;
                var tempAddr2=document.getElementById("AddrLine2").value;
                var dist=document.getElementById("Dist").value;
                var city=document.getElementById("city").value;
                var stateValue=document.getElementById("state").value;
                var zipcode=document.getElementById("pin").value;
                var AddrLine12=document.getElementById("AddrLine12");
                var AddrLine22=document.getElementById("AddrLine22");
                var Dist2=document.getElementById("Dist2");
                var city2=document.getElementById("city2");
                var state2=document.getElementById("state2");
                var pin2=document.getElementById("pin2");
                    
                if(ch2==true){
                    document.getElementById("AddrLine12").value=tempAddr1;
                    document.getElementById("AddrLine22").value=tempAddr2;
                    document.getElementById("Dist2").value=dist;
                    document.getElementById("city2").value=city;
                    document.getElementById("state2").value=stateValue;
                    document.getElementById("pin2").value=zipcode;

                }
               if(ch2==false){
                  document.getElementById("AddrLine12").value="";
                  document.getElementById("AddrLine22").value="";
                  document.getElementById("Dist2").value="";
                  document.getElementById("city2").value="";
                  document.getElementById("state2").selectedIndex=0;
                  document.getElementById("pin2").value="";


               }
               if(ch2==true){
       AddrLine12.disabled=true;
       AddrLine22.disabled=true;
       Dist2.disabled=true;
       city2.disabled=true;
       state2.disabled=true;
       pin2.disabled=true;

               }
        else{
             AddrLine12.disabled=false;
       AddrLine22.disabled=false;
       Dist2.disabled=false;
       city2.disabled=false;
       state2.disabled=false;
       pin2.disabled=false;
        }
            }
       

            

            

           
            function refresh(){
             
                document.getElementById("firstName").value="";
                document.getElementById("lastName").value="";
                document.getElementById("AddrLine1").value="";
                document.getElementById("AddrLine2").value="";
                document.getElementById("mobileNum").value="";
                document.getElementsByName("mStatus")[0].checked=false;
                document.getElementsByName("mStatus")[1].checked=false;
                document.getElementsByName("sex")[0].checked=false;
                document.getElementsByName("sex")[1].checked=false;
                document.getElementById("AddrLine12").value="";
                document.getElementById("AddrLine22").value="";
                document.getElementById("Dist2").value="";
                document.getElementById("city2").value="";
                document.getElementById("state2").selectedIndex=0;
                document.getElementById("pin2").value=""; 
                document.getElementById("Dist").value="";
                document.getElementById("city").value="";
                document.getElementById("state").selectedIndex=0;
                document.getElementById("pin").value="";
                
            }
            
        </script> 
        <title>Personal Page</title>
    </head>
    <body onload="validate2()" >

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
        </div>
        <h3> Welcome &nbsp;<s:property value="#session.uname"/>&nbsp;&nbsp; User id: <s:property value="#session.userid"/></h3>
            <center><h1><b>PERSONAL DETAILS</b></h1></center>
            <s:form onsubmit="return validate();" name="f1" id="f1" validate="true">
                <table align="center">
                    <s:actionmessage/>

                    <tr><td><s:textfield name="userId" value="%{userId}" label="User Id" readonly="true"/></td></tr>
                    <tr><td><s:textfield name="firstName" id ="firstName" value="%{firstName}" label="First Name"/></td></tr>
                    <tr><td><s:textfield name="lastName" value="%{lastName}" id="lastName" label="Last Name"/></td></tr>
                    <tr><td><s:datetimepicker name="birthDate" value="%{birthDate}" label="Date of Birth" id="dob" displayFormat="dd-MM-yyyy" /></td></tr>
                    <tr><td><s:radio name="mStatus" value="%{mStatus}" label="Marital Status" id="mStatus" list="{'Married','Unmarried'}"/></td></tr>
                    <tr><td><s:radio name="sex" value="%{sex}" label="Sex" id="sex" list="{'Male','Female'}"/></td></tr>
                    <tr><td><s:textfield name="uEmail" value="%{uEmail}" id="uEmail" label="Email" readonly="true"/></td></tr>
                    <tr><td><s:textfield name="mobileNum" value="%{mobileNum}" id="mobileNum" label="Mobile No" maxLength="10"/></td></tr>
                    <tr><td><i>Temporary Address:</i><s:textfield name="AddrLine1" value="%{AddrLine1}" id="AddrLine1" label="Address Line1"/></td></tr>
                  <tr><td>  <s:textfield name="AddrLine2" value="%{AddrLine2}" id="AddrLine2" label="Address Line2"/></td></tr>
                   <tr><td> <s:textfield name="Dist" value="%{Dist}" id="Dist" label="District"/></td></tr>
                  <tr><td>  <s:textfield name="city" value="%{city}" id="city" label="City"/></td></tr>
                
                    <tr><td><s:select name="state" value="%{state}" label="State" id="state" headerKey="0" headerValue="---Please Select---"
                              list="{'Andhra Pradesh','Arunachal Pradesh','Assam','Bihar','Chhatisgarh','Goa','Gujarat','Haryana','Himachal Pradesh','Jammu & Kashmir','Jharkhand','Karnataka','Kerala','Madhya Pradesh','Maharashtra','Nagaland','Orissa','Uttar Pradesh','Tamil Nadu','others'}"/></td></tr>
                    
                 <tr><td>   <s:textfield name="pin" value="%{pin}" id="pin" label="Zip Code" maxLength="6"/></td></tr>
                 <tr><td><i>Permanent Address: </i><s:checkbox name="ch1" id="ch1" label="Click if same as Temporary Address" onclick="validate2();"  />
                         <tr><td>   <s:textfield name="AddrLine12" value="%{AddrLine12}" id="AddrLine12" label="Address Line1"/></td></tr>
              <tr><td>      <s:textfield name="AddrLine22" value="%{AddrLine22}" id="AddrLine22" label="Address Line2"/></td></tr
                <tr><td>    <s:textfield name="Dist2" value="%{Dist2}" id="Dist2" label="District"/></td></tr>
                   <tr><td> <s:textfield name="city2" value="%{city2}" id="city2" label="City"/></td></tr>
                <tr><td><s:select name="state2" value="%{state2}" label="State" id="state2" headerKey="0" headerValue="---Please Select---" 
                              list="{'Andhra Pradesh','Arunachal Pradesh','Assam','Bihar','Chhatisgarh','Goa','Gujarat','Haryana','Himachal Pradesh','Jammu & Kashmir','Jharkhand','Karnataka','Kerala','Madhya Pradesh','Maharashtra','Nagaland','Orissa','Uttar Pradesh','Tamil Nadu','others'}"/></td></tr>
                   <tr><td> <s:textfield name="pin2" value="%{pin2}" id="pin2" label="Zip Code"/></td></tr>
                </table>
                <table>
                    <tr>
                    <div align="center">
                        <br/>
                        <s:if test="firstName==null">
                        <s:submit name="submit" type="button" action="insert" value="Save" align="center" theme="simple" />
                        </s:if>
                        <s:else>
                        <s:submit action="update1" align="center" theme="simple" value="Update"  />
                        </s:else>
                        <input type="button" onclick="refresh()" name="reset" value="Reset" align="center" theme="simple"/>
                  

                    </div>
                    </tr>
                </table>

            </s:form>
            <div id="footer">
                <center>
                    <p>@copyright2012<br>
                        Sysbiz Technologies Pvt. Ltd.
                </center>
            </div>
    </body>
</html>
