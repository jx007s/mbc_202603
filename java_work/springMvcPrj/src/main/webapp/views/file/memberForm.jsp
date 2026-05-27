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
    <form method="post" enctype="multipart/form-data">
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
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td>height</td>
                <td><input type="text" name="height"></td>
            </tr>
            <tr>
                <td>사진</td>
                <td><input type="file" name="pic"></td>
            </tr>
            <tr>
                <td>이력서</td>
                <td><input type="file" name="resume" ></td>
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