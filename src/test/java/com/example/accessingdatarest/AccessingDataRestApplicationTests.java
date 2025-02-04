package com.example.accessingdatarest;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class AccessingDataRestApplicationTests {

	@Autowired
	private PersonRepository personRepository;

	@BeforeEach
	void setUp() {
		Person person1 = new Person();
		person1.setFirstName("John");
		person1.setLastName("Doe");

		Person person2 = new Person();
		person2.setFirstName("Jane");
		person2.setLastName("Doe");

		personRepository.save(person1);
		personRepository.save(person2);
	}

	@Test
	void testFindByLastName() {
		List<Person> people = personRepository.findByLastName("Doe");
		assertThat(people).hasSize(2);
		assertThat(people.get(0).getFirstName()).isEqualTo("John");
		assertThat(people.get(1).getFirstName()).isEqualTo("Jane");
	}

	@Test
	void testFindByLastNameNotFound() {
		List<Person> people = personRepository.findByLastName("Smith");
		assertThat(people).isEmpty();
	}
}