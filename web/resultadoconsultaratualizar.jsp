<%-- 
    Document   : resultadoconsultaratualizar
    Created on : 31 de mai. de 2026, 19:12:23
    Author     : joaop
--%>

<%@page import="modelo.Uniforme"%>
<%
    Uniforme u = (Uniforme) request.getAttribute("u");
%>    

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizar Uniforme</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="container">
            <h1>Atualizar Uniforme</h1>

            <form action="controle_uniforme" method="post" onsubmit="return confirm('Deseja realmente atualizar este uniforme?');">

                <input type="hidden"
                       name="op"
                       value="EFETIVAR_ATUALIZACAO">

                <input type="hidden"
                       name="txtid"
                       value="<%=u.getID()%>">


                Modalidade:
                <input type="text"
                       name="txtmodalidade"
                       value="<%=u.getModalidade()%>">

                <br><br>

                Descrição:
                <input type="text"
                       name="txtdescricao"
                       value="<%=u.getDescricao()%>">

                <br><br>

                Cor:

                <select name="txtcor">

                    <option value="CLARO"
                        <%= u.getCor().toString().equals("CLARO") ? "selected" : "" %>>
                        CLARO
                    </option>

                    <option value="ESCURO"
                        <%= u.getCor().toString().equals("ESCURO") ? "selected" : "" %>>
                        ESCURO
                    </option>

                </select>

                <br><br>

                Fornecedor:
                <input type="text"
                       name="txtfornecedor"
                       value="<%=u.getFornecedor()%>">

                <br><br>

                Localização:
                <input type="text"
                       name="txtlocalizacao"
                       value="<%=u.getLocalizacao()%>">

                <br><br>

                Responsável:
                <input type="text"
                       name="txtresponsavel"
                       value="<%=u.getResponsavel()%>">

                <br><br>

                Status:

                <select name="txtstatus">

                    <option value="DISPONIVEL">DISPONIVEL</option>
                    <option value="EM_USO">EM_USO</option>
                    <option value="EM_MANUTENCAO">EM_MANUTENCAO</option>
                    <option value="DANIFICADO">DANIFICADO</option>

                </select>

                <br><br>

                Estado de Conservação:

                <select name="txtestadoconservacao">

                    <option value="NOVO">NOVO</option>
                    <option value="CONSERVADO">CONSERVADO</option>
                    <option value="GASTO">GASTO</option>

                </select>

                <br><br>

                <p>ID ENVIADO: <%=u.getID()%></p>
                <input type="submit"
                       value="Salvar Alterações">

            </form>

                   
    

                <a href="index.jsp">Cancelar</a>    
            
        </div>    
    </body>
</html>
