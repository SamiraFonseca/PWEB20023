package br.edu.ifgoiano.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifgoiano.entidade.Usuario;

public class UsuarioRepositorio {

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:h2:~/usuariodb", "sa", "sa");
	}

	public List<Usuario> listarUsuarios() {
		List<Usuario> lstusuarios = new ArrayList<Usuario>();

		String sql = "select id, nome, email, senha from usuario";

		try (Connection conn = this.getConnection(); // abrindo uma conexão
				PreparedStatement pst = conn.prepareStatement(sql); // prepara o sql pra mim
		) {

			ResultSet resultSet = pst.executeQuery();

			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(resultSet.getInt("id"));
				usuario.setNome(resultSet.getNString("nome"));
				usuario.setEmail(resultSet.getString("email"));
				usuario.setSenha(resultSet.getString("senha"));


				lstusuarios.add(usuario);
			}
		} catch (Exception e) {
			System.out.println("Erro na consulta de usuários");
			e.printStackTrace();
		}

		return lstusuarios;
	}

	public void inserirUsuario(Usuario usuario) {
		// Criar a sql de insert
		StringBuilder sql = new StringBuilder();
		sql.append("insert into usuario ");
		sql.append("(nome, email, senha) ");
		sql.append("values(?, ?, ?) ");

		// Abrir uma conexão
		try (Connection conn = this.getConnection(); PreparedStatement pst = conn.prepareStatement(sql.toString())) {
			pst.setString(1, usuario.getNome());
			pst.setString(2, usuario.getEmail());
			pst.setString(3, usuario.getSenha());
			// pst.setString(1, usuario.getDataNascimento());

			pst.execute();

			conn.commit();

		} catch (SQLException e) {
			System.out.println("Erro na inclusão de usuarios");
			e.printStackTrace();
		}
		// Preparar a sql para ser executada

	}
}
