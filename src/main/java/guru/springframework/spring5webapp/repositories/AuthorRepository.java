package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by oleksandr.kydiuk on 12/13/2017.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
