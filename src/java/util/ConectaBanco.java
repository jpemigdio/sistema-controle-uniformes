/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author joaop
 */
public class ConectaBanco {
   private static String USUARIO = "root";
   private static String SENHA = "";
   private static String BANCO = "gestao_uniforme";
   private static String DRIVER = "com.mysql.cj.jdbc.Driver";
   private static String STRINGCONEXAO = "jdbc:mysql://localhost:3306/";
   
   public static Connection getConexao(){
       Connection con = null;
       try{
            Class.forName(DRIVER);
            con = DriverManager.getConnection(STRINGCONEXAO+BANCO,USUARIO, SENHA);
       } catch (ClassNotFoundException e){
                throw new RuntimeException("Driver não encontrado: "+ e.getMessage());
       } catch (SQLException e){
           throw new RuntimeException("Erro ao conectar: "+e.getMessage());
       }
       return con;
   }
   

   public static void fechaConectabnco(Connection con){
       try{
           if (con != null) {
               con.close();
               System.out.println("Conexão fechada com sucesso.");
           }
       } catch (SQLException e){
           throw new RuntimeException("Impossível fechar conexão: "+e.getMessage());
       }
   }
   
   
   public static void fechaConectabanco(Connection con, PreparedStatement pstmt){
      try{
          if (con != null){
              fechaConectabanco(con);
          }
          if (pstmt != null){
              pstmt.close();
              System.out.println("Comando fechado com sucesso!");
          } 
      } catch (SQLException e){
          throw new RuntimeException("Não foi possível fechar o comando: "+ e.getMessage());
      } 
   }
   

   public static void fechaConectabanco(Connection con, PreparedStatement pstmt, ResultSet rs){
       fechaConectabanco(con, pstmt);
       try {
           if (rs != null){
               rs.close();
               System.out.println("Resultado fechado com sucesso.");
           }
       } catch (SQLException e){
           throw new RuntimeException ("Não foi possível fechar o ResultSet: "+e.getMessage());
       }
   
   
   
   }  

    private static void fechaConectabanco(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
