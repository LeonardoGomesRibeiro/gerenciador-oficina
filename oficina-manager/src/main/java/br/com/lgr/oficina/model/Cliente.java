package br.com.lgr.oficina.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.lgr.oficina.enumerations.EstadoCivil;
import br.com.lgr.oficina.enumerations.TipoPessoa;

/**
 * Entidade Cliente
 * 
 * @author Leonardo
 * @email leonardometalhead@gmail.com
 *
 */	
@Entity
@Table(name="Cliente")
public class Cliente implements Serializable {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nome_completo", nullable=false)
	private String nomeCompleto;
	@Column(name="cnpj")
	private String cnpj;
	@Column(name="cpf", nullable=false)
	private String cpf;
	@Column(name="telefone_celular", nullable=false)
	private String telefoneCelular;
	@Column(name="telefone_fixo")
	private String telefoneFixo;
	
	@Embedded
	private Endereco endereco;
	
	@Column(name="estado_civil", nullable=false)
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;
	
	@Column(name="tipo_pessoa", nullable=false)
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefone_fixo() {
		return telefoneFixo;
	}

	public void setTelefone_fixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
}
