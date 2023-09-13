package simplejbooks.simplejbooks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplejbooks.simplejbooks.repository.SubcategoryRepository;

@Service
public class SubcategoryService {

	@Autowired
	SubcategoryRepository repository;
	
}
