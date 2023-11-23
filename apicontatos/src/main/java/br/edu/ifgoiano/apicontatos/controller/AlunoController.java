package br.edu.ifgoiano.apicontatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifgoiano.apicontatos.entity.Aluno;
import br.edu.ifgoiano.apicontatos.entity.Professor;
import br.edu.ifgoiano.apicontatos.repository.AlunoRepository;
import br.edu.ifgoiano.apicontatos.repository.ProfessorRepository;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
	@Autowired
	AlunoRepository alRepo; 

	@PostMapping
	public String registrarProf(Aluno al) {
		alRepo.save(al);
		return "CadastrarAluno";
	}
}
