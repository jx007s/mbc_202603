<%@ page import="aaa.model_p.Person" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%
    Person pp = (Person)request.getAttribute("pp");
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>commit</title>
</head>
<body>
<h1>commit</h1>
<h2></h2>
    <table border="">
        <tr>
            <td>이름</td>
            <td><%=pp.getPname()%></td>
        </tr>
        <tr>
            <td>나이</td>
            <td><%=pp.getAge()%></td>
        </tr>
        <tr>
            <td>결혼</td>
            <td><%=pp.isMarriage()%></td>
        </tr>
    </table>
</body>
</html>