<%-- 
    Document   : consultartodosuniformes
    Created on : 31 de mai. de 2026, 16:49:15
    Author     : joaop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Todos</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="container">
            <form action ="controle_uniforme" method="post">

                <input type="hidden" name="op" value="CONSULTAR TODOS">

                <input type="submit" value="Listar Todos os Uniformes">

            </form>
            <br><br>
            <a href="index.jsp">Voltar</a>
        </div>
    </body>
</html>
