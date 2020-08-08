package com.sigmatest.sigma.dao.impl;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sigmatest.sigma.dao.AbstractDao;
import com.sigmatest.sigma.dao.IContactsDao;
import com.sigmatest.sigma.model.ContactsTB;

@Repository
public class ContactsDaoImpl extends AbstractDao<ContactsTB> implements IContactsDao {

	@PersistenceContext(unitName = "default")
	private EntityManager em;

	@Override
	public ContactsTB crear(ContactsTB ubicacion) {
		ubicacion = colocarValoresDefecto(ubicacion);
		super.create(ubicacion);
		return ubicacion;
	}

	private ContactsTB colocarValoresDefecto(ContactsTB contact) {
		contact.setCreated_at(new Date());
		contact.setUpdated_at(new Date());
		return contact;
	}

}
