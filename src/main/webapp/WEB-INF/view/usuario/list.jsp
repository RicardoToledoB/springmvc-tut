<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Usuarios</title>
    </head>
    <body>
        <c:if test="${not empty usuarios}">
            <table border="1px" cellpadding="1" cellspacing="1">  
                <thead>  
                    <tr>  
                        <th>id</th>
                        <th>nombre</th>
                        <th>apepat</th>
                        <th>apemat</th>
                        <th>acciones</th>  
                    </tr>  
                </thead>  
                <tbody>  
                    <c:forEach var="usuario" items="${usuarios}">
                    <tr>  
                        <td>${usuario.usuario_id}</td>  
                        <td>${usuario.nombre}</td>  
                        <td>${usuario.apepat}</td>  
                        <td>${usuario.apemat}</td>  
                        <td>  
                            Por definir
                        </td>  
                    </tr>  
                    </c:forEach>
                </tbody>  
            </table>  
        </c:if>
    </body>
</html>
