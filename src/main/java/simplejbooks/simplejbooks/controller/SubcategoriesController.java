package simplejbooks.simplejbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import simplejbooks.simplejbooks.model.SubcategoryEntity;
import simplejbooks.simplejbooks.service.SubcategoryService;

@Controller
public class SubcategoriesController {

	@Autowired
	SubcategoryService service;

	@RequestMapping(path = "/subcategories/{id}")
	public String index(Model model, @PathVariable("id") Long id) {
		List<SubcategoryEntity> subcategories = service.getAllRelatedSubcategories(id);
		model.addAttribute("subcategories", subcategories);

		return "/subcategories/index";
	}

}
