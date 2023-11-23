package br.edu.ifgoiano.apicontatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifgoiano.apicontatos.entity.Professor;
import br.edu.ifgoiano.apicontatos.enumerator.AreaDoConhecimento;
import br.edu.ifgoiano.apicontatos.repository.ProfessorRepository;

@Controller
@RequestMapping("/professor")
public class ProfessorController {
	@Autowired
	ProfessorRepository pfRepo; 

	@PostMapping
	public String registrarProf(Professor prof, @RequestAttribute("areadoconhecimento") String area) {
		
		if (area.equals("PORTUGUES")) prof.setAreadoconhecimento(AreaDoConhecimento.PORTUGUES);
		
		pfRepo.save(prof);
		return "CadastrarProf";
	}
}
