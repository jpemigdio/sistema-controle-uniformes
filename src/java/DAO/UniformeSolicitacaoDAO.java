/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Uniforme;
import modelo.Uniforme.StatusUniforme;
import modelo.Uniforme.UniformeCor;
import util.ConectaBanco;
import modelo.UniformeSolicitacao;
import modelo.UniformeSolicitacao.TamanhoSize;
/**
 *
 * @author joaop
 */
public class UniformeSolicitacaoDAO {
    
    public void inserir(UniformeSolicitacao unis) throws ClassNotFoundException, SQLException {
        Connection con = ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into uniforme_solicitacao"
                + "(uniforme_id, tamanhosize, quantidade)"
                + "values (?,?,?)");
        comando.setInt(1, unis.getUniformeId());
        comando.setString(2, unis.getTamanho().name());
        comando.setInt(3, unis.getQuantidade());    
        
        int linhasAfetadas = comando.executeUpdate();
        
        if(linhasAfetadas > 0){
            System.out.println("Solicitacao cadastrada");
        }else {
            System.out.println("Erro ao cadastrar");
        }
        con.close();
    }
    
    
    public UniformeSolicitacao consultarById(UniformeSolicitacao solicitacao) throws ClassNotFoundException, SQLException {
        Connection con = ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from uniforme_solicitacao where id = ?");
        comando.setInt(1, solicitacao.getID());
        ResultSet rs = comando.executeQuery();
        if(rs.next()){
            UniformeSolicitacao uni = new UniformeSolicitacao();
            uni.setID(rs.getInt("id"));
            uni.setUniformeId(rs.getInt("uniforme_id"));
            uni.setTamanho(TamanhoSize.valueOf(rs.getString("tamanhosize")));
            uni.setQuantidade(rs.getInt("quantidade"));
            con.close();
            return uni;
        }
       
        con.close();
        return null;
        
    }
    
    
    public void atualizar(UniformeSolicitacao unis) throws ClassNotFoundException, SQLException {
        Connection con = ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("update uniforme_solicitacao set "
                + "uniforme_id = ?, "
                + "tamanhosize = ?, "
                + "quantidade = ? "
                + "where id = ?");
        
        comando.setInt(1, unis.getUniformeId());
        comando.setString(2, unis.getTamanho().name());
        comando.setInt(3, unis.getQuantidade());
        comando.setInt(4, unis.getID());
        
        int linhasAfetadas = comando.executeUpdate();
        // tratativa de erro;
        if(linhasAfetadas > 0){
            System.out.println("Atualizado com sucesso");
        }else{
            System.out.println("ID nao encontrado");
        }

        con.close();    
    }
    
    
    public void deletar(UniformeSolicitacao unis) throws ClassNotFoundException, SQLException {
        Connection con = ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("delete from uniforme_solicitacao where id = ?");
        comando.setInt(1, unis.getID());
        int linhaAfetadas = comando.executeUpdate();
        if(linhaAfetadas > 0){
            System.out.println("Deletado com sucesso");
        }else{
            System.out.println("ID nao encontrado");
        }
        con.close();
    }
    
    
    public ArrayList<UniformeSolicitacao> consultartodos() throws ClassNotFoundException, SQLException {
        Connection con = ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from uniforme_solicitacao");
        ResultSet rs = comando.executeQuery();
        ArrayList<UniformeSolicitacao> lista = new ArrayList<>();
        while(rs.next()){
            UniformeSolicitacao us =
                    new UniformeSolicitacao();
            us.setID(rs.getInt("id"));
            
            us.setUniformeId(rs.getInt("uniforme_id"));
            
            us.setTamanho(TamanhoSize.valueOf(rs.getString("tamanhosize"))); // valueof transforma em enum novamente 
            
            us.setQuantidade(rs.getInt("quantidade"));
            lista.add(us);
        }
        con.close();
        return lista;
    } 
}
