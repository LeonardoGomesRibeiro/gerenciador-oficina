package br.com.lgr.oficina.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.lgr.oficina.model.Cliente;

/**
 * ManagedBean CadastrarClienteManagedBean.
 * 
 * @author Leonardo
 * @email leonardometalhead@gmail.com
 */

@ManagedBean
@RequestScoped
public class CadastrarClienteManagedBean {
	private Cliente cliente = new Cliente();
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
 