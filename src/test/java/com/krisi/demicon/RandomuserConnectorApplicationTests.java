package com.krisi.demicon;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RandomuserConnectorApplicationTests {

	@Autowired
	public UsersRepository repository;
	
	@Test
	void contextLoads() {
		assertThat(repository).isNotNull();
	}
	
	@Test
	@Transactional
	public void shouldUpdateExistingEntryInDBWithoutSave() {

				User bob = new User("male", 
				  new Name("Mr", "Jane", "Stone"), "jane.stone@protonmail.com");

	    User bobSaved = repository.save(bob);

	    Long originalId = bobSaved.getId();

	    Name newName = new Name("Miss", "Jenny", "Stone");
	    bobSaved.setName(newName);
	    String newGender = "female";
		bobSaved.setGender(newGender);
	    String newEmail = "jenny.stone@gmail.com";
		bobSaved.setEmail(newEmail);

	    Optional<User> resultOp = repository.findById(originalId);

	    assertThat(resultOp.isPresent());
	    User result = resultOp.get();

	    assertThat(originalId).isEqualTo(result.getId());
	    assertThat(newName).isEqualTo(result.getName());
	    assertThat(newGender).isEqualTo(result.getGender());
	    assertThat(newEmail).isEqualTo(result.getEmail());
	}

}
