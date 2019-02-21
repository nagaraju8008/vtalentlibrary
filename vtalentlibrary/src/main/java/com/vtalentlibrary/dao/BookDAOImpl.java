package com.vtalentlibrary.dao;

import java.util.List;

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
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate hibernateTempalte;
	

	@Override
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
	public List<Book> getCompleteData() throws Exception {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("FROM Book");
		
		List<Book> list=query.list();
		transaction.commit();
		session.close();
		sessionFactory.close();
		return list;
	}

}
