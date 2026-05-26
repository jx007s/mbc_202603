<%@ page import="aaa.model_p.Order" %>
<%@ page import="aaa.model_p.Product" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% Order order = (Order)request.getAttribute("order"); %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>orderComplete</title>
</head>
<body>
    <h1>orderComplete</h1>

        <table border="">
            <tr>
                <td>제품명</td>
                <td>단가</td>
                <td>수량</td>
                <td>금액</td>
            </tr>
            <% for (Product pp : order.getProd()) { %>
            <tr>
                <td><%=pp.getTitle()%></td>
                <td><%=pp.getPrice()%></td>
                <td><%=pp.getCnt()%></td>
                <td><%=pp.getTotal()%></td>
            </tr>
            <%}%>
            <tr>
                <td colspan="3">합계</td>
                <td><%=order.getTotal()%></td>
            </tr>
            <tr>
                <td rowspan="3">주소</td>
                <td>우편번호</td>
                <td><%=order.getAddr().getZipcode()%></td>
            </tr>
            <tr>
                <td>기본주소</td>
                <td><%=order.getAddr().getBasic()%></td>
            </tr>
            <tr>
                <td>상세주소</td>
                <td><%=order.getAddr().getDetail()%></td>
            </tr>
        </table>

</body>
</html>