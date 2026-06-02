<%@ page import="java.util.List" %>
<%@ page import="aaa.exam_p.model.ExamDTO" %>
<%@ page import="aaa.exam_p.model.PageInfo" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PageInfo pInfo = (PageInfo)request.getAttribute("pageInfo"); %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>시험목록2</title>
</head>
<body>
    <h1>시험목록2</h1>
    <table border="">
        <tr>
            <td colspan="7">
                <form action="list2">
                    <input type="radio" name="classNo" value="1">국어
                    <input type="radio" name="classNo" value="2">영어
                    <input type="radio" name="classNo" value="3">수학
                    <input type="submit" value="과목선택">
                </form>
            </td>

        </tr>
        <tr>
            <td>학기</td>
            <td>종류</td>
            <td>시험일</td>
            <td>학생</td>
            <td>점수</td>
        </tr>
        <% for(ExamDTO dto: (List<ExamDTO>)request.getAttribute("mainData")) {%>
        <tr>
            <td><%=dto.getHakgi()%></td>
            <td><%=dto.getName()%></td>
            <td><%=dto.getRegDate()%></td>
            <td>
                <a href="detail?pNo=<%=pInfo.getPNo()%>&id=<%=dto.getId()%>"><%=dto.getPid()%></a>
                </td>
            <td><%=dto.getJum()%></td>
        </tr>
        <%}%>

        <tr>
            <td colspan="7" align="right">
                <a href="insertForm">시험등록</a>
            </td>
        </tr>
    </table>

</body>
</html>