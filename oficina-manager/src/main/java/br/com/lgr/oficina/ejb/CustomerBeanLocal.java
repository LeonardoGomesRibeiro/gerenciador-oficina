package br.com.lgr.oficina.ejb;

import javax.ejb.Local;
import javax.servlet.http.HttpServletRequest;

@Local
public interface CustomerBeanLocal {

	public void registerCustomer(HttpServletRequest request);
}
