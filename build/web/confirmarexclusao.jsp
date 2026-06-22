<%-- 
    Document   : confirmarexclusao
    Created on : 31 de mai. de 2026, 18:48:10
    Author     : joaop
--%>

<%@page import="modelo.Uniforme"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    Uniforme u = (Uniforme) request.getAttribute("u");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmar Exclusão</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="container">
                <h1>Confirmar Exclusão</h1>

                <table border="1">

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

            <br><br>

            <form action="controle_uniforme"
                  method="post"
                  onsubmit="return confirm('Deseja realmente excluir este uniforme?');">

                <input type="hidden" name="op" value="DELETAR">

                <input type="hidden"
                       name="txtid"
                       value="<%= u.getID() %>">

                <input type="submit"
                       value="Confirmar Exclusão">

            </form>

            <br>

            <a href="index.jsp">Cancelar</a>
        </div>
    </body>
</html>
