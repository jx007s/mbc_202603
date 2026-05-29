<%@ page import="aaa.model_p.PData" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% PData pData = (PData)request.getAttribute("pData");%>
<style>
    nav > a{
        display: block;
    }
</style>
<nav>
    <a href="/admin/member/list">회원관리</a>
    <a href="/admin/product/list">제품관리</a>
    <a href="/admin/mypage/list">마이페이지</a>


</nav>