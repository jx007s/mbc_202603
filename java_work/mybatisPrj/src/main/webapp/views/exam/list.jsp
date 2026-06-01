<%@ page import="java.util.List" %>
<%@ page import="aaa.exam_p.model.ExamDTO" %>
<%@ page import="aaa.exam_p.model.PageInfo" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PageInfo pInfo = (PageInfo)request.getAttribute("pInfo"); %>
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
            <td>학기</td>
            <td>종류</td>
            <td>시험일</td>
            <td>학생</td>
            <td>국어</td>
            <td>영어</td>
            <td>수학</td>
        </tr>
        <% for(ExamDTO dto: (List<ExamDTO>)request.getAttribute("mainData")) {%>
        <tr>
            <td><%=dto.getHakgi()%></td>
            <td><%=dto.getName()%></td>
            <td><%=dto.getReg_date()%></td>
            <td><%=dto.getPid()%></td>
            <td><%=dto.getKor()%></td>
            <td><%=dto.getEng()%></td>
            <td><%=dto.getMat()%></td>
        </tr>
        <%}%>

        <tr>
            <td colspan="7" align="center">
                <% for (int i = 1; i < 10; i++) {

                %>
                    <a href="list?pNo=<%=i%>"><%=i%></a>
                <%}%>
            </td>
        </tr>

        <tr>
            <td colspan="7" align="right">
                <a href="insertForm">시험등록</a>
            </td>
        </tr>
    </table>

</body>
</html>