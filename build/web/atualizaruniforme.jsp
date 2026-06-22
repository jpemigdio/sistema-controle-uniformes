<%-- 
    Document   : atualizaruniforme
    Created on : 31 de mai. de 2026, 19:02:05
    Author     : joaop
--%>

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
        
        <form action="controle_uniforme" method="post">
            <input type="hidden" name="op" value="ATUALIZAR"> 
            
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
