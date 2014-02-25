package br.com.lgr.oficina.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.lgr.oficina.enumerations.EstadoCivil;

@Entity
@Table(name="CLIENTE_PESSOA_FISICA")
public class ClientePessoaFisica extends BaseEntity implements Serializable{

	@Column(name="cpf", nullable=false)
	private String cpf;
	@Column(name="nome_completo", nullable=false)
	private String nomeCompleto;
	@Column(name="estado_civil", nullable=false)
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;
	
	@OneToOne(cascade=CascadeType.ALL, optional=false,fetch=FetchType.LAZY)
	private Endereco endereco;
	
	@OneToOne(cascade=CascadeType.ALL, optional=false,fetch=FetchType.LAZY)
	private Contato contato;

	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
}
