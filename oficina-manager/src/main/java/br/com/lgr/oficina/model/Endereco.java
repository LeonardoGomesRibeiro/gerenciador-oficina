package br.com.lgr.oficina.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	@Column(name="name", nullable=false)
	private String name;
	@Column(name="number", nullable=false)
	private String number;
	@Column(name="cep", nullable=false)
	private String cep;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	

	
}
	