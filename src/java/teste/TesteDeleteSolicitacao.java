/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import DAO.UniformeSolicitacaoDAO;
import java.sql.SQLException;
import modelo.UniformeSolicitacao;

/**
 *
 * @author joaop
 */
public class TesteDeleteSolicitacao {

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

        try {

            dao.deletar(us);

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}
    

