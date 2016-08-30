<%-- 
    Document   : emailverify
    Created on : Jul 2, 2012, 4:20:05 PM
    Author     : manikanta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib  uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email Verify</title>
        <script type="text/javascript">
            function emailverify(){
            <%
    String s1 = request.getParameter("empid");
    System.out.println(s1);
            %>
        var field="<%=s1%>";
        v2=document.getElementById("field1").value=field;
        alert("Your Id Is:-"+document.getElementById("field1").value);
        var v1="emailver.action?field1="+v2;
        document.location=v1;
        return false;    
    }
        </script>

    </head>
    <body onload="emailverify()">
    <s:hidden name="field1" id="field1"/>
    </body>
</html>
