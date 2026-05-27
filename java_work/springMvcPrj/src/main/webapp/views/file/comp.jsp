<%@ page import="aaa.model_p.Person" %>
<%@ page import="org.springframework.web.multipart.MultipartFile" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<% Person pp = (Person)request.getAttribute("person"); %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>comp</title>
</head>
<body>
    <h1>comp</h1>

        <table border="">
            <tr>
                <td>pname</td>
                <td><%=pp.getPname()%></td>
            </tr>
            <tr>
                <td>age</td>
                <td><%=pp.getAge()%></td>
            </tr>
            <tr>
                <td>up1</td>
                <td>
                    <img width="200px" src="/fff/<%=pp.getUp1().getOriginalFilename()%>" alt="">
                </td>
            </tr>
            <tr>
                <td>up2</td>
                <td>
                    <% for(MultipartFile mf : pp.getUp2()){%>
                    <%=mf.getOriginalFilename()%>
                    <%}%>
                </td>
            </tr>
        </table>

</body>
</html>