/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author joaop
 */
public class Uniforme {
    private int id;
    private String modalidade;
    private String descricao;
    private UniformeCor cor;
    private String fornecedor;
    private StatusUniforme status;
    private String localizacao;
    private String responsavel;
    private EstadoConservacao estadoconservacao;
    private ArrayList<UniformeSolicitacao> uniformetamanho;
    
    
    public Uniforme(){
        uniformetamanho = new ArrayList<>();
    }
    
  
   public void setID(int id){
       this.id = id;
   } 
    
   public int getID(){
       return id;
   }
    
    
   public void setModalidade(String modalidade){
       this.modalidade = modalidade;
   }
    
   public String getModalidade(){
       return modalidade;
   }
    
   public void setDescricao(String descricao){
        this.descricao = descricao;
   }
    
   public String getDescricao(){
       return descricao;
   }
  
   public enum UniformeCor{
       CLARO, ESCURO;
   }
  
   public void setCor(UniformeCor cor){
       this.cor = cor;
   } 
    
    
   public UniformeCor getCor(){
       return cor;
   } 
     
    
   public void setFornecedor(String fornecedor){
       this.fornecedor = fornecedor;
   } 
    
    
   public String getFornecedor(){
       return fornecedor;
   }
   
   
    public enum StatusUniforme {
       DISPONIVEL,
       EM_USO,
       EM_MANUTENCAO,
       DANIFICADO,
    }
           
   public void setStatus(StatusUniforme status){  
        this.status = status;
       
   }    

   public StatusUniforme getStatus(){
       return status;
   }
   
  
   public void setLocalizacao(String localizacao){
       this.localizacao = localizacao;
   }
   
   public String getLocalizacao(){
       return localizacao;
   }
   
   public void setResponsavel(String responsavel){
       this.responsavel = responsavel;
   }
   
   public String getResponsavel(){
       return responsavel;
   }
   
   public enum EstadoConservacao{
       NOVO, CONSERVADO, GASTO
   }
   
   public void setEstadodeconservacao(EstadoConservacao estadoconservacao){
       this.estadoconservacao = estadoconservacao;
   }
   
   public EstadoConservacao getEstadodeConservacao(){
       return estadoconservacao;   
   
}

   public void setUniformetamanho(ArrayList<UniformeSolicitacao>uniformetamanho){
       this.uniformetamanho = uniformetamanho;
   }
   
   public ArrayList<UniformeSolicitacao> getUniformetamanho(){
       return uniformetamanho;
   }
}
