/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
import DAO.UniformeSolicitacaoDAO;
import java.sql.SQLException;
import java.util.List;
import modelo.UniformeSolicitacao;
/**
 *
 * @author joaop
 */
public class TesteConsultarTodosSolicitacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UniformeSolicitacaoDAO dao =
                new UniformeSolicitacaoDAO();

        try {

            List<UniformeSolicitacao> lista =
                    dao.consultartodos();

            for(UniformeSolicitacao us : lista){

                System.out.println(
                        "ID: "
                        + us.getID()
                );

                System.out.println(
                        "Uniforme ID: "
                        + us.getUniformeId()
                );

                System.out.println(
                        "Tamanho: "
                        + us.getTamanho()
                );

                System.out.println(
                        "Quantidade: "
                        + us.getQuantidade()
                );

                System.out.println(
                        "---------------"
                );
            }

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
        
        
    }
    

