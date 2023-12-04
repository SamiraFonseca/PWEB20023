package br.edu.ifgoiano.apicontatos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifgoiano.apicontatos.entity.Professor;
import br.edu.ifgoiano.apicontatos.repository.ProfessorRepository;

@Controller  /*Indicar ao Spring que essa classe referesse a um Controller*/
@RequestMapping("/professor") /*Mapea o controler */
public class ProfessorController {
	@Autowired
	ProfessorRepository pfRepo; 

	@PostMapping /*Metodo post*/
	public String registrarProf(Professor prof) {
		pfRepo.save(prof);
		return "CadastrarProf";
	}
	
	@GetMapping ("/cadastrarProf") /*Metodo get*/
	public String cadastrarProf (){
		return "CadastrarProf";
	}
	
	@GetMapping ("/preEditar/{email}") /*Metodo post*/
	public String preEditar (@PathVariable String email, ModelMap m){
		Professor prof = pfRepo.findByEmail(email);
		
		prof.setSenha("");
		
		m.addAttribute("prof", prof);
		return "Editar";
	}
	
	@PostMapping ("/editar") /*Metodo post*/ /*Pesquisa o professor por id, verifica se a senha do objeto professor está correta,
	 se for o código permite a edição e seta a area e o email, 
	logo apos direciona para a página da lista de novo*/
	public String Editar (Professor prof, RedirectAttributes m){
		Professor editProf = pfRepo.findById(prof.getId()).get();
		
		if (prof.getSenha().equals(editProf.getSenha())) {
			editProf.setAreadoconhecimento(prof.getAreadoconhecimento());
			editProf.setEmail(prof.getEmail());
			
			pfRepo.save(editProf);
			
			return "redirect:/lista";
		} else {
			
			
		   m.addAttribute("error", "Erro ao alterar valores.");
			
			return "redirect:/lista";

		}
	}
	
	@GetMapping ("/excluir/{id}")
	public String excluir (@PathVariable Long id, ModelMap m) {
	/*Recebe o id que está na url, depois deleta por id, 
	busca a lista novamente e a retorna*/
		pfRepo.deleteById(id);
		
		List<Professor> listagemprof = pfRepo.findAll();
		m.addAttribute("ListaProf", listagemprof);
		return "ListaProf";
	}
}
