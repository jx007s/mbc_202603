<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>examForm</title>
</head>
<body>
    <h1>examForm</h1>
    <form method="post">
        <table border="">
            <tr>
                <td>이름</td>
                <td>국어</td>
                <td>영어</td>
                <td>수학</td>
            </tr>
            <% for (int i = 0;i<5;i++) { %>
            <tr>
                <td><input type="text" name="studs[<%=i%>].pname"></td>
                <td><input type="text" name="studs[<%=i%>].kor"></td>
                <td><input type="text" name="studs[<%=i%>].eng"></td>
                <td><input type="text" name="studs[<%=i%>].mat"></td>

            </tr>
            <%}%>

            <tr>
                <td colspan="4" align="center"><input type="submit" value="제출"></td>
            </tr>
        </table>
    </form>
</body>
</html>