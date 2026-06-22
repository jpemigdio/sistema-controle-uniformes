/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
import util.ConectaBanco;
import java.sql.Connection;
/**
 *
 * @author joaop
 */
public class TesteBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            Connection con =
                    ConectaBanco.getConexao();

            System.out.println(
                    "Conectado com sucesso!"
            );

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
    
}
