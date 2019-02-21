package com.vtalentlibrary.service;

import java.util.List;

import com.vtalentlibrary.model.Book;

public interface BookService {
	public int inserBook(Book book)throws Exception;
	public List<Book> getCompleteData()throws Exception;

}
