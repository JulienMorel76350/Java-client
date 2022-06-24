<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<a href="<%= request.getContextPath()%>/clientServlet">Clients</a>
<c:if test="${empty sessionScope}">
    <a href="<%= request.getContextPath()%>/ConnexionServlet">Connexion</a>
</c:if>
<a href="home.jsp">home</a>
<c:if test="${!empty sessionScope}">
    <a href="<%= request.getContextPath()%>/deconnexionServlet">Deconnexion</a>
    <a href="<%= request.getContextPath()%>/homeServlet">Home</a>
</c:if>


</body>
</html>
