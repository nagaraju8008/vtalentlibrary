package com.vtalentlibrary.dao;

import java.util.List;

import com.vtalentlibrary.model.Book;

public interface BookDAO {
	public abstract int inserBook(Book book)throws Exception;
	
	public abstract List<Book> findAllData() throws Exception;


}
