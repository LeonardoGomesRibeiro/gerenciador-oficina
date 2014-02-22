package br.com.lgr.oficina.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;

import org.jboss.logging.Logger;
import org.primefaces.event.FlowEvent;

import br.com.lgr.oficina.enumerations.TipoPessoa;
import br.com.lgr.oficina.model.Cliente;

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
	 
	private Cliente cliente;
	
	public CadastrarClienteManagedBean() {
		cliente = new Cliente();
		cliente.setTipoPessoa(TipoPessoa.PF);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String onFlowProcess(FlowEvent fe) {
		logger.info("Going to the next page.");
		return fe.getNewStep();
	}
	
}
 