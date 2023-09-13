package simplejbooks.simplejbooks.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplejbooks.simplejbooks.model.BookEntity;
import simplejbooks.simplejbooks.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
	public List<BookEntity> getAllRelatedBooks(Long id) {
		
		List<BookEntity> bookEntities = (List<BookEntity>) repository.findAll();		
		List<BookEntity> bookEntity = new ArrayList<BookEntity>();
		
		for (BookEntity book : bookEntities) {
			// Später durch HQL ersetzen
			if (book.getSubcategory().getId().equals(id)) {
				bookEntity.add(book);
			}
		}

		if (bookEntity.size() > 0) {
			return bookEntity;
		} else {
			return new ArrayList<BookEntity>();
		}
	}
	
}
