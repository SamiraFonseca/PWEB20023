package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Tarefa;

public class Repositorio {
	public Connection conn;
	
	public Connection getConn() throws SQLException {
		return DriverManager.getConnection("jdbc:h2:~/tarefadb", "sa", "sa");
	}
	
	public List<Tarefa> listarTarefas() {		
		ArrayList<Tarefa> listaTarefas = new ArrayList<Tarefa>();
		
		String sql = "select * from tarefa" ;
		
		try(	
				Connection conn = this.getConn();
				PreparedStatement pst = conn.prepareStatement(sql);
			) {
			
			
			ResultSet resultSet = pst.executeQuery();
			
			while (resultSet.next()) {
				Tarefa tar = new Tarefa();
				tar.setId(Integer.valueOf(resultSet.getString("id")));
				tar.setDescricao(resultSet.getString("descricao"));
				tar.setTitulo(resultSet.getString("titulo"));
				
				listaTarefas.add(tar);
			}
		}catch(SQLException ex) {
			System.out.println("Erro na consulta de tarefas");
			ex.printStackTrace();
		}
		
		return listaTarefas;
		
	}
	
	public Tarefa TarefaId(Integer id){
		Tarefa ta = new Tarefa();
		
		String sql = "select titulo, descricao from tarefa where id = ?" ;
		
		try(	
				Connection conn = this.getConn();
				PreparedStatement pst = conn.prepareStatement(sql);
			) {
			
			pst.setInt(1, id);
			
			
			ResultSet resultSet = pst.executeQuery();
			
			resultSet.next();
			
			ta.setId(id);
			ta.setTitulo(resultSet.getString("titulo"));
			ta.setDescricao(resultSet.getString("descricao"));
			
			//System.out.println(usuario);
		}catch(SQLException ex) {
			System.out.println("Erro na consulta de tarefas");
			ex.printStackTrace();
		}
		
		return ta;
		
	}
	
}
