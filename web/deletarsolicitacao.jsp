<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluir Solicitação</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>

    <body>
        <div class="container">

            <h1>Excluir Solicitação</h1>

            <form action="controle_uniforme_solicitacao" method="post">

                <input type="hidden" name="op" value="DELETAR">

                <label>ID:</label>
                <input type="number" name="txtid" required>

                <input type="submit" value="Excluir">

            </form>

            <a class="botao-voltar" href="index.jsp">Voltar</a>

        </div>
    </body>
</html>