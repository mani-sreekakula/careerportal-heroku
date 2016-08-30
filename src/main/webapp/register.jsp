<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<title></title>

<html>
    <head>
        <script type="text/javascript">
            function validate(f1,username,upassword,cpassword) {

                var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
                var reg1 = /^\w*(?=\w*\d)(?=\w*[a-z])(?=\w*[A-Z])\w*$/;
                var address = document.forms[f1].elements[username].value;
                var address1 = document.forms[f1].elements[upassword].value;
                var address2 = document.forms[f1].elements[cpassword].value;
                var f12=document.getElementById("f1");
  
                if(f12.username.value==null || f12.username.value==""){
                    alert("enter Email ");
                    return false;
                }
                if(reg.test(address) == false) {

                    alert("Invalid Email ");
                      document.getElementById("t1").value='';
                             
                    return false;
                }
                if(address1==""){
                    alert("Enter Password");
                    return false;}
   
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
                if(address2==""){
                    alert(" Enter Confirm Password");
                    return false;}
   
                if(!(address1==address2)){
                    alert("Password Mismatch");
                      document.getElementById("t3").value='';
                    return false;}
   
                var id=Math.random().toString(16).substring(2,16);
                f12.id1.value=id;
                alert("Your reference ID is " +f12.id1.value);
            }
            
        </script>

    </head>

    <body>


        <div id=header>
            <a href="http://www.sysbiz.com"><img src="images/Sysbiz-Technologies_logo.png" width="200" height="70" alt="Sysbiz-Technologies_logo"/></a>
        </div>

        <div id=navigation>
              <center>
                <ul>
                   
                    <li><a  href="HomePage.jsp"><h3>Home</h3></a></li>
                    <li><a href="http://www.sysbiz.net/web/guest/vision-mission-values"><h3>About Us</h3></a></li>
                    <li><a href="http://www.sysbiz.net/web/guest/life-sciences_pharmaceuticals_device-manufacturers1"><h3>Services</h3></a></li>
                    <li><a href="HomePage.jsp"><h3>Careers</h3></a></li>
                    <li><a href="http://www.sysbiz.com/web/guest/contact-us"><h3>Contact Us</h3></a></li>
                </ul>
            </center>
        </div>
        <div id=menu>
            
        </div>

         <div id=menu1>
            <marquee behaviour="scroll" direction="up" height="624" position="fixed" onmouseout="this.start()" scrolldelay="100">
                <img src="images/page1-img3.jpg" width="190" height="156" alt="page1-img3"/>
                <img src="images/page4-img1.jpg" width="190" height="156" alt="page4-img1"/>
                <img src="images/page4-img6.jpg" width="190" height="156" alt="page4-img6"/>
                <img src="images/slider-2.jpg" width="190" height="156" alt="slider-2"/>
            </marquee>
        </div>

        <div id=content_area>
            <center>
                <h3>
                    <b>User Registration</b>
                </h3>   </center><center><s:actionerror/>
                <s:form name="f1" id="f1" action="UserListInsertAction" method="post" >
                    <s:hidden name="id1"/>
                    <s:textfield name="username"  id="t1" label="Email" maxlength="50"/><br>
                        <s:password  maxlength="15" name="upassword" id="t2" label="Password "/><br>
                         * Password should be between 5-10 characters.
                         &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<p>* Password must be a combination of lowercase,uppercase and number. </p><br>
                     
                        
                    <s:password name="cpassword" id="t3" maxlength="15" label="Confirm Password" /><br>
                    <table>
                        <div>
                            <tr>
                                <td> <s:submit name="submit" value="Submit"  align="justify" theme="simple" onclick="javascript:return validate('f1','username','upassword','cpassword');" />
                                    <s:reset value="Clear" align="justify" theme="simple" /></td>
                            </tr></div>
                    </table>
                </s:form></center>

        </div>

        <div id=footer>
            <center>
                <p>@copyright 2012<br>
                    Sysbiz Technologies Pvt. Ltd.</p>
            </center>
        </div>


    </body>
</html>