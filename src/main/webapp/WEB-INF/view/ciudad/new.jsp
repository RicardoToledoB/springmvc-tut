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
                        <li ><a href="${pageContext.request.contextPath}/">Home</a></li>
                        <li > <a href="${pageContext.request.contextPath}/usuario">Usuario</a></li>
                        <li class="active"><a href="${pageContext.request.contextPath}/ciudad">Ciudad</a></li>

                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>

        <div class="container">
            <br>
            <spring:url value="/resources/img/logoSpring.png" var="logo"/>
            <h3><img src="${logo}"/> Nueva Ciudad</h3>
            <br>
            <a href="${pageContext.request.contextPath}/ciudad/">Volver</a><br>

            <br>

            <form:form method="POST" commandName="ciudad" action="${pageContext.request.contextPath}/ciudad/save">
                <div class="form-group">
                    <label for="nombre">Nombre</label>
                    <form:input path="nombre" class="form-control" id="nombre" placeholder="nombre" />
                    
                </div>
                <div class="form-group">
                    <label for="estado">Estado</label>
                    <form:input path="estado" class="form-control" id="estado" placeholder="Estado" />
                </div>
                
                
                <button type="submit" class="btn btn-primary">Guardar</button>
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