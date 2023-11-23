package br.edu.ifgoiano.apicontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifgoiano.apicontatos.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

	
}
