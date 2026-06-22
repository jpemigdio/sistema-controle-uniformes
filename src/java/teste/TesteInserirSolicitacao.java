/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
import DAO.UniformeSolicitacaoDAO;
import java.sql.SQLException;
import modelo.UniformeSolicitacao;
import modelo.Uniforme.EstadoConservacao;
import modelo.UniformeSolicitacao.TamanhoSize;
/**
 *
 * @author joaop
 */
public class TesteInserirSolicitacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UniformeSolicitacaoDAO dao =
                new UniformeSolicitacaoDAO();

        UniformeSolicitacao us =
                new UniformeSolicitacao();

        us.setUniformeId(6);

        us.setTamanho(
                TamanhoSize.P
        );

        us.setQuantidade(3);

        try {

            dao.inserir(us);

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}    