package br.edu.ifgoiano.entidade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastrarUsuario") // o nome que colocar aqui é o mesmo nome que precisa colocar no action do HTML
public class cadastroUsuario extends HttpServlet {

	// Simulando banco de dados

	private List<usuario> lstDeUsuario;

	// init + Ctrl + espaço
	@Override
	public void init() throws ServletException {
		this.lstDeUsuario = new ArrayList<usuario>();
	}

	// qual o método usado?
	// neste caso é o doPost, então "doPost + Ctrl + espaço

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");

		if (senha1.equals(senha2)) {
			// criando um objeto de usuário

			usuario usu = new usuario();
			usu.setNome(req.getParameter("nome"));
			usu.setEmail(req.getParameter("email"));
			usu.setSenha(senha1);

			lstDeUsuario.add(usu); // adicionando o objeto de usuário para o banco de dados.

			// redirecionar o usuário para a página de login
			resp.sendRedirect("index.html");

		} else {
			// redirecionar o usuário para a mesma página de cadátro de usuário
			req.getRequestDispatcher("usuarioCadastro.jsp").forward(req, resp);
		}

		//mostrando no console os dados
		for (usuario usuario : lstDeUsuario) {
			System.out.println(usuario.getNome().concat("-").concat(usuario.getEmail()));
		}
	}

	// destruindo o banco logo após ser usado
	@Override
	public void destroy() {
		this.lstDeUsuario.clear();
	}

	/*
	 * [simulando o banco de dados caso o método seja doGet, que no caso é o método
	 * padrão]
	 * 
	 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { for (usuario usuario :
	 * lstDeUsuario) {
	 * System.out.println(usuario.getNome().concat("-").concat(usuario.getEmail()));
	 * } }
	 */
}