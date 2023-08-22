package br.edu.ifgoiano.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifgoiano.entidade.Usuario;
import br.edu.ifgoiano.repositorio.UsuarioRepositorio;



@WebServlet("/alterarUsuario")
public class AlterarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		UsuarioRepositorio repositorio = new UsuarioRepositorio();
		
		Usuario usuario = repositorio.obterUsuario(id);
		
		req.setAttribute("usuario", usuario);
		
		
		req.getRequestDispatcher("usuarioAlteracao.jsp").forward(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");
		
		//Verificar se as senhas s�o iguais
		if(senha1.equals(senha2)) {
			Usuario usu = new Usuario();
			usu.setId(Integer.valueOf(req.getParameter("id")));
			usu.setNome(req.getParameter("nome"));
			usu.setEmail(req.getParameter("email"));
			usu.setSenha(req.getParameter("senha1"));

			
			UsuarioRepositorio repositorio = new UsuarioRepositorio();
			repositorio.alterarUsuario(usu);
			
			
			//redirecionar o usu�rio para a p�gina de login
			resp.sendRedirect("cadastrarUsuario");
		}else {
			String msg = "As senhas n�o s�o iguais!!";
			req.setAttribute("mensagem", msg);
			
			//redirecionar o usu�rio para a mesma p�gina de cadastro do usu�rio.
			req.getRequestDispatcher("usuarioAlteracao.jsp").forward(req, resp);
		}
		
		}

}
