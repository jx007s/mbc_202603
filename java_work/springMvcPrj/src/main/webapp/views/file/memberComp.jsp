<%@ page import="aaa.model_p.Member" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% Member pp = (Member)request.getAttribute("member"); %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>memberComp</title>
</head>
<body>
    <h1>memberComp</h1>

        <table border="">
            <tr>
                <td>pid</td>
                <td><%=pp.getPid()%></td>
            </tr>
            <tr>
                <td>pname</td>
                <td><%=pp.getPname()%></td>
            </tr>
            <tr>
                <td>age</td>
                <td><%=pp.getAge()%></td>
            </tr>
            <tr>
                <td>height</td>
                <td><%=pp.getHeight()%></td>
            </tr>
            <tr>
                <td>가입일</td>
                <td><%=pp.getReg_date()%></td>
            </tr>
            <tr>
                <td>사진</td>
                <td>
                    <img width="200px" src="/fff/<%=pp.picStr()%>" alt="">
                </td>
            </tr>
            <tr>
                <td>이력서</td>
                <td><%=pp.resumeStr()%></td>
            </tr>
        </table>

</body>
</html>