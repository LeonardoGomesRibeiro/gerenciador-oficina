package br.com.lgr.oficina.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.jboss.logging.Logger;
import org.primefaces.event.FlowEvent;

import br.com.lgr.oficina.model.ClientePessoaFisica;
import br.com.lgr.oficina.model.ClientePessoaJuridica;

/**
 * ManagedBean CadastrarClienteManagedBean.
 * 
 * @author Leonardo
 * @email leonardometalhead@gmail.com
 */

@ManagedBean
@SessionScoped // using this scope because p:wizard tag only worked for session scoped bean.
public class CadastrarClienteManagedBean {
	private static Logger logger = Logger.getLogger(CadastrarClienteManagedBean.class.getName());  
	 
	private ClientePessoaFisica clientePF;
	private ClientePessoaJuridica clientePJ;
	
	private String tipoDeUsuario;
	public String getTipoDeUsuario() {
		return tipoDeUsuario;
	}
	public void setTipoDeUsuario(String tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}
	
	@PostConstruct
	public void init() {
		clientePF = new ClientePessoaFisica();
		clientePJ = new ClientePessoaJuridica();
	}
	
	public ClientePessoaFisica getClientePF() {
		return clientePF;
	}
	public void setClientePF(ClientePessoaFisica clientePF) {
		this.clientePF = clientePF;
	}
	public ClientePessoaJuridica getClientePJ() {
		return clientePJ;
	}
	public void setClientePJ(ClientePessoaJuridica clientePJ) {
		this.clientePJ = clientePJ;
	}
	
	public String onFlowProcess(FlowEvent fe) {
		logger.info("Going to the next page.");	
		logger.info("Estado civil1: " + clientePF.getEstadoCivil());
		logger.info("Estado civil2: " + clientePF.getEstadoCivil().getEstadoCivil());
		return fe.getNewStep();
	}
	
	public void changeComboTipoUsuario(){
		System.out.println(this.tipoDeUsuario);
	}
}
 