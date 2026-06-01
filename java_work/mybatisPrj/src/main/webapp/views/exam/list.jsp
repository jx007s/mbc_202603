<%@ page import="java.util.List" %>
<%@ page import="aaa.exam_p.model.ExamDTO" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>시험목록</title>
</head>
<body>
    <h1>시험목록</h1>
    <table border="">
        <tr>
            <td></td>
        </tr>
        <% for(ExamDTO dto: (List<ExamDTO>)request.getAttribute("mainData")) {%>
        <tr>
            <td></td>
        </tr>
        <%}%>
        <tr>
            <td></td>
        </tr>
    </table>

</body>
</html>