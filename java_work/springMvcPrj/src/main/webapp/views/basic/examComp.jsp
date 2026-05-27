<%@ page import="aaa.model_p.Exam" %>
<%@ page import="aaa.model_p.Stud" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% Exam exam = (Exam)request.getAttribute("exam"); %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>examComp</title>
</head>
<body>
    <h1>examComp</h1>

        <table border="">
            <tr>
                <td>이름</td>
                <td>국어</td>
                <td>영어</td>
                <td>수학</td>
                <td>총점</td>
                <td>평균</td>
            </tr>
            <% for (Stud st : exam.calc()) { %>
            <tr>
                <td><%=st.getPname()%></td>
                <td><%=st.getJum(0)%></td>
                <td><%=st.getJum(1)%></td>
                <td><%=st.getJum(2)%></td>
                <td><%=st.getTot()%></td>
                <td><%=st.getAvg()%></td>
            </tr>
            <%}%>


        </table>

</body>
</html>