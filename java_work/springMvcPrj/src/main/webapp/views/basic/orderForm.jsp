<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>orderForm</title>
</head>
<body>
    <h1>orderForm</h1>
    <form method="post">
        <table border="">
            <tr>
                <td>제품명</td>
                <td>단가</td>
                <td>수량</td>
            </tr>
            <% for (int i = 0;i<4;i++) { %>
            <tr>
                <td><input type="text" name="prod[<%=i%>].title"></td>
                <td><input type="text" name="prod[<%=i%>].price"></td>
                <td><input type="text" name="prod[<%=i%>].cnt"></td>
            </tr>
            <%}%>
            <tr>
                <td rowspan="3">주소</td>
                <td>우편번호</td>
                <td><input type="text" name="addr.zipcode"></td>
            </tr>
            <tr>
                <td>기본주소</td>
                <td><input type="text" name="addr.basic"></td>
            </tr>
            <tr>
                <td>상세주소</td>
                <td><input type="text" name="addr.detail"></td>
            </tr>
            <tr>
                <td colspan="3"><input type="submit" value="구매"></td>
            </tr>
        </table>
    </form>
</body>
</html>