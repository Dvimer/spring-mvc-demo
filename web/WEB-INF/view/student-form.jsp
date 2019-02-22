<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>
        Hellow World!
    </title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First Name: <form:input path="firstName"/>
    <br/>
    Lasst Name: <form:input path="lastName"/>
    <br/>
    <form:select path="country">
        <form:options items="${countryOptions}"/>
    </form:select>
    <br/>
    Java: <form:radiobutton path="language" value="Java"/>
    C#: <form:radiobutton path="language" value="C#"/>
    C++: <form:radiobutton path="language" value="C++"/>
    PHP: <form:radiobutton path="language" value="PHP"/>

    <input type="submit" value="Submit">
</form:form>
<a href="/">Home</a>
</body>
</html>