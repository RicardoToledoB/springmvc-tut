<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Usuario</title>
    </head>
    <body>
        <h1>Mantenedor Usuarios</h1>
        <br>
        <a href="${pageContext.request.contextPath}/usuario/new">Nuevo Usuario</a><br>
        <a href="${pageContext.request.contextPath}/usuario/list">Listado Usuarios</a>
          
                       
        
    </body>
</html>
