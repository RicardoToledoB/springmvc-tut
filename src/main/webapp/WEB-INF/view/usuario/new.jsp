<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Usuario</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath}/usuario/list">Volver</a><br>
                            
        <br>
        <form:form method="POST" commandName="usuario" action="${pageContext.request.contextPath}/usuario/save">
            <table>
                <tbody>
                    <tr>
                        <td>Nombre:</td>
                        <td><form:input path="nombre" /></td>
                    </tr>
                    <tr>
                        <td>Apepat:</td>
                        <td><form:input path="apepat" /></td>
                    </tr>
                     <tr>
                        <td>Apemat:</td>
                        <td><form:input path="apemat" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Guardar" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form:form>

    </body>
</html>
