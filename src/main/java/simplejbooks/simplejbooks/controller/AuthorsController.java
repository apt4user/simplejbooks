package simplejbooks.simplejbooks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import simplejbooks.simplejbooks.service.AuthorService;

@Controller
public class AuthorsController {
	
	@Autowired
	AuthorService service;
	
}
