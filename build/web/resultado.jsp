<%-- 
    Document   : errocadastro
    Created on : 31 de mai. de 2026, 14:09:03
    Author     : joaop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="container">
            <h1>Operação realizada com sucesso !</h1>
            <br><br>
            <p>
            <%= request.getAttribute("message") %>
            </p>
            <a href="index.jsp">Voltar ao menu</a>
        </div>
    </body>
</html>
