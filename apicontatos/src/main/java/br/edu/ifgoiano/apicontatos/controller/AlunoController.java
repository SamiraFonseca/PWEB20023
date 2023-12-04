package br.edu.ifgoiano.apicontatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

	/*Métodos que recebem um aluno e salvam ele*/
	@PostMapping
	public String registrarAluno(Aluno al) {
		alRepo.save(al);
		return "CadastrarAluno";
	}
	
	@GetMapping ("/cadastrarAluno")
	public String cadastrarAluno (){
		return "CadastrarAluno";
	}
}
