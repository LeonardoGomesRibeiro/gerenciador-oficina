package br.com.lgr.oficina.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Session Bean implementation class CustomerBean
 */
@Stateless
@LocalBean
public class CustomerBean implements CustomerBeanLocal{

	@PersistenceContext(unitName="oficina-unit")
	private EntityManager em;
	
	public void registerCustomer(HttpServletRequest request) {
		System.out.println("here" + em);
		
	}

}
