package br.edu.ifgoiano.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifgoiano.entity.Medico;
import br.edu.ifgoiano.repository.MedicoRepository;

@Service
public class MedicoService {

	@Autowired
	private MedicoRepository medicoRepository;
	
	public void cadastrar(Medico medico) {
		this.medicoRepository.save(medico);
	}
	
	public List<Medico> listar(){
		return this.medicoRepository.findAll();
	}
	
	public void atualizar(Medico medico) {
		Medico medicoBase = this.medicoRepository.getReferenceById(medico.getId());
		
		if(medico.getNome() != null) {
			medicoBase.setNome(medico.getNome());
		}
		
		if(medico.getCrm() != null) {
			medicoBase.setCrm(medico.getCrm());
		}
		
		if(medico.getEmail() != null) {
			medicoBase.setEmail(medico.getEmail());
		}
		
		if(medico.getEndereco() != null) {
			medicoBase.setEndereco(medico.getEndereco());
		}
		
		if(medico.getEspecialidade() != null) {
			medicoBase.setEspecialidade(medico.getEspecialidade());
		}
		
		if(medico.getId() != null) {
			medicoBase.setId(medico.getId());
		}
		
		this.medicoRepository.save(medicoBase);
		
	}
	
	public void excluir(Long id) {
		this.medicoRepository.deleteById(id);
	}
		
	
}
