<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Name is ${student.name}</h1>
<h1>Student Id is ${student.id}</h1>
<h1>Student Dob is ${student.dob}</h1>
<h1>Student Subject is ${student.subject }</h1>
<h1>Student Gender is ${student.gender }</h1>
<h1>Student Type is ${student.type }</h1>
<hr/>
<h1>Student Street Address is ${student.address.street }</h1>
<h1>Student City  is ${student.address.city }</h1>
</body>
</html>
