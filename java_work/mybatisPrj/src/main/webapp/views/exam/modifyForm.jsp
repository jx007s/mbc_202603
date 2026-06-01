<%@ page import="java.util.List" %>
<%@ page import="aaa.exam_p.model.ExamDTO" %>
<%@ page import="aaa.exam_p.model.PageInfo" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%
    PageInfo pInfo = (PageInfo)request.getAttribute("pageInfo");
    ExamDTO dto = (ExamDTO)request.getAttribute("mainData");
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>시험수정</title>
</head>
<body>
    <h1>시험수정</h1>
    <form action="modifyReg" method="post" enctype="multipart/form-data">
        <input type="hidden" name="id" value="<%=dto.getId()%>">
        <input type="hidden" name="pNo" value="<%=pInfo.getPNo()%>">
    <table border="">
        <tr>
            <td>학기</td><td>
            <input type="radio" name="hakgi" value="1" <%=dto.getHakgi()==1?"checked":""%> >1학기
            <input type="radio" name="hakgi" value="2" <%=dto.getHakgi()==2?"checked":""%> >2학기
        </td>
        </tr><tr>
            <td>종류</td><td>
        <input type="radio" name="name" value="semi" <%=dto.getName().equals("semi")?"checked":""%> >중간
        <input type="radio" name="name" value="final" <%=dto.getName().equals("final")?"checked":""%> >기말
    </td>
        </tr><tr>
            <td>시험일</td><td><input type="date" name="regDate" value="<%=dto.getRegDate()%>"></td>
        </tr><tr>
            <td>학생</td><td>
            <select name="pid">
<% for (String pid : "aaa,bbb,ccc,ddd,eee,mmm,nnn,qqq".split(",")) { %>
                <option <%=dto.getPid().equals(pid)?"selected":""%>><%=pid%></option>
<%}%>
            </select>
    </td>
        </tr><tr>
            <td>국어</td> <td><input type="number" name="kor" value="<%=dto.getKor()%>"></td>
        </tr><tr>
            <td>영어</td><td><input type="number" name="eng" value="<%=dto.getEng()%>"></td>
        </tr><tr>
            <td>수학</td><td><input type="number" name="mat" value="<%=dto.getMat()%>"></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <a href="detail?id=<%=dto.getId()%>&pNo=<%=pInfo.getPNo()%>">뒤로</a>
                <input type="submit" value="수정">
            </td>
        </tr>
    </table>
    </form>
</body>
</html>