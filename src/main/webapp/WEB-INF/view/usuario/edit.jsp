<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <form:form method="POST" commandName="usuario" action="${pageContext.request.contextPath}/usuario/edit/${id}">
            <table>  
                <tbody>  
                    <tr>  
                        <td>nombre:</td>  
                        <td><form:input path="nombre"></form:input></td>  
                    </tr>  
                    <tr>  
                        <td>apepat:</td>  
                        <td><form:input path="apepat"></form:input></td>  
                    </tr> 
                    <tr>  
                        <td>apemat:</td>  
                        <td><form:input path="apemat"></form:input></td>  
                    </tr>  


                        <tr>  
                            <td><input type="submit" value="Edit"></td>  
                            <td></td>  
                        </tr>  
                    </tbody>  
                </table>  
        </form:form>
    </body>
</html>
