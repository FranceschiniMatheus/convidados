package br.com.fiap.convidados.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.convidados.dto.ConvidadoDto;
import br.com.fiap.convidados.entity.ConvidadoEntity;

@Service
public interface ConvidadoService {
	
	List<ConvidadoDto> findAllConvidado();
	
	ConvidadoEntity saveConvidado(ConvidadoEntity convidado_dto);
	
	ConvidadoEntity findByIdConvidado(Long id);
	
	void deleteByIdConvidado(Long id);
}
