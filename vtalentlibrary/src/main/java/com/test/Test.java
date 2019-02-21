package com.test;

import java.util.List;

import com.vtalentlibrary.model.Book;
import com.vtalentlibrary.service.BookService;
import com.vtalentlibrary.service.BookServiceImpl;

public class Test {

	public static void main(String[] args) throws Exception {
		BookService bookService=new BookServiceImpl();
		List<Book>list=bookService.getCompleteData();
		for (Book book : list) {
			System.out.println(book.getBookId());
			System.out.println(book.getBookName());
			System.out.println(book.getAuthor());
			
		}

	}

}
