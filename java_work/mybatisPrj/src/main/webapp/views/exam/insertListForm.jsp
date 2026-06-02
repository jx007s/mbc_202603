<%@ page import="java.util.List" %>
<%@ page import="aaa.exam_p.model.ExamDTO" %>
<%@ page import="aaa.exam_p.model.PageInfo" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PageInfo pInfo = (PageInfo)request.getAttribute("pageInfo");
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>시험다중등록</title>
</head>
<body>
    <h1>시험다중등록</h1>
    <form action="insertListReg" method="post">
    <table border="">
        <tr>
            <td>학기</td><td>종류</td><td>시험일</td><td>학생</td><td>국어</td><td>영어</td><td>수학</td>
        </tr>
        <% for (int i = 0; i < 5; i++) { %>

        <tr>
            <td>
                <input type="radio" name="arr[<%=i%>].hakgi" value="1">1학기
                <input type="radio" name="arr[<%=i%>].hakgi" value="2">2학기
            </td>
            <td>
                <input type="radio" name="arr[<%=i%>].name" value="semi">중간
                <input type="radio" name="arr[<%=i%>].name" value="final">기말
            </td>
            <td><input type="date" name="arr[<%=i%>].regDate" value="2025-09-08"></td>
            <td>
                <select name="arr[<%=i%>].pid">
                    <option>aaa</option>
                    <option>bbb</option>
                    <option>ccc</option>
                    <option>ddd</option>
                    <option>eee</option>
                    <option>mmm</option>
                    <option>nnn</option>
                    <option>qqq</option>
                </select>
            </td>
             <td><input type="number" name="arr[<%=i%>].kor" value="<%=(int)(Math.random()*40+60)%>"></td>
            <td><input type="number" name="arr[<%=i%>].eng" value="<%=(int)(Math.random()*40+60)%>"></td>
            <td><input type="number" name="arr[<%=i%>].mat" value="<%=(int)(Math.random()*40+60)%>"></td>
        </tr>

        <%} %>

        <tr>
            <td colspan="7" align="right">
                <a href="list?pNo=<%=pInfo.getPNo()%>">목록으로</a>
                <input type="submit" value="다중등록">
            </td>
        </tr>
    </table>
    </form>
</body>
</html>