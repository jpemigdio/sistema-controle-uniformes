/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import DAO.UniformeSolicitacaoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.UniformeSolicitacao;
import modelo.UniformeSolicitacao.TamanhoSize;
/**
 *
 * @author joaop
 */
@WebServlet(name = "controle_uniforme_solicitacao", urlPatterns = {"/controle_uniforme_solicitacao"})
public class controle_uniforme_solicitacao extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String op = request.getParameter("op");
            UniformeSolicitacaoDAO usdao = new UniformeSolicitacaoDAO();
            UniformeSolicitacao us = new UniformeSolicitacao();
            
            if(op.equals("CADASTRAR")){
                int uniformeId = Integer.parseInt(request.getParameter("txtuniformeid"));
                String tamanho = request.getParameter("txttamanho");
                int quantidade = Integer.parseInt(request.getParameter("txtquantidade"));
                System.out.println("uniformeId = " + uniformeId);
                System.out.println("tamanho = " + tamanho);
                System.out.println("quantidade = " + quantidade);
                us.setUniformeId(uniformeId);
                us.setTamanho(TamanhoSize.valueOf(tamanho));
                us.setQuantidade(quantidade);
                String msg = "Uniforme nao encontrado";
                
                try {
                    usdao.inserir(us);  
                    System.out.println("Cadastrado com sucesso");
                    request.setAttribute("message", "Solicitação cadastrada com sucesso");
                    request.getRequestDispatcher("resultado.jsp").forward(request, response);
                }catch (ClassNotFoundException | SQLException ex){
                    
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("erro.jsp").forward(request, response);
                }
            }else if(op.equals("DELETAR")){

            int id = Integer.parseInt(request.getParameter("txtid"));
            us.setID(id);

            try {
                UniformeSolicitacao existe = usdao.consultarById(us);

                if(existe == null){
                    request.setAttribute("message", "Solicitação não encontrada!");
                    request.getRequestDispatcher("erro.jsp").forward(request, response);
                    return;
                }

                usdao.deletar(us);

                request.setAttribute("message", "Solicitação excluída com sucesso!");
                request.getRequestDispatcher("resultado.jsp").forward(request, response);
                return;

            } catch (ClassNotFoundException | SQLException ex) {

                System.out.println("Erro ao deletar solicitação: " + ex.getMessage());

                request.setAttribute("message", "Erro ao deletar solicitação: " + ex.getMessage());
                request.getRequestDispatcher("erro.jsp").forward(request, response);
                return;
            }
            }else if(op.equals("CONSULTAR BY ID")){
                int id = Integer.parseInt(request.getParameter("txtid"));
                us.setID(id);
                
                try{
                    us = usdao.consultarById(us);
                    if(us == null){
                        request.setAttribute("message","Solicitação não encontrada");
                        request.getRequestDispatcher("erro.jsp").forward(request, response);
                        return;
                    }
                    request.setAttribute("us", us);
                    request.getRequestDispatcher("resultadoconsultarsolicitacao.jsp").forward(request,response);
                }catch(ClassNotFoundException | SQLException ex){
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                
                }
            }else if(op.equals("CONSULTAR TODOS")){
                try{
                    List<UniformeSolicitacao> lsolicitacao = usdao.consultartodos();
                    request.setAttribute("lsolicitacao", lsolicitacao);
                    request.getRequestDispatcher("resultadoconsultartodassolicitacoes.jsp").forward(request, response);
                }catch (ClassNotFoundException | SQLException ex){
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                }
               
            }else if(op.equals("ATUALIZAR")){
                int id = Integer.parseInt(request.getParameter("txtid"));
                us.setID(id);
                
                try{
                    us = usdao.consultarById(us);
                    request.setAttribute("us", us);
                    request.getRequestDispatcher("resultadoconsultartodas.jsp").forward(request, response);
                    
                }catch(ClassNotFoundException | SQLException ex){
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                }
     
                
            }else if(op.equals("EFETIVAR_ATUALIZACAO")){
                int uniformeId = Integer.parseInt(request.getParameter("txtuniformeid"));
                String tamanho = request.getParameter("txttamanho");
                int quantidade = Integer.parseInt(request.getParameter("txtquantidade"));
                
                
                us.setUniformeId(uniformeId);
                us.setTamanho(TamanhoSize.valueOf(tamanho));
                us.setQuantidade(quantidade);
                String msg = "Atualizar";
                
                
                try {
                    usdao.atualizar(us);
                    System.out.println("Atualizado com sucesso!!");
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("resultado.jsp").forward(request, response);
                }catch(ClassNotFoundException | SQLException ex){
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("erro.jsp").forward(request, response);
                }     
            } 
        }
    }
    
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      processRequest(request, response);
  } 
    
  @Override  
  protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      processRequest(request, response);
  }
    
}    
    
    
    


