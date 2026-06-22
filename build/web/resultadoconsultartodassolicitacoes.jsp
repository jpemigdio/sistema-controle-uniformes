<%@page import="java.util.List"%>
<%@page import="modelo.UniformeSolicitacao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    List<UniformeSolicitacao> lista =
        (List<UniformeSolicitacao>) request.getAttribute("lsolicitacao");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitações</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>

    <body>
        <div class="container-grande">

            <h1>Lista de Solicitações</h1>

            <table>
                <tr>
                    <th>ID</th>
                    <th>ID Uniforme</th>
                    <th>Tamanho</th>
                    <th>Quantidade</th>
                </tr>

                <% if (lista != null && !lista.isEmpty()) { %>

                    <% for (UniformeSolicitacao us : lista) { %>
                        <tr>
                            <td><%= us.getID() %></td>
                            <td><%= us.getUniformeId() %></td>
                            <td><%= us.getTamanho() %></td>
                            <td><%= us.getQuantidade() %></td>
                        </tr>
                    <% } %>

                <% } else { %>

                    <tr>
                        <td colspan="4">Nenhuma solicitação encontrada.</td>
                    </tr>

                <% } %>

            </table>

            <a class="botao-voltar" href="index.jsp">Voltar ao Menu</a>

        </div>
    </body>
</html>