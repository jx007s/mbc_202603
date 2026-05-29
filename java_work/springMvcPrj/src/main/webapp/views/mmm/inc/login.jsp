<%@ page import="aaa.model_p.PData" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PData pData = (PData)request.getAttribute("pData");%>
<header>
    <form action="/admin/login/login/logReg" method="get">
        id<input type="text" name="pid">
        pw<input type="text" name="pw">
        <input type="submit" value="로그인">
    </form>

</header>