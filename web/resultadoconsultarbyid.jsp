<%@page import="modelo.Uniforme"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Uniforme u = (Uniforme) request.getAttribute("u");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Uniforme</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>

    <body>
        <div class="container">

            <h1>Dados do Uniforme</h1>

            <% if (u != null) { %>

                <table>
                    <tr>
                        <th>Campo</th>
                        <th>Informação</th>
                    </tr>

                    <tr>
                        <td>ID</td>
                        <td><%= u.getID() %></td>
                    </tr>

                    <tr>
                        <td>Modalidade</td>
                        <td><%= u.getModalidade() %></td>
                    </tr>

                    <tr>
                        <td>Descrição</td>
                        <td><%= u.getDescricao() %></td>
                    </tr>

                    <tr>
                        <td>Cor</td>
                        <td><%= u.getCor() %></td>
                    </tr>

                    <tr>
                        <td>Fornecedor</td>
                        <td><%= u.getFornecedor() %></td>
                    </tr>

                    <tr>
                        <td>Status</td>
                        <td><%= u.getStatus() %></td>
                    </tr>

                    <tr>
                        <td>Localização</td>
                        <td><%= u.getLocalizacao() %></td>
                    </tr>

                    <tr>
                        <td>Responsável</td>
                        <td><%= u.getResponsavel() %></td>
                    </tr>

                    <tr>
                        <td>Estado de Conservação</td>
                        <td><%= u.getEstadodeConservacao() %></td>
                    </tr>
                </table>

            <% } else { %>

                <p class="erro">Uniforme não encontrado.</p>

            <% } %>

            <a class="botao-voltar" href="index.jsp">Voltar</a>

        </div>
    </body>
</html>