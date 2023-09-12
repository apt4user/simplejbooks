package simplejbooks.simplejbooks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import simplejbooks.simplejbooks.model.CategoryEntity;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {

}
