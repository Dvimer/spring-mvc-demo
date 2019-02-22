<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>
        Student confirmation
    </title>
</head>
<body>
    The student is confirm ${student.firstName} ${student.lastName}
    <br/>
    Country: ${student.country}
    <br/>
    Language: ${student.language}
<a href="/">Home</a>
</body>
</html>