package com.sigmatest.sigma.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmatest.sigma.dao.IContactsDao;
import com.sigmatest.sigma.model.ContactsTB;
import com.sigmatest.sigma.service.IContactsService;

@Service
public class ContactsServiceImpl implements IContactsService {

	@Autowired
	private IContactsDao contactsDAO;

	@Transactional
	@Override
	public ContactsTB crear(ContactsTB contact) {
		return contactsDAO.crear(contact);
	}

}
