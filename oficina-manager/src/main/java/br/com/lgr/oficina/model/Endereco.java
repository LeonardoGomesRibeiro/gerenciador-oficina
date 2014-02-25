package br.com.lgr.oficina.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ENDERECO")
public class Endereco extends BaseEntity{

	@Column(name="cep", nullable=false)
	private String cep;	
	@Column(name="nome_rua", nullable=false)
	private String nomeDaRua;
	@Column(name="numero", nullable=false)
	private String numero;
	
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
	