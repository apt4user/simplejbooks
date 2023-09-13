package simplejbooks.simplejbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import simplejbooks.simplejbooks.model.BookEntity;
import simplejbooks.simplejbooks.service.BookService;

@Controller
public class BooksController {

	@Autowired
	BookService service;
	
	@RequestMapping(path = "/books/{id}")
	public String index(Model model, @PathVariable("id") Long id) {
		List<BookEntity> books = service.getAllRelatedBooks(id);
		model.addAttribute("books", books);

		return "/books/index";
	}
	
	@RequestMapping("/books/new")
	public String newBook() {

		return "/books/new";
	}
	
}