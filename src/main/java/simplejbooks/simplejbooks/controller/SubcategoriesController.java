package simplejbooks.simplejbooks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import simplejbooks.simplejbooks.service.SubcategoryService;

@Repository
public class SubcategoriesController {

	@Autowired
	SubcategoryService service;
	
}
