package br.com.lgr.oficina.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	@Column(name="nome_rua", nullable=false)
	private String nomeDaRua;
	@Column(name="numero", nullable=false)
	private String numero;
	@Column(name="cep", nullable=false)
	private String cep;
	
	public String getNomeDaRua() {
		return nomeDaRua;
	}
	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
	