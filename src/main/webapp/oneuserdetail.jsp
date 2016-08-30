<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" type="text/css" href="css/style.css" />
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

        <link rel="stylesheet" type="text/css" href="css/displaytag.css" />

        <s:head theme="ajax"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
        <script type="text/javascript">
            function val(){
                alert("hi");
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
            <div align=""right> 
                <a href="SearchHome.action"><b><b>Back</b></b></a></div>
            <center> <s:iterator value="wholeDetailsDTO">
                    <s:label value="%{empid}" name="empid" label="Emp ID"/> 
                </s:iterator>
                <s:tabbedPanel id="list">
                    <s:div id="one" label="Personal Details" theme="ajax" labelposition="top" >
                        <table align="center" width="2" border="2" cellspacing="1" cellpadding="1">
                            <s:iterator value="wholeDetailsDTO">
                                <tr align="Center"><b>Personal Details</b></tr>
                                <tr>
                                    <td  bgcolor="#fff" nowrap align="Center"><b>First Name:</b></td>
                                    <td  bgcolor="#fff" nowrap align="Center"><s:property value="firstName"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fea" nowrap align="Center"><b>Last Name:</b></td>
                                    <td bgcolor="#fea" nowrap align="Center"><s:property value="lastName"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fff" nowrap align="Center"><b>Date of Birth:</b></td>
                                    <td bgcolor="#fff" nowrap align="Center"><s:property value="dob"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fea" nowrap align="Center"><b>Mail ID:</b></td>
                                    <td bgcolor="#fea" nowrap align="Center"><s:property value="Email"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fff" nowrap align="Center"><b>Marital Status:</b></td>
                                    <td bgcolor="#fff" nowrap align="Center"><s:property value="mStatus"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fea" nowrap align="Center"><b>Sex:</b></td>
                                    <td bgcolor="#fea" nowrap align="Center"><s:property value="sex"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fff" align="Center"><b>Temporary Address:</b></td>
                                    <td bgcolor="#fff" align="Center"><s:property value="tempAddr"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fea" align="Center"><b>Permanent  Address:</b></td>
                                    <td bgcolor="#fea" align="Center"><s:property value="perAddr"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fff" nowrap align="Center"><b>Contact Number:</b></td>
                                    <td bgcolor="#fff" nowrap align="Center"><s:property value="mobileNum"/></td>
                                </tr>

                            </s:iterator>
                        </table>
                    </s:div>
                    <s:div id="two" label="Education Details" theme="ajax" labelposition="top" >
                        <b>Educational Details</b>
                        <table align="center" width="2" border="2" cellspacing="1" cellpadding="1">

                            <s:if test="wholeDetailsDTO.pgdegree!=null">   

                                <s:iterator value="wholeDetailsDTO">
                                    <tr>
                                        <td colspan="4" bgcolor="#FFCC66"><center><b> PG Details</b></center></td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#fff" nowrap width="1000px" align="Center"><b>Degree:</b></td>
                                        <td bgcolor="#fff" nowrap  align="Center"><s:property value="pgdegree"/></td>

                                        <td bgcolor="#fff" nowrap align="Center"><b>Branch:</b></td>
                                        <td bgcolor="#fff" nowrap align="Center"><s:property value="pgbranch"/></td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#fea" nowrap width="1000px" align="Center"><b>Institute:</b></td>
                                        <td bgcolor="#fea" nowrap  align="Center"><s:property value="pginstitute"/></td>

                                        <td bgcolor="#fea" nowrap align="Center"><b>University/Board:</b></td>
                                        <td bgcolor="#fea" nowrap align="Center"><s:property value="pguniversity"/></td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#fff" nowrap width="1000px" align="Center"><b>State:</b></td>
                                        <td  bgcolor="#fff" nowrap  align="Center"><s:property value="pgstate"/></td>

                                        <td bgcolor="#fff" nowrap align="Center"><b>Location:</b></td>
                                        <td bgcolor="#fff" nowrap align="Center"><s:property value="pglocation"/></td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#fea" nowrap width="1000px" align="Center"><b>Aggregate:</b></td>
                                        <td bgcolor="#fea" nowrap  align="Center"><s:property value="pgaggregate"/></td>

                                        <td bgcolor="#fea" nowrap align="Center"><b>Year of Pass:</b></td>
                                        <td bgcolor="#fea" nowrap align="Center"><s:property value="pgyearofpass"/></td>
                                    </tr>

                                </s:iterator>
                            </s:if>

                            <s:iterator value="wholeDetailsDTO">
                                <tr>
                                    <td colspan="4" bgcolor="#FFCC66"><center><b> UG Details</b></center></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fff" nowrap width="1000px" align="Center"><b>Degree:</b></td>
                                    <td bgcolor="#fff" nowrap  align="Center"><s:property value="ugdegree"/></td>

                                    <td bgcolor="#fff" nowrap align="Center"><b>Branch:</b></td>
                                    <td bgcolor="#fff" nowrap align="Center"><s:property value="ugbranch"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fea" nowrap width="1000px" align="Center"><b>Institute:</b></td>
                                    <td bgcolor="#fea" nowrap  align="Center"><s:property value="uginstitute"/></td>

                                    <td bgcolor="#fea" nowrap align="Center"><b>University/Board:</b></td>
                                    <td bgcolor="#fea" nowrap align="Center"><s:property value="uguniversity"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fff" nowrap width="1000px" align="Center"><b>State:</b></td>
                                    <td bgcolor="#fff" nowrap  align="Center"><s:property value="ugstate"/></td>

                                    <td bgcolor="#fff" nowrap align="Center"><b>Location:</b></td>
                                    <td bgcolor="#fff" nowrap align="Center"><s:property value="uglocation"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fea" nowrap width="1000px" align="Center"><b>Aggregate:</b></td>
                                    <td bgcolor="#fea" nowrap  align="Center"><s:property value="ugaggregate"/></td>

                                    <td bgcolor="#fea" nowrap align="Center"><b>Year of Pass:</b></td>
                                    <td bgcolor="#fea" nowrap align="Center"><s:property value="ugyearofpass"/></td>
                                </tr>
                            </s:iterator>


                            <s:iterator value="wholeDetailsDTO">
                                <tr>
                                    <td colspan="4" bgcolor="#FFCC66"><center><b>Intermediate or Equivalent Details</b></center></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fff" nowrap width="1000px" align="Center"><b>Degree:</b></td>
                                    <td bgcolor="#fff" nowrap  align="Center"><s:property value="intdegree"/></td>

                                    <td bgcolor="#fff" nowrap align="Center"><b>Branch:</b></td>
                                    <td bgcolor="#fff" nowrap align="Center"><s:property value="intbranch"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fea" nowrap width="1000px" align="Center"><b>Institute:</b></td>
                                    <td bgcolor="#fea" nowrap  align="Center"><s:property value="intinstitute"/></td>

                                    <td bgcolor="#fea" nowrap align="Center"><b>University/Board:</b></td>
                                    <td bgcolor="#fea" nowrap align="Center"><s:property value="intuniversity"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fff" nowrap width="1000px" align="Center"><b>State:</b></td>
                                    <td bgcolor="#fff" nowrap  align="Center"><s:property value="intstate"/></td>

                                    <td bgcolor="#fff" nowrap align="Center"><b>Location:</b></td>
                                    <td bgcolor="#fff" nowrap align="Center"><s:property value="intlocation"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fea" nowrap width="1000px" align="Center"><b>Aggregate:</b></td>
                                    <td bgcolor="#fea" nowrap  align="Center"><s:property value="intaggregate"/></td>

                                    <td bgcolor="#fea" nowrap align="Center"><b>Year of Pass:</b></td>
                                    <td bgcolor="#fea" nowrap align="Center"><s:property value="intyearofpass"/></td>
                                </tr>
                            </s:iterator>

                            <s:iterator value="wholeDetailsDTO">
                                <tr>
                                    <td colspan="4" bgcolor="#FFCC66"><center><b>Tenth or Equivalent Details</b></center></td>
                                </tr>

                                <tr>
                                    <td bgcolor="#fff" nowrap width="1000px" align="Center"><b>Institute:</b></td>
                                    <td bgcolor="#fff" nowrap  align="Center"><s:property value="tenthinstitute"/></td>

                                    <td bgcolor="#fff" nowrap align="Center"><b>University/Board:</b></td>
                                    <td bgcolor="#fff" nowrap align="Center"><s:property value="tenthuniversity"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fea" nowrap width="1000px" align="Center"><b>State:</b></td>
                                    <td bgcolor="#fea" nowrap  align="Center"><s:property value="tenthstate"/></td>

                                    <td bgcolor="#fea" nowrap align="Center"><b>Location:</b></td>
                                    <td bgcolor="#fea" nowrap align="Center"><s:property value="tenthlocation"/></td>
                                </tr>
                                <tr>
                                    <td bgcolor="#fff" nowrap width="1000px" align="Center"><b>Aggregate:</b></td>
                                    <td bgcolor="#fff" nowrap  align="Center"><s:property value="tenthaggregate"/></td>

                                    <td bgcolor="#fff" nowrap align="Center"><b>Year of Pass:</b></td>
                                    <td bgcolor="#fff" nowrap align="Center"><s:property value="tenthyearofpass"/></td>
                                </tr>
                            </s:iterator>
                        </table>
                    </s:div>
                    <s:div id="three" label="Skills and Achievements Details" theme="ajax" labelposition="top" >
                        <b>Skills and Achievements Details</b>
                        <table align="center" width="4"  border="2" cellspacing="1" cellpadding="1">
                            <tr>
                                <td width="250px"align="center" bgcolor="#fea"><b> Skills:</b></td>
                            </tr>
                            <s:iterator value="wholeDetailsDTO">
                                <tr>                              
                                    <td bgcolor="#fff" align="Center"><s:property value="skills"/></td>
                                </tr>
                            </s:iterator>



                            <tr>
                                <td align="center" bgcolor="#fea"><b> Academic Achievements:</b></td>
                            </tr>
                            <s:iterator value="wholeDetailsDTO">
                                <tr>                              
                                    <td bgcolor="#fff" align="Center"><s:property value="acacheive"/></td>
                                </tr>
                            </s:iterator>


                            <tr>
                                <td align="center" bgcolor="#fea"><b> Co-curricular Achievements:</b></td>
                            </tr>
                            <s:iterator value="wholeDetailsDTO">
                                <tr>                              
                                    <td bgcolor="#fff" align="Center"><s:property value="coacheive"/></td>
                                </tr>
                            </s:iterator>
                        </table>
                        <table>
                            <tr>
                                <td>
                                    <s:form action="downloadresume">
                                    
                                        <b align="center">Uploaded Resume:</b>
                                        <s:iterator value="wholeDetailsDTO">
                                            <s:hidden value="%{empid}" name="empid" id="empid" label="Emp ID"/> 
                                        </s:iterator>
                                    <td>
                                       <s:submit value="Download" action="downloadresume" />
                                    </s:form>
                                </td>
                            </tr>
                        </table>
                    </s:div>
                    <s:if test="wholeDetailsDTO.exporfre=='Experienced'">
                        <s:div id="four" label="Experience" theme="ajax" labelposition="top" >
                            <table align="center" width="2" border="2" cellspacing="1" cellpadding="1">
                                <tr>
                                <b>Experience Details:</b>
                                </tr>
                                <s:iterator value="wholeDetailsDTO">
                                    <tr>
                                        <td bgcolor="#fff" nowrap><b>Years of Experience:&nbsp;</b></td>
                                        <td bgcolor="#fff"><s:property value="expyears"/>Years&nbsp;<s:property value="expmonths"/>Months </td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#fea" nowrap align="Center"><b>Organization Name:</b></td>
                                        <td bgcolor="#fea" nowrap align="Center"><s:property value="orgname"/></td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#fff" nowrap align="Center"><b>Industry Name:</b></td>
                                        <td bgcolor="#fff" nowrap align="Center"><s:property value="indname"/></td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#fea" nowrap align="Center"><b>Current Job Role:</b></td>
                                        <td bgcolor="#fea" nowrap align="Center"><s:property value="curjobrole"/></td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#fff" nowrap align="Center"><b>Current Salary:</b></td>
                                        <td bgcolor="#fff" nowrap align="Center"><s:property value="cursal"/></td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#fea" nowrap align="Center"><b>expected Salary:</b></td>
                                        <td bgcolor="#fea" nowrap align="Center"><s:property value="expsal"/></td>
                                    </tr>
                                </s:iterator>
                            </table>
                        </s:div>
                    </s:if>
                </s:tabbedPanel>
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

        <div id=footer>
            <center>
                <p>@copyright2012<br>
                    Sysbiz Technologies Pvt. Ltd.
            </center>
        </div>
    </body>
</html>

