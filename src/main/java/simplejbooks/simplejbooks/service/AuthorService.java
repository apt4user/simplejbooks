package simplejbooks.simplejbooks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplejbooks.simplejbooks.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	AuthorRepository repository;
	
}
