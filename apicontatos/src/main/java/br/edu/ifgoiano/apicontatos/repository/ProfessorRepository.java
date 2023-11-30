package br.edu.ifgoiano.apicontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifgoiano.apicontatos.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

	Professor findByEmail(String email);

}
