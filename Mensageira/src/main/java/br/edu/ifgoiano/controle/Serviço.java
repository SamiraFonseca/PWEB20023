package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifgoiano.entidade.Usuario;
import java.time.LocalTime;
@WebServlet("/serviço")
public class Serviço extends HttpServlet {

	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Usuario> ListaDeEmail =  new ArrayList <Usuario>();
		
		for (int i = 1; i < 11; i++ ) {
			Usuario email = new Usuario();
			email.setEmail("Joao" + i + "@gmail.com");
			
			ListaDeEmail.add(email);
		}
		
		req.setAttribute("ListaDeEmail", ListaDeEmail);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String texto = req.getParameter("texto");
		String cumprimento = req.getParameter("cump");
		String automatico = req.getParameter("auto");
		String email = "Bom dia" ;
		
		LocalTime horario = LocalTime.now();
		int horasAgora = horario.getHour();
		
		
		
		
		if (cumprimento.equals("formal")) {
		  email = "Prezada(o),";
		} else if (cumprimento.equals("cumpHorario")) {
			if (horasAgora >= 5 && horasAgora < 12) {
				email = "Bom Dia";
			} else if (horasAgora >=12 && horasAgora < 19) {
				email = "Boa Tarde";
			} else {
				email = "Boa Noite";
			}
		}
		
		//if (automatico.equals("automatico")) {
			automatico = "Atenção: esse é um e-mail automático e não deve ser respondido";
		//}
		
	
			
		System.out.println(email+ "\r\n \r\n"  + titulo +  "\r\n \r\n"  + texto + "\r\n \r\n" + automatico );
		
		
		
		
		if (titulo.trim().isEmpty() || texto.trim().isEmpty()) {
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} else {
			resp.sendRedirect("EmailEnviado.jsp");
		}
	}
	
}
