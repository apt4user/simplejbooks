package simplejbooks.simplejbooks.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplejbooks.simplejbooks.model.SubcategoryEntity;
import simplejbooks.simplejbooks.repository.SubcategoryRepository;

@Service
public class SubcategoryService {

	@Autowired
	SubcategoryRepository repository;

	public List<SubcategoryEntity> getAllRelatedSubcategories(Long id) {
		
		List<SubcategoryEntity> subcategoryEntities = (List<SubcategoryEntity>) repository.findAll();		
		List<SubcategoryEntity> subcategoryEntity = new ArrayList<SubcategoryEntity>();
		
		for (SubcategoryEntity subcategory : subcategoryEntities) {
			// Später durch HQL ersetzen
			if (subcategory.getCategory().getId().equals(id)) {
				subcategoryEntity.add(subcategory);
			}
		}

		if (subcategoryEntity.size() > 0) {
			return subcategoryEntity;
		} else {
			return new ArrayList<SubcategoryEntity>();
		}
	}
}
