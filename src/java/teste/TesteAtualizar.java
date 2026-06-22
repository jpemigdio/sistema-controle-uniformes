/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
import DAO.UniformeDAO;
import java.sql.SQLException;
import modelo.Uniforme;
import modelo.Uniforme.EstadoConservacao;
import modelo.Uniforme.StatusUniforme;
import modelo.Uniforme.UniformeCor;
/**
 *
 * @author joaop
 */
public class TesteAtualizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UniformeDAO dao =
                new UniformeDAO();

        Uniforme u =
                new Uniforme();

        u.setID(1);
        u.setModalidade("Volei"); 

        u.setDescricao(
                "Uniforme Atualizado"
        );

        u.setCor(
                UniformeCor.CLARO
        );

        u.setFornecedor("Adidas");

        u.setStatus(
                StatusUniforme.EM_USO
        );

        u.setLocalizacao(
                "Armario 5"
        );

        u.setResponsavel(
                "Thais"
        );

        u.setEstadodeconservacao(EstadoConservacao.CONSERVADO);
      

        try {

            dao.atualizar(u);

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
        
        
        
    
    }
    
