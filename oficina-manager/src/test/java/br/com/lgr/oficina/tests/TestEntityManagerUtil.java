package br.com.lgr.oficina.tests;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEntityManagerUtil {

	public static EntityManagerFactory getEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("oficina-unit-test");
    } 
}
