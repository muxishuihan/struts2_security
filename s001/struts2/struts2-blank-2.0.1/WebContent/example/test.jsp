<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Sign On</title>
</head>

<body>

<s:form name="mm" action="Login">
    <s:textfield label="%{getText('username')}" name="username11" id="1"/>
    <s:password label="%{getText('password')}" name="password11" id="2"/>
    
</s:form>
<button onclick="confirmDel()">弹</button>
<script type="text/javascript">
 function confirmDel(){
    
    alert(document.mm.username11.value);
 }
 </script>
</body>
</html>
