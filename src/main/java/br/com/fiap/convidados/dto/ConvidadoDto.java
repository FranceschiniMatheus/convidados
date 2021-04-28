package br.com.fiap.convidados.dto;

import java.io.Serializable;

import br.com.fiap.convidados.entity.ConvidadoEntity;

public class ConvidadoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private String nome;
	private String email;
	private String acompanhantes;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAcompanhantes() {
		return acompanhantes;
	}
	public void setAcompanhantes(String acompanhantes) {
		this.acompanhantes = acompanhantes;
	}
	
	public ConvidadoDto toConvidadoEntity(){
		ConvidadoDto convidado_entity = new ConvidadoDto();
		convidado_entity.setNome(nome);
		convidado_entity.setEmail(email);
		convidado_entity.setAcompanhantes(acompanhantes);
		convidado_entity.setId(Id);
		return convidado_entity;
	}

}
