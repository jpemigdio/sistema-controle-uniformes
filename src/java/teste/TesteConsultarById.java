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
public class TesteConsultarById {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     UniformeDAO dao =
                new UniformeDAO();

        Uniforme u =
                new Uniforme();

        u.setID(6);

        try {

            Uniforme resultado =
                    dao.consultarById(u);

            if(resultado != null){

                System.out.println(
                        "ID: " + resultado.getID());

                System.out.println(
                        "Modalidade: " + resultado.getModalidade());

                System.out.println(
                        "Descricao: " + resultado.getDescricao());

                System.out.println(
                        "Cor: " + resultado.getCor());

                System.out.println(
                        "Fornecedor: " + resultado.getFornecedor());

                System.out.println(
                        "Status: " + resultado.getStatus());

                System.out.println(
                        "Localizacao: " + resultado.getLocalizacao());

                System.out.println(
                        "Responsavel: "
                        + resultado.getResponsavel()
                );

                System.out.println(
                        "Estado de Conservacao: " + resultado.getEstadodeConservacao());

            }else{

                System.out.println(
                        "ID nao encontrado!"
                );
            }

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(
                    e.getMessage());
        }

    }        
}