package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repositorio.Repositorio;

/**
 * Servlet implementation class ListarTarefas
 */
@WebServlet("/listarTarefas")
public class ListarTarefas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarTarefas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Repositorio repositorio = new Repositorio();
		
		request.setAttribute("tarefas", repositorio.listarTarefas());
		
		request.getRequestDispatcher("listagem.jsp").forward(request, response);
	}

}
