<%@ page import="aaa.model_p.PData" %>
<%@ page import="aaa.model_p.Member" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% aaa.model_p.Member pid = (Member)session.getAttribute("pid");%>
<header>
    <%=pid.getPname()%>님 안녕하세요
    <a href="/admin/login/login/logout">로그아웃</a>


</header>