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
import modelo.Uniforme.EstadoConservacao;
import modelo.Uniforme.StatusUniforme;
import modelo.Uniforme.UniformeCor;
import util.ConectaBanco;
/**
 *
 * @author joaop
 */
public class UniformeDAO {
    
    public void cadastrar(Uniforme u) throws ClassNotFoundException, SQLException {
        Connection con = ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into uniforme(modalidade,descricao,cor,fornecedor,status,localizacao,responsavel,estadoconservacao) values(?,?,?,?,?,?,?,?)");
        comando.setString(1, u.getModalidade());
        comando.setString(2, u.getDescricao());
        comando.setString(3, u.getCor().name());
        comando.setString(4, u.getFornecedor());
        comando.setString(5, u.getStatus().name());
        comando.setString(6,u.getLocalizacao());
        comando.setString(7, u.getResponsavel());
        comando.setString(8, u.getEstadodeConservacao().name());
        
        int linhasAfetadas = comando.executeUpdate();
        if(linhasAfetadas > 0){
            System.out.println("Cadastrado com sucesso");
        }else {
            System.out.println("Erro ao cadastrar");
        }
        con.close();
    }
    
    
    public void deletar(Uniforme u) throws ClassNotFoundException, SQLException {
        Connection con = ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("delete from uniforme where id = ?");
        comando.setInt(1, u.getID());
        
        int linhasAfetadas = comando.executeUpdate();
        if(linhasAfetadas > 0){
            System.out.println("Deletado com sucesso");
        }else{
            System.out.println("ID não encontrado");
        }
        con.close();    
    }
    
    
    public void atualizar(Uniforme u) throws ClassNotFoundException, SQLException{
        Connection con = ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("update uniforme set "
                + "modalidade = ?,"
                + "descricao = ?,"
                + "cor = ?,"
                + "fornecedor = ?,"
                + "status = ?,"
                + "localizacao = ?,"
                + "responsavel = ?,"
                + "estadoconservacao = ? "
                + "where id = ?");
                
       
        comando.setString(1, u.getModalidade());
        comando.setString(2, u.getDescricao()); 
        comando.setString(3, u.getCor().name());// name transforma o valor enum em string
        comando.setString(4, u.getFornecedor()); 
        comando.setString(5, u.getStatus().name()); // name transforma o valor enum em string
        comando.setString(6, u.getLocalizacao());
        comando.setString(7, u.getResponsavel());
        comando.setString(8, u.getEstadodeConservacao().name());
        comando.setInt(9, u.getID());
        int linhasAfetadas = comando.executeUpdate();
        
        if(linhasAfetadas > 0){
            System.out.println("Cadastrado com sucesso");
        }else {
            System.out.println("Erro ao atualizar, ID não esta sendo encontrado no banco");
        }
        con.close();   
    }
    
    
    public Uniforme consultarById(Uniforme u) throws ClassNotFoundException, SQLException {
        Connection con = ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from uniforme where id = ?");
        comando.setInt(1, u.getID());
        ResultSet rs = comando.executeQuery(); // guarda o resultado do select no banco
        
        if (rs.next()){
            Uniforme uni = new Uniforme();
            uni.setID(rs.getInt("id"));
            uni.setModalidade(rs.getString("modalidade"));
            uni.setDescricao(rs.getString("descricao"));
            uni.setCor(UniformeCor.valueOf(rs.getString("cor")));
            uni.setFornecedor(rs.getString("fornecedor"));
            uni.setStatus(StatusUniforme.valueOf(rs.getString("status")));
            uni.setLocalizacao(rs.getString("localizacao"));
            uni.setResponsavel(rs.getString("responsavel"));
            uni.setEstadodeconservacao(EstadoConservacao.valueOf(rs.getString("estadoconservacao")));
        con.close();
        return uni;
        
    }
        con.close();
        return null;
    }     
    public List<Uniforme> consultartodos() throws ClassNotFoundException, SQLException {
        Connection con = ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from uniforme");
        ResultSet rs = comando.executeQuery();
        List<Uniforme> luni = new ArrayList<Uniforme>();
        while(rs.next()){
            Uniforme uni = new Uniforme();
            uni.setID(rs.getInt("id"));
            uni.setModalidade(rs.getString("modalidade"));
            uni.setDescricao(rs.getString("descricao"));
            uni.setCor(UniformeCor.valueOf(rs.getString("cor")));
            uni.setFornecedor(rs.getString("fornecedor"));
            uni.setStatus(StatusUniforme.valueOf(rs.getString("status")));
            uni.setLocalizacao(rs.getString("localizacao"));
            uni.setResponsavel(rs.getString("responsavel"));
            uni.setEstadodeconservacao(EstadoConservacao.valueOf(rs.getString("estadoconservacao"))); 
            luni.add(uni);
        }
        
        if(luni.isEmpty()){
            System.out.println("Nenhum uniforme encontrado");
        }
        con.close();
        return luni;
    }    
}
