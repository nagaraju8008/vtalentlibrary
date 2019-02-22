package com.vtalentlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vtalentlibrary.model.Book;
import com.vtalentlibrary.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/")
	public String homePage() throws Exception{
		List<Book>list=	bookService.getCompleteData();
		for (Book book2 : list) {
			System.out.println("author---"+book2.getAuthor());
			System.out.println("book name---"+book2.getBookName());
			
		}
		return "index";
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView registerBook(Book book, HttpServletRequest req) throws Exception{
		book.setAuthor(req.getParameter("bookAuthor"));
		book.setBookName(req.getParameter("bookName"));
		bookService.inserBook(book);
	
		return new ModelAndView("sucesses");
	}
	@RequestMapping(value="/getList",method=RequestMethod.GET)
	public List<Book> getList(Book book) throws Exception{
		List<Book>list=bookService.getCompleteData();
		return list;
		
		
	}
	

}
