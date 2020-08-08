package com.sigmatest.sigma.dao;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sigmatest.sigma.model.ContactsTB;

@EnableTransactionManagement
public interface IContactsDao {

	/*
	 * Metodo para crear contact
	 */
	ContactsTB crear(ContactsTB contact);

}
