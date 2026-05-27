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
                <td  colspan="2">정렬기준
                    <input type="radio" name="ordTitle" value="pname">이름
                    <input type="radio" name="ordTitle" value="tot">합계
                </td>
                <td  colspan="2">정렬방향
                    <input type="radio" name="ordDir" value="asc">오름차순
                    <input type="radio" name="ordDir" value="desc">내림차순
                </td>
            </tr>
            <tr>
                <td>이름</td>
                <td>국어</td>
                <td>영어</td>
                <td>수학</td>
            </tr>
            <% for (int i = 0;i<5;i++) { %>
            <tr>
                <td><input type="text" name="studs[<%=i%>].pname" value="빈<%=i%>"></td>
                <td><input type="text" name="studs[<%=i%>].kor" value="<%=(int)(Math.random()*60+40)%>"></td>
                <td><input type="text" name="studs[<%=i%>].eng" value="<%=(int)(Math.random()*60+40)%>"></td>
                <td><input type="text" name="studs[<%=i%>].mat" value="<%=(int)(Math.random()*60+40)%>"></td>

            </tr>
            <%}%>

            <tr>
                <td colspan="4" align="center"><input type="submit" value="제출"></td>
            </tr>
        </table>
    </form>
</body>
</html>