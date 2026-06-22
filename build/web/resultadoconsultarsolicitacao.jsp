    <%-- 
        Document   : resultadoconsultarsolicitacao
        Created on : 31 de mai. de 2026, 21:34:55
        Author     : joaop
    --%>

    <%@page import="modelo.UniformeSolicitacao"%>
    <%
        UniformeSolicitacao us = (UniformeSolicitacao) request.getAttribute("us");
    %>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Resultado Consulta</title>
            <link rel="stylesheet" href="css/estilo.css">
        </head>
        <body>
            <div class="container">  
                 <div class="card">
            <h1>Resultado Consulta</h1>

            <table border ="1">

                <tr>
                    <td>ID</td>
                    <td><%= us.getID() %></td>
                </tr>

                <tr>
                   <td>ID Uniforme</td>
                   <td><%= us.getUniformeId()%></td>
                </tr>

                <tr>
                    <td>Tamanho</td>
                    <td><%= us.getTamanho()%></td>
                </tr>

                <tr>
                    <td>Quantidade</td>
                    <td><%= us.getQuantidade()%></td>
                </tr>
            </table>

            <br>

            <a href="index.jsp">Voltar</a>

        </div>  
       </div>  
        </body>
    </html>
