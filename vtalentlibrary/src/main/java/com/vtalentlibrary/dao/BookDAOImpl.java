package com.vtalentlibrary.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.vtalentlibrary.model.Book;
@Repository
public class BookDAOImpl implements BookDAO {
	@Autowired
	private SessionFactory sessionFac;
	@Autowired
	private HibernateTemplate hibernateTempalte;
	

	@Override
	@Transactional
	public int inserBook(Book book) throws Exception {
//	Session session=sessionFactory.openSession();
//	Transaction transaction=session.beginTransaction();
//	session.save(book);
//	transaction.commit();
//	session.close();
//	sessionFactory.close();
		hibernateTempalte.save(book);
		
		
		return 0;
	}


	@Override
	@Transactional
	public List<Book> findAllData() throws Exception {
	  List<Book> list=(List<Book>) hibernateTempalte.find("from Book");
	
		
		return list;
		
	}


	

}
