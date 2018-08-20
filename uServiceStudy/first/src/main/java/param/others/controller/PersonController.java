package param.others.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import param.others.domain.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

	private List<Person> persons = new ArrayList<>();

	@GetMapping
	public String getName() {

		return "Hai Param";
	}

	@GetMapping("/all")
	public List<Person> getAll() {
		return persons;
	}

	@GetMapping("/{id}")
	public Person findById(@PathVariable("id") Long id) {

		return persons.stream().filter(person -> person.getUserID() == id).findFirst().get();

	}

	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable("id") Long id) {

		List<Person> p = persons.stream().filter(it -> it.getUserID() == id).collect(Collectors.toList());
		persons.removeAll(p);
	}
	
	@PutMapping
	public void updatePerson(@RequestBody Person p) {
		
		Person pa = persons.stream().filter(it -> it.getUserID() == p.getUserID()).findFirst().get();
		
		persons.set(persons.indexOf(pa), p);
	}

	@PostMapping
	public Person add(@RequestBody Person person) {

		person.setUserID(persons.size() + 1);
		persons.add(person);

		return person;
	}

}
