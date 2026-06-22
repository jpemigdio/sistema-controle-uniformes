/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
import DAO.UniformeDAO;
import java.sql.SQLException;
import modelo.Uniforme;
/**
 *
 * @author joaop
 */
public class TesteDelete {

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

        try {

            dao.deletar(u);

         
        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}
    

