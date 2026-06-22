/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author joaop
 */
public class UniformeSolicitacao {
    private int id;
    private int uniformeId;
    private TamanhoSize tamanho;
    private int quantidade;
    
    public void setID(int id){
        this.id = id;
    }
    
    public int getID(){
        return id;
    }
   
    public void setUniformeId(int uniformeId){
        this.uniformeId = uniformeId;
    }
    
    public int getUniformeId(){
        return uniformeId;
    }
    
    public enum TamanhoSize{
        P,M,G,GG
    }
    
    public void setTamanho(TamanhoSize tamanho){
        this.tamanho = tamanho;
    }
    
    public TamanhoSize getTamanho(){
        return tamanho;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
}
