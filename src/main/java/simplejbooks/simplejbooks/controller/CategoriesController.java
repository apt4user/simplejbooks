package simplejbooks.simplejbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.validation.Valid;
import simplejbooks.simplejbooks.model.CategoryEntity;
import simplejbooks.simplejbooks.service.CategoryService;

@Controller
public class CategoriesController {

	@Autowired
	CategoryService service;

	@RequestMapping(path = "/categories")
	public String index(Model model) {
		List<CategoryEntity> list = service.getAllCategories();
		model.addAttribute("category", new CategoryEntity());
		model.addAttribute("categories", list);
		return "/categories/index";
	}

	@RequestMapping(path = "/categories/new", method = RequestMethod.POST)
	public String createCategory(@Valid @ModelAttribute("category") CategoryEntity entity, BindingResult bindingResult,
			Model model) {
		model.addAttribute("entity", entity);
		service.create(entity);
		return "/categories/index";
	}

	@RequestMapping(path = "/categories/{id}", method = RequestMethod.POST)
	public String updateEmployee(CategoryEntity entity, @PathVariable("id") Long id) {
		service.update(entity);
		return "redirect:/";
	}

}