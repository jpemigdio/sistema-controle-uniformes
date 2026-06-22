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
public class TesteConsultarByIdSolicitacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UniformeSolicitacaoDAO dao =
                new UniformeSolicitacaoDAO();

        UniformeSolicitacao us =
                new UniformeSolicitacao();

        us.setID(1);

        try {

            UniformeSolicitacao resultado =
                    dao.consultarById(us);

            if(resultado != null){

                System.out.println(
                        "ID: "
                        + resultado.getID()
                );

                System.out.println(
                        "Uniforme ID: "
                        + resultado.getUniformeId()
                );

                System.out.println(
                        "Tamanho: "
                        + resultado.getTamanho()
                );

                System.out.println(
                        "Quantidade: "
                        + resultado.getQuantidade()
                );

            }else{

                System.out.println(
                        "ID nao encontrado!"
                );
            }

        } catch(ClassNotFoundException | SQLException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
        
    }
    

