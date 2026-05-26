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
<h2>작성1</h2>
<form method="post" >
    <table border="">
        <tr>
            <td>이름</td>
            <td><input type="text" name="pname"></td>
        </tr>
        <tr>
            <td>나이</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td>결혼</td>
            <td><input type="text" name="marriage"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="작성1"></td>
        </tr>
    </table>
</form>



<h2>작성2</h2>
<form method="post" action="commit2">
    <table border="">
        <tr>
            <td>이름</td>
            <td><input type="text" name="pname"></td>
        </tr>
        <tr>
            <td>나이</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td>결혼</td>
            <td><input type="text" name="marriage"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="작성2"></td>
        </tr>
    </table>
</form>

<h2>작성3</h2>
<form method="post" action="commit3">
    <table border="">
        <tr>
            <td>이름</td>
            <td><input type="text" name="pname"></td>
        </tr>
        <tr>
            <td>나이</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td>결혼</td>
            <td><input type="text" name="marriage"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="작성3"></td>
        </tr>
    </table>
</form>

<h2>작성4</h2>
<form method="post" action="commit4">
    <table border="">
        <tr>
            <td>이름</td>
            <td><input type="text" name="pname"></td>
        </tr>
        <tr>
            <td>나이</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td>결혼</td>
            <td><input type="text" name="marriage"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="작성4"></td>
        </tr>
    </table>
</form>

</body>
</html>