<%--
  Created by IntelliJ IDEA.
  User: Rodolfo
  Date: 10/10/2017
  Time: 02:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>teste</title>
</head>
<body>
<ul class="panel-options">
    <c:forEach var="produtos" items="${produtos}">
        <li><a href="#">${produtos.nome} - ${produtos.preco}</a></li>
    </c:forEach>
</ul>
</body>
</html>
