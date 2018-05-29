package myapp.demo;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContactRepository extends CrudRepository<Contact, Long> {
	//Contact findByfirstName(String firstName);
	//List<Contact> findByLastNameLike(String lastName);
 
    @Query("SELECT coalesce(max(e.id), 0) FROM Contact e")
    Long getMaxId();
}
