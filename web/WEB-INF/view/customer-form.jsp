<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2/23/19
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error {
            color: red
        }
    </style>
</head>
<body>
<i>Fill out the form. Asterisk (*) means required.</i>
<form:form action="processForm" modelAttribute="customer">
    First Name : <form:input path="firstName"/>
    <br/>
    Last Name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
