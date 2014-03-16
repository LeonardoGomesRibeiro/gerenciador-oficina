package br.com.lgr.oficina.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.lgr.oficina.enumerations.EstadoCivil;

@Entity
@Table(name="CLIENTE_PESSOA_FISICA")
public class ClientePessoaFisica extends Cliente implements Serializable{

	@Column(name="cpf", nullable=false)
	private String cpf;
	@Column(name="nome_completo", nullable=false)
	private String nomeCompleto;
	
	@Column(name="estado_civil", nullable=false)
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;

	public ClientePessoaFisica() {
		this.estadoCivil = EstadoCivil.SOLTEIRO;
		setContato(new Contato());
		setEndereco(new Endereco());
	}
	
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
	
	@Override
	public Endereco getEndereco() {
		return super.getEndereco();
	}
	@Override
	public void setEndereco(Endereco endereco) {
		super.setEndereco(endereco);
	}
	
	@Override
	public Contato getContato() {
		return super.getContato();
	}
	@Override
	public void setContato(Contato contato) {
		super.setContato(contato);
	}
	
}
