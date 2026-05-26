<%@ page import="aaa.model_p.Member" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% Member mm = (Member)request.getAttribute("member"); %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>memberComplete</title>
</head>
<body>
    <h1>memberComplete</h1>

        <table border="">
            <tr>
                <td>pid</td>
                <td><%=mm.getPid()%></td>
            </tr>
            <tr>
                <td>pname</td>
                <td><%=mm.getPname()%></td>
            </tr>
            <tr>
                <td>age</td>
                <td><%=mm.getAge()%></td>
            </tr>
            <tr>
                <td>height</td>
                <td><%=mm.getHeight()%></td>
            </tr>
            <tr>
                <td>reg_date</td>
                <td><%=mm.getReg_date()%></td>
            </tr>
        </table>

</body>
</html>