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
    <title>시험등록</title>
</head>
<body>
    <h1>시험등록</h1>
    <form action="insertReg" method="post" enctype="multipart/form-data">
    <table border="">
        <tr>
            <td>학기</td><td>
            <input type="radio" name="hakgi" value="1">1학기
            <input type="radio" name="hakgi" value="2">2학기
        </td>
        </tr><tr>
            <td>종류</td><td>
        <input type="radio" name="name" value="semi">중간
        <input type="radio" name="name" value="final">기말
    </td>
        </tr><tr>
            <td>시험일</td><td><input type="date" name="regDate"></td>
        </tr><tr>
            <td>학생</td><td>
            <select name="pid">
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
        </tr><tr>
            <td>국어</td> <td><input type="number" name="kor"></td>
        </tr><tr>
            <td>영어</td><td><input type="number" name="eng"></td>
        </tr><tr>
            <td>수학</td><td><input type="number" name="mat"></td>
        </tr><tr>
            <td>파일</td><td><input type="file" name="upFF"></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <a href="list?pNo=<%=pInfo.getPNo()%>">목록으로</a>
                <input type="submit" value="등록">
            </td>
        </tr>
    </table>
    </form>
</body>
</html>