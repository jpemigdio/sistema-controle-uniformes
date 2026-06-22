<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Todas</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>

    <body>
        <div class="container">

            <h1>Consultar Todas as Solicitações</h1>

            <form action="controle_uniforme_solicitacao" method="post">
                <input type="hidden" name="op" value="CONSULTAR TODOS">

                <input type="submit" value="Consultar">
            </form>

            <a class="botao-voltar" href="index.jsp">Voltar</a>

        </div>
    </body>
</html>