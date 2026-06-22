<%-- 
    Document   : consultaruniforme
    Created on : 31 de mai. de 2026, 15:27:16
    Author     : joaop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Uniforme</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="container">
            <h1>Consultar Uniforme por ID</h1>

            <form action="controle_uniforme" method="post">

                <input type="hidden" name="op" value="CONSULTAR BY ID">

                ID: 
                <input type="number" name="txtid" required> 


                <input type="submit" value="Consultar">
                <a href="index.jsp">Voltar</a>
        </div>   
            </form>
            <br><br>
        
    </body>
</html>
