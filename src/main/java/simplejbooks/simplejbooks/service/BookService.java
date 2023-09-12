package simplejbooks.simplejbooks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplejbooks.simplejbooks.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
}
