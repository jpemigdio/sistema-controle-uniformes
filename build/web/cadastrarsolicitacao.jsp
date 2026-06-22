<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Solicitação</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>

    <body>
        <div class="container">

            <h1>Cadastrar Solicitação</h1>

            <form action="controle_uniforme_solicitacao" method="post">

                <input type="hidden" name="op" value="CADASTRAR">

                <label>ID do Uniforme:</label>
                <input type="number" name="txtuniformeid" required>

                <label>Tamanho:</label>
                <select name="txttamanho">
                    <option value="P">P</option>
                    <option value="M">M</option>
                    <option value="G">G</option>
                    <option value="GG">GG</option>
                </select>

                <label>Quantidade:</label>
                <input type="number" name="txtquantidade" required min="1">

                <input type="submit" value="Cadastrar">

                <a class="botao-voltar" href="index.jsp">Voltar</a>

            </form>

        </div>
    </body>
</html>