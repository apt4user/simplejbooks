package simplejbooks.simplejbooks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import simplejbooks.simplejbooks.service.BookService;

@Controller
public class BooksController {

	@Autowired
	BookService service;
	
	@RequestMapping("/books")
	public String index() {

		return "/books/index";
	}

	@RequestMapping("/books/new")
	public String newBook() {

		return "/books/new";
	}
	
}