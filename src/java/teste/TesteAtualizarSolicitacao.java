/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import DAO.UniformeSolicitacaoDAO;
import java.sql.SQLException;
import modelo.UniformeSolicitacao;
import modelo.UniformeSolicitacao.TamanhoSize;

/**
 *
 * @author joaop
 */
public class TesteAtualizarSolicitacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UniformeSolicitacaoDAO dao =
                new UniformeSolicitacaoDAO();

        UniformeSolicitacao us =
                new UniformeSolicitacao();

        us.setID(2);

        us.setUniformeId(6);

        us.setTamanho(
                TamanhoSize.G
        );

        us.setQuantidade(10);

        try {

            dao.atualizar(us);

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
    }
    

