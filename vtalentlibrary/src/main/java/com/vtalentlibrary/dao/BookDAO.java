package com.vtalentlibrary.dao;

import java.util.List;

import com.vtalentlibrary.model.Book;

public interface BookDAO {
	public int inserBook(Book book)throws Exception;
	public List<Book> getCompleteData()throws Exception;

}
