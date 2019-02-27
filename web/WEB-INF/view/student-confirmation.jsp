
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
    <br/>
    Operating System:
    <ul>
        <li>${student.operatingSystem[0]}</li>
        <li>${student.operatingSystem[1]}</li>
        <li>${student.operatingSystem[2]}</li>
    </ul>
<a href="/">Home</a>
</body>
</html>