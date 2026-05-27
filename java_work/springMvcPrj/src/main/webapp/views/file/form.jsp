<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>form</title>
</head>
<body>
    <h1>form</h1>
    <form method="post" enctype="multipart/form-data">
        <table border="">
            <tr>
                <td>pname</td>
                <td><input type="text" name="pname"></td>
            </tr>
            <tr>
                <td>age</td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td>up1</td>
                <td><input type="file" name="up1"></td>
            </tr>
            <tr>
                <td>up2</td>
                <td><input type="file" name="up2" multiple></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="작성">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>