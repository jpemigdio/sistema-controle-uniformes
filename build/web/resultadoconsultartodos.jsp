<%-- 
    Document   : resultadoconsultartodos
    Created on : 31 de mai. de 2026, 16:24:16
    Author     : joaop
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.Uniforme"%>


<%
   List<Uniforme> luniforme =
   (List<Uniforme>) request.getAttribute("luniforme");
        %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Uniformes</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="container-grande">
            <h1>Lista de Uniformes registrados</h1>

            <table border="1">
                <tr>
                    <th>ID</th> 
                    <th>Modalidade</th> 
                    <th>Descrição</th> 
                    <th>Cor</th> 
                    <th>Fornecedor</th> 
                    <th>Status</th> 
                    <th>Localização</th> 
                    <th>Responsável</th> 
                    <th>Estado de Conservação</th> 
                </tr>
            <%
                for(Uniforme u : luniforme){
            %>
                <tr>
                        <td><%=u.getID()%></td>
                        <td><%=u.getModalidade()%></td>
                        <td><%=u.getDescricao()%></td> 
                        <td><%=u.getCor()%></td> 
                        <td><%=u.getFornecedor()%></td> 
                        <td><%=u.getStatus()%></td> 
                        <td><%=u.getLocalizacao()%></td> 
                        <td><%=u.getResponsavel()%></td> 
                        <td><%=u.getEstadodeConservacao()%></td> 
                    </tr>

            <%
                }
            %>


            </table>

            <br><br>

            <a href="index.jsp">Voltar ao Menu</a>
        </div>    
    </body>
</html>
