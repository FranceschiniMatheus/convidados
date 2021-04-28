package br.com.fiap.convidados.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.fiap.convidados.dto.ConvidadoDto;

@Entity
@Table(name = "tb_convidados")
public class ConvidadoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	public ConvidadoEntity toConvidadoDto(){
		ConvidadoEntity convidado_dto = new ConvidadoEntity();
		convidado_dto.setNome(nome);
		convidado_dto.setEmail(email);
		convidado_dto.setAcompanhantes(acompanhantes);
		convidado_dto.setId(Id);
		return convidado_dto;
	}
}
