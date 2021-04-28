package br.com.fiap.convidados.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fiap.convidados.dto.ConvidadoDto;
import br.com.fiap.convidados.repository.ConvidadosRepository;
import br.com.fiap.convidados.service.ConvidadoService;
import br.com.fiap.convidados.entity.ConvidadoEntity;

public class ConvidadoServiceImpl implements ConvidadoService{
	
	@Autowired
	ConvidadosRepository repository;

	@Override
	public List<ConvidadoDto> findAllConvidado() {
		List<ConvidadoEntity> listaConvidados = repository.findAll();
		
		List<ConvidadoDto> listaDtoConvidado = fromConvidadoDto(listaConvidados);
		return null;
	}

	@Override
	public br.com.fiap.convidados.entity.ConvidadoEntity saveConvidado(
			br.com.fiap.convidados.entity.ConvidadoEntity convidado_dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public br.com.fiap.convidados.entity.ConvidadoEntity findByIdConvidado(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByIdConvidado(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	private List<ConvidadoDto> fromConvidadoDto(List<ConvidadoEntity> listaConvidados){
		List<ConvidadoDto> listaConvidadoDto = new ArrayList<ConvidadoDto>();
		
		for (ConvidadoEntity entity : listaConvidados) {
			ConvidadoDto convidadoDto = new ConvidadoDto();
			convidadoDto.setNome(entity.getNome());
			convidadoDto.setEmail(entity.getEmail());
			convidadoDto.setAcompanhantes(entity.getAcompanhantes());
			convidadoDto.setId(entity.getId());
			listaConvidadoDto.add(convidadoDto);
		}
		return listaConvidadoDto;
	}

	

}
