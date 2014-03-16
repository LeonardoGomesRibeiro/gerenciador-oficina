package br.com.lgr.oficina.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE_PESSOA_JURIDICA")
public class ClientePessoaJuridica extends Cliente implements Serializable{

	@Column(name="cnpj")
	private String cnpj;
	@Column(name="razao_social")
	private String razaoSocial;
	@Column(name="nome_fantasia")
	private String nomeFantasia;
	
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
	
	@Override
	public Endereco getEndereco() {
		return super.getEndereco();
	}
	@Override
	public void setEndereco(Endereco endereco) {
		super.setEndereco(endereco);
	}
	
}
