<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>memberForm</title>
</head>
<body>
    <h1>memberForm</h1>
    <form method="post">
        <table border="">
            <tr>
                <td>pid</td>
                <td><input type="text" name="pid"></td>
            </tr>
            <tr>
                <td>pname</td>
                <td><input type="text" name="pname"></td>
            </tr>
            <tr>
                <td>age</td>
                <td><input type="number" name="age"></td>
            </tr>
            <tr>
                <td>height</td>
                <td><input type="text" name="height"></td>
            </tr>
            <tr>
                <td>reg_date</td>
                <td><input type="date" name="reg_date"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="가입"></td>
            </tr>
        </table>
    </form>
</body>
</html>