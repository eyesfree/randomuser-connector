package com.krisi.demicon;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource
public interface UsersRepository extends CrudRepository<User, Long> {
	List<User> findByGender(String gender);

	User findById(long id);
	
	List<User> findByLocation(Location location);
}
