package br.com.lgr.oficina.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CONTATO")
public class Contato extends BaseEntity {

	@Column(name="telefone_celular", nullable=false)
	private String telefoneCelular;
	@Column(name="telefone_fixo")
	private String telefoneFixo;
	
	@Column(name="email", nullable=true)
	private String email;
	
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
