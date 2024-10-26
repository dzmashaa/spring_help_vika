package example.spring_labs.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import example.spring_labs.data.Priority;

@RestResource(exported = false)
public interface PriorityRepository extends CrudRepository<Priority, Long> {
}
