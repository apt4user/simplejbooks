package simplejbooks.simplejbooks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import simplejbooks.simplejbooks.model.SubcategoryEntity;

@Repository
public interface SubcategoryRepository extends CrudRepository<SubcategoryEntity, Long>{

}
