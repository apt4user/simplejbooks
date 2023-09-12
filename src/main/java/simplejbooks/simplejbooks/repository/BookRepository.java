package simplejbooks.simplejbooks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import simplejbooks.simplejbooks.model.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long> {

}
