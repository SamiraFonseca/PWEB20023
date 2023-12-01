package br.edu.ifgoiano.apicontatos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifgoiano.apicontatos.entity.Professor;
import br.edu.ifgoiano.apicontatos.repository.ProfessorRepository;

@Controller
public class HomeController {
	@Autowired
	ProfessorRepository  profRepo; 
	
	@GetMapping("/")
	public String getPage() {
		return "CadastrarAluno";
	}
	
	@GetMapping("/lista")
	public String listagem (ModelMap mm) {
		List<Professor> listagemprof = profRepo.findAll();
		mm.addAttribute("ListaProf", listagemprof);
		//mm.addAttribute("error", mm.getAttribute("error"));
		return "ListaProf";
	}
	
	
}
