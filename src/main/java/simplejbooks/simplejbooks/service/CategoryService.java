package simplejbooks.simplejbooks.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplejbooks.simplejbooks.model.CategoryEntity;
import simplejbooks.simplejbooks.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository repository;

	public List<CategoryEntity> getAllCategories() {
		List<CategoryEntity> result = (List<CategoryEntity>) repository.findAll();

		if (result.size() > 0) {
			return result;
		} else {
			return new ArrayList<CategoryEntity>();
		}
	}

	public CategoryEntity create(CategoryEntity entity) {

		entity = repository.save(entity);
		return entity;

	}

	public CategoryEntity update(CategoryEntity entity) {
		Optional<CategoryEntity> category = repository.findById(entity.getId());

		if (category.isPresent()) {
			CategoryEntity updatedEntity = category.get();
			updatedEntity.setCategoryName(entity.getCategoryName());
			updatedEntity.setCategoryDescription(entity.getCategoryDescription());
			updatedEntity.setCategoryDesignator(entity.getCategoryDesignator());

			updatedEntity = repository.save(updatedEntity);

			return updatedEntity;
		} else {
			entity = repository.save(entity);

			return entity;
		}
	}

}
