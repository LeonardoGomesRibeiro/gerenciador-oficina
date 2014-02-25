package br.com.lgr.oficina.tests;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import junit.framework.Assert;

import org.hibernate.exception.SQLGrammarException;
import org.junit.Before;
import org.junit.Test;

import br.com.lgr.oficina.dao.ClienteJdbcDaoImpl;
import br.com.lgr.oficina.model.ClientePessoaFisica;

public class ClientePessoaFisicaTest {

	private EntityManager em;
	private ClienteJdbcDaoImpl clienteJdbcDaoImpl = new ClienteJdbcDaoImpl();
	
	@Before
	public void beforeEach() {
		// Exception occurs here
		em = TestEntityManagerUtil.getEntityManagerFactory().createEntityManager();
		clienteJdbcDaoImpl.setEm(em);
		
		em.getTransaction().begin();
	}
	
	/*TODO: Implement unit tests before working on the view layer.
	 * @Test(expected=javax.persistence.PersistenceException.class)
	public void adicionarClienteSemDados() {
		ClientePessoaFisica pf = new ClientePessoaFisica();
		try {
			clienteJdbcDaoImpl.inserir(pf);			
			Assert.fail();
		} catch (SQLGrammarException e) {
		} catch (javax.persistence.PersistenceException e) {
			// TODO: handle exception
		}
	}*/
}
