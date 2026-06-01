<%@ page import="java.util.List" %>
<%@ page import="aaa.exam_p.model.ExamDTO" %>
<%@ page import="aaa.exam_p.model.PageInfo" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PageInfo pInfo = (PageInfo)request.getAttribute("pageInfo");
    ExamDTO dto = (ExamDTO)request.getAttribute("mainData");
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>시험상세</title>
</head>
<body>
    <h1>시험상세</h1>
    <table border="">
        <tr>
            <td>학기</td><td><%=dto.getHakgi()%></td>
        </tr><tr>
            <td>종류</td><td><%=dto.getName()%></td>
        </tr><tr>
            <td>시험일</td><td><%=dto.getRegDate()%></td>
        </tr><tr>
            <td>학생</td><td><%=dto.getPid()%></td>
        </tr><tr>
            <td>국어</td> <td><%=dto.getKor()%></td>
        </tr><tr>
            <td>영어</td><td><%=dto.getEng()%></td>
        </tr><tr>
            <td>수학</td><td><%=dto.getMat()%></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <a href="list?pNo=<%=pInfo.getPNo()%>">목록으로</a>
                <a href="modifyForm?pNo=<%=pInfo.getPNo()%>&id=<%=dto.getId()%>">수정</a>
                <a href="delete?pNo=<%=pInfo.getPNo()%>&id=<%=dto.getId()%>">삭제</a>
            </td>
        </tr>
    </table>

</body>
</html>