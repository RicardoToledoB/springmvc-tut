<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    <title>Test Spring MVC</title>
      <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCSS" />
    <link href="${bootstrapCSS}" rel="stylesheet">
    <spring:url value="/resources/css/starter.css" var="starterCSS" />
    <link href="${starterCSS}" rel="stylesheet"> 
   
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Test SpringMVC</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">
        <br>
        <h1>Editar Usuario</h1>
        <br>
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

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <spring:url value="/resources/js/jquery-1.11.3.min.js" var="jqueryJS" />
    <script src="${jqueryJS}"></script>
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJS" />
    <script src="${bootstrapJS}"></script>
  </body>
</html>