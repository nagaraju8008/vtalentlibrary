package com.vtalentlibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtalentlibrary.dao.BookDAO;
import com.vtalentlibrary.model.Book;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDAO bookDAo;

	@Override
	public int inserBook(Book book) throws Exception {
	
		return bookDAo.inserBook(book);
	}

	@Override
	public List<Book> getCompleteData() throws Exception {
		
		return bookDAo.getCompleteData();
	}

}
