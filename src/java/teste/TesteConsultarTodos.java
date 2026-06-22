/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
import DAO.UniformeDAO;
import java.sql.SQLException;
import java.util.List;
import modelo.Uniforme;
/**
 *
 * @author joaop
 */
public class TesteConsultarTodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        UniformeDAO dao =
                new UniformeDAO();

        try {

            List<Uniforme> lista =
                    dao.consultartodos();

            for (Uniforme u : lista) {

                System.out.println(
                        "ID: " + u.getID()
                );

                System.out.println(
                        "Modalidade: "
                        + u.getModalidade()
                );

                System.out.println(
                        "Descricao: "
                        + u.getDescricao()
                );

                System.out.println(
                        "Cor: "
                        + u.getCor()
                );

                System.out.println(
                        "Fornecedor: "
                        + u.getFornecedor()
                );

                System.out.println(
                        "Status: "
                        + u.getStatus()
                );

                
                System.out.println("localizacao: " + u.getLocalizacao());
                System.out.println("responsavel: " + u.getResponsavel());
                System.out.println("estado de conservacao: " + u.getEstadodeConservacao());
                
                
                System.out.println(
                        "----------------"
                );
            }

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(
                    e.getMessage()
            );
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
