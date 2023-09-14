package simplejbooks.simplejbooks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import simplejbooks.simplejbooks.model.CartEntity;

@Repository
public interface CartRepository extends CrudRepository<CartEntity, Long> {

}
