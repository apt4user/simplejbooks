package simplejbooks.simplejbooks.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class BooksController {

	@RequestMapping("/books")
	public String index() {

		return "/books/index";
	}

	@RequestMapping("/books/new")
	public String newBook() {

		return "/books/new";
	}
	
}