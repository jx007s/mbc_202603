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
    <title>시험목록</title>
</head>
<body>
    <h1>시험목록</h1>
    <table border="">
        <tr>
            <td colspan="7">
                <form action="list">
                    학생
                    <input type="text" name="schVal" value="<%=pInfo.getSchVal()%>">

                    <input type="radio" name="nameVal" value="semi">중간
                    <input type="radio" name="nameVal" value="final">기말
                    <input type="submit" value="검색">
                </form>
            </td>

        </tr>
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
            <td><%=dto.getRegDate()%></td>
            <td>
                <a href="detail?pNo=<%=pInfo.getPNo()%>&id=<%=dto.getId()%>"><%=dto.getPid()%></a>
                </td>
            <td><%=dto.getKor()%></td>
            <td><%=dto.getEng()%></td>
            <td><%=dto.getMat()%></td>
        </tr>
        <%}%>

        <tr>
            <td colspan="7" align="center">
                <% if(pInfo.getStartPage()>1){%>
                    <a href="list?pNo=<%=pInfo.getStartPage()-1%>">[이전]</a>
                <%}%>
                <% for (int i = pInfo.getStartPage(); i <=pInfo.getEndPage(); i++) {
                    if(pInfo.getPNo()==i){
                %>
                    [<%=i%>]
                <%}else{%>
                    <a href="list?pNo=<%=i%>"><%=i%></a>
                <%}}%>
                <% if(pInfo.getTotalPage()>pInfo.getEndPage()){%>
                    <a href="list?pNo=<%=pInfo.getEndPage()+1%>">[다음]</a>
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