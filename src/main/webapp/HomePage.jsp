<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="css/styles.css" />
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
        <title> Career Portal</title>
        <script type="text/javascript">
            function fun1(f1,username,userpassword)
            {
           
                var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
                var reg1 = /^\w*(?=\w*\d)(?=\w*[a-z])(?=\w*[A-Z])\w*$/;
                var address = document.forms[f1].elements[username].value;
                var address1 = document.forms[f1].elements[userpassword].value;
                var f2=document.getElementById("f1");          
                v1=document.getElementById("userType").selectedIndex;
                if(v1==0){
                    alert(" Select UserType")
                    return false;
                }
                if(f2.username.value==null || f2.username.value==""){
           
                    alert("Enter Email");
                    
                    return false;
                }
                if(reg.test(address) == false) {

                    alert("Invalid Email");
          
                 
                    document.getElementById("t1").value='';
                    return false;
                }
                if(f2.userpassword.value==""){
                    alert("Enter Password");
                    return false;
                }
   
                if(address1.length<5 ){
                    alert("Password should contain atleast 5 characters");
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
               
            }
        
            function clearing(){       
                document.getElementById("t1").value='';
                document.getElementById("t2").value='';
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

                    <li><a  href=""><h3>Home</h3></a></li>
                    <li><a href="http://www.sysbiz.net/web/guest/vision-mission-values"><h3>About Us</h3></a></li>
                    <li><a href="http://www.sysbiz.net/web/guest/life-sciences_pharmaceuticals_device-manufacturers1"><h3>Services</h3></a></li>
                    <li><a href="HomePage.jsp"><h3>Careers</h3></a></li>
                    <li><a href="http://www.sysbiz.com/web/guest/contact-us"><h3>Contact Us</h3></a></li>
                </ul>
            </center>

        </div>
        <s:actionerror/>

        <div id=menu>
            <img src="images/images7.jpeg" width="100" height="100" alt="images6"/>
            <s:form label="Login Form" action="LoginAction" method="post" name="f1" id="f1">
                <s:select headerValue="-----Click to Select-----"  name="userType" headerKey="0" list="{'Administrator','User'}" label="UserType" id="userType" onchange="clearing()" />
                <s:textfield name="username" id="t1" label=" Email " maxlength="50" /><br>
                <s:password name="userpassword" id="t2"  label="Password" maxLength="15"/><br>
                <table>
                    <div>   <tr><td>
                                <s:submit value="Login"  align="justify" theme="simple" onclick="return fun1('f1','username','userpassword');"/>
                                <s:submit type="button" action="register" theme="simple" value="New User"  />
                                <s:reset value="Clear" align="justify" theme="simple" />
                            </td></tr>
                        <tr><br></tr>
                    </div></table>
                </s:form> 


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
            <p>
                <b> Vision</b><br><br>
                To build an Ecosystem of Creativity and Innovation.<br>
                <br><br><b> Mission </b><br><br>
                To enable people and companies to increase their productivity through the use of Information Technologies.<br>
                <br><br><b>Values </b><br><br>

                We believe that our most valuable possession is our People. Sysbiz is not just a gathering of highly skilled individuals, but a family. It is built not only on someone's exceptional skills, but rather on collaboration and teamwork.
                <br><br><br>
                <b> Ecosystem</b><br><br>
                We respect the ecosystem that we live in and do whatever possible to preserve it. We understand the phrase "Software has gone from obscurity to indispensability in less than fifty years" The diversity <br>of our ecosystem helps it to stay resilient.


            </p>
        </div>

        <div id=footer>
            <center>
                <p>@copyright2012<br>
                    Sysbiz Technologies Pvt. Ltd.
            </center>
        </div>

    </body>

</html>

