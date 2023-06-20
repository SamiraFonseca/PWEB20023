package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifgoiano.entidade.Usuario;
import br.edu.ifgoiano.repositorio.UsuarioRepositorio;

@WebServlet("/cadastrarUsuario")
public class CadastroUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 7869758393435911873L;
	
	//Simular o banco de dados
	private List<Usuario> lstDeUsuario;
	
	@Override
	public void init() throws ServletException {
		this.lstDeUsuario = new ArrayList<Usuario>();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");
		
		//Verificar se as senhas s�o iguais
		if(senha1.equals(senha2)) {
			Usuario usu = new Usuario();
			usu.setNome(req.getParameter("nome"));
			usu.setEmail(req.getParameter("email"));
			usu.setSenha(senha1);
			usu.getId();
			
			UsuarioRepositorio repositorio = new UsuarioRepositorio();
			
			lstDeUsuario.add(usu);
			
			//redirecionar o usu�rio para a p�gina de login
			resp.sendRedirect("index.html");
		}else {
			//redirecionar o usu�rio para a mesma p�gina de cadastro do usu�rio.
			req.getRequestDispatcher("usuarioCadastro.jsp").forward(req, resp);
		}
		
		}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*for (Usuario usuario : lstDeUsuario) {
			System.out.println(usuario.getNome().concat(" - ").concat(usuario.getEmail()));
		}*/
		
			req.setAttribute("listaUsu", lstDeUsuario);
		
			req.getRequestDispatcher("usuarioListagem.jsp").forward(req, resp);
	}
	
	@Override
	public void destroy() {
		try {
			UsuarioRepositorio.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

