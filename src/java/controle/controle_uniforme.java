/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import DAO.UniformeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Uniforme;
import modelo.Uniforme.EstadoConservacao;
import modelo.Uniforme.StatusUniforme;
import modelo.Uniforme.UniformeCor;

@WebServlet (
name = "controle_uniforme",
urlPatterns = {"/controle_uniforme"})
/**
 *
 * @author joaop
 */

public class controle_uniforme extends HttpServlet{
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String op = request.getParameter("op");
            System.out.println("OP = [" +op+"]");
            UniformeDAO udao = new UniformeDAO();
            Uniforme u = new Uniforme();
            
            if(op.equals("CADASTRAR")){
                String modalidade = request.getParameter("txtmodalidade");
                String descricao = request.getParameter("txtdescricao");
                String cor = request.getParameter("txtcor");
                String fornecedor = request.getParameter("txtfornecedor");
                String status = request.getParameter("txtstatus");
                String localizacao = request.getParameter("txtlocalizacao");
                String responsavel = request.getParameter("txtresponsavel");
                String estadoconservacao = request.getParameter("txtestadoconservacao");
                
                //codigo para forcar o usuario preencher todos os campos
                if(modalidade.trim().isEmpty() ||
                   descricao.trim().isEmpty() ||
                   fornecedor.trim().isEmpty() ||
                   localizacao.trim().isEmpty() ||
                   responsavel.trim().isEmpty()){
                    request.setAttribute("message", "Todos os campos devem ser preeenchidos");
                    
                    request.getRequestDispatcher("erro.jsp").forward(request, response);
                    return;
                }
                
                u.setModalidade(modalidade);
                u.setDescricao(descricao);
                u.setCor(UniformeCor.valueOf(cor));
                u.setFornecedor(fornecedor);
                u.setStatus(StatusUniforme.valueOf(status));
                u.setLocalizacao(localizacao);
                u.setResponsavel(responsavel);
                u.setEstadodeconservacao(EstadoConservacao.valueOf(estadoconservacao));
                String msg = "Uniforme Cadastrado com Sucesso";
                
                try {
                    udao.cadastrar(u);
                    System.out.println("Cadastrado com sucesso");
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("resultado.jsp").forward(request, response);
                }catch (ClassNotFoundException | SQLException ex){
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("erro.jsp").forward(request, response);
                }
                
                
                }else if(op.equals("BUSCAR PARA DELETAR")){

                int id = Integer.parseInt(request.getParameter("txtid"));

                u.setID(id);

            try{

                u = udao.consultarById(u);

                if(u == null){

                    request.setAttribute("message",
                            "Uniforme não encontrado!");

                    request.getRequestDispatcher("erro.jsp")
                           .forward(request, response);

                }else{

                    request.setAttribute("u", u);

                    request.getRequestDispatcher("confirmarexclusao.jsp")
                           .forward(request, response);
                }

            }catch(ClassNotFoundException | SQLException ex){

                request.setAttribute("message", ex.getMessage());

                request.getRequestDispatcher("erro.jsp")
                       .forward(request, response);
            }
 
            }else if(op.equals("DELETAR")){
                int id = Integer.parseInt(request.getParameter("txtid"));
                u.setID(id);
                String msg = "Deletado com sucesso";
                
               
                try{
                    Uniforme existe = udao.consultarById(u);
                    if(existe == null){
                        request.setAttribute("message", "ID não encontrado");
                        request.getRequestDispatcher("erro.jsp").forward(request, response);
                        return;
                    }
                    udao.deletar(u);
                    List<Uniforme> luniforme = udao.consultartodos();
                    request.setAttribute("luniforme", luniforme);
                    request.getRequestDispatcher("resultadoconsultartodos.jsp").forward(request, response);
                }catch (ClassNotFoundException | SQLException ex){
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("erro.jsp").forward(request, response);
                }
             
            }else if(op.equals("CONSULTAR BY ID")){
                int id = Integer.parseInt(request.getParameter("txtid"));
                u.setID(id);
                
                try{
                    u = udao.consultarById(u);
                    
                    if(u==null){
                        request.setAttribute("message","ID não encontrado");
                        request.getRequestDispatcher("erro.jsp").forward(request,response);
                    }else{
                        request.setAttribute("u", u);
                        request.getRequestDispatcher("resultadoconsultarbyid.jsp").forward(request, response);
                    }
                   
                }catch(ClassNotFoundException | SQLException ex){
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                
                }
            }else if(op.equals("CONSULTAR TODOS")){
                try{
                    List<Uniforme> luniforme = udao.consultartodos();
                    request.setAttribute("luniforme", luniforme);
                    request.getRequestDispatcher("resultadoconsultartodos.jsp").forward(request, response);
                }catch (ClassNotFoundException | SQLException ex){
                    System.out.println("Erro ClassNotFound: " + ex.getMessage());
                }
               
            }else if(op.equals("ATUALIZAR")){
                int id = Integer.parseInt(request.getParameter("txtid"));
                u.setID(id);
                
                try{
                    u = udao.consultarById(u);
                    if(u == null){
                        request.setAttribute("message", "Uniforme não encontrado");
                        request.getRequestDispatcher("erro.jsp").forward(request, response);
                    }else{
                        request.setAttribute("u", u);
                        request.getRequestDispatcher("resultadoconsultaratualizar.jsp").forward(request, response);
                    }
                    
                }catch(ClassNotFoundException | SQLException ex){
                    ex.printStackTrace();
                }
     
            }else if(op.equals("EFETIVAR_ATUALIZACAO")){
                int id = Integer.parseInt(request.getParameter("txtid"));
                String modalidade = request.getParameter("txtmodalidade");
                String descricao = request.getParameter("txtdescricao");
                String cor = request.getParameter("txtcor");
                String fornecedor = request.getParameter("txtfornecedor");
                String status = request.getParameter("txtstatus");
                String localizacao = request.getParameter("txtlocalizacao");
                String responsavel = request.getParameter("txtresponsavel");
                String estadoconservacao = request.getParameter("txtestadoconservacao");
                u.setID(id);
                u.setModalidade(modalidade);
                u.setDescricao(descricao);
                u.setCor(UniformeCor.valueOf(cor));
                u.setFornecedor(fornecedor);
                u.setStatus(StatusUniforme.valueOf(status));
                u.setLocalizacao(localizacao);
                u.setResponsavel(responsavel);
                u.setEstadodeconservacao(EstadoConservacao.valueOf(estadoconservacao));
                String msg = "Atualizado com sucesso";
                
                
                try {
                    udao.atualizar(u);
                    System.out.println("Atualizado com sucesso!!");
                    request.setAttribute("message", msg);
                    request.getRequestDispatcher("resultado.jsp").forward(request, response);
                }catch(ClassNotFoundException | SQLException ex){
                    //System.out.println("Erro ClassNotFound: " + ex.getMessage());
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
