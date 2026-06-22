<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Uniforme</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>

    <body>
        <div class="container">
            <h1>Cadastro de Uniforme</h1>

            <form action="controle_uniforme" method="post">

                <input type="hidden" name="op" value="CADASTRAR">

                <label>Modalidade:</label>
                <input type="text" name="txtmodalidade" required>

                <label>Descrição:</label>
                <input type="text" name="txtdescricao" required>

                <label>Cor:</label>
                <select name="txtcor">
                    <option value="CLARO">CLARO</option>
                    <option value="ESCURO">ESCURO</option>
                </select>

                <label>Fornecedor:</label>
                <input type="text" name="txtfornecedor" required>

                <label>Status:</label>
                <select name="txtstatus">
                    <option value="DISPONIVEL">DISPONIVEL</option>
                    <option value="EM_USO">EM_USO</option>
                    <option value="EM_MANUTENCAO">EM_MANUTENCAO</option>
                    <option value="DANIFICADO">DANIFICADO</option>
                </select>

                <label>Localização:</label>
                <input type="text" name="txtlocalizacao" required>

                <label>Responsável:</label>
                <input type="text" name="txtresponsavel" required>

                <label>Estado de Conservação:</label>
                <select name="txtestadoconservacao">
                    <option value="NOVO">NOVO</option>
                    <option value="CONSERVADO">CONSERVADO</option>
                    <option value="GASTO">GASTO</option>
                </select>

                <input type="submit" value="Cadastrar">

                <a class="botao-voltar" href="index.jsp">Voltar</a>
            </form>
        </div>
    </body>
</html>