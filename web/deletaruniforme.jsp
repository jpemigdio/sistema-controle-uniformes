<%-- 
    Document   : deletaruniforme
    Created on : 31 de mai. de 2026, 17:15:41
    Author     : joaop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deletar Uniforme</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="container">
            <h1>Deletar Uniforme</h1>

            <form action="controle_uniforme" method="post">

                <input type="hidden" name="op" value="BUSCAR PARA DELETAR">

                ID:
                <input type="number" name="txtid" required>



                <br><br>

                <input type="submit" value="Buscar">



            </form>

            <br><br>

            <a href="index.jsp">Voltar</a>
        </div>
    </body>
</html>
