<%-- 
    Document   : consultarsolicitacao
    Created on : 31 de mai. de 2026, 21:34:08
    Author     : joaop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Solicitação</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="container">
            <h1>Consultar Solicitação</h1>

            <form action="controle_uniforme_solicitacao" method="post">

                <input type="hidden" name="op" value="CONSULTAR BY ID">

                ID: 
                <input type="number" name="txtid" required>
                <input type="submit" value="Consultar">


            </form>


            <br>

            <a href="index.jsp">Voltar</a>
        
        </div>
        
    </body>
</html>
