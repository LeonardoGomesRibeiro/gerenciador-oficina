package br.com.lgr.oficina.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE_PESSOA_JURIDICA")
public class ClientePessoaJuridica extends BaseEntity implements Serializable{

	@Column(name="cnpj")
	private String cnpj;
	@Column(name="razao_social")
	private String razaoSocial;
	@Column(name="nome_fantasia")
	private String nomeFantasia;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Endereco endereco;

	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Contato contato;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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
