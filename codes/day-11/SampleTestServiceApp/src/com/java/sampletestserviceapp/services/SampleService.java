package com.java.sampletestserviceapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.sampletestserviceapp.entities.Person;

@Path("/myservice")
public class SampleService {

	private static List<Person> people;

	static {
		people = new ArrayList<Person>();
		people.add(new Person(1, "anil"));
		people.add(new Person(2, "sunil"));
		people.add(new Person(3, "mahesh"));
	}

	@GET
	@Path("/greetings/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMessage(@PathParam("name") String name) {
		return "Greetings " + name;
	}

	@GET
	@Path("/welcome/{name}")
	@Produces(MediaType.APPLICATION_XML)
	public String getWelcomeMessage(@PathParam("name") String name) {
		return "Welcome " + name;
	}

	@GET
	@Path("/records")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getPeople() {
		return people;
	}

	@POST
	@Path("/records/add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Person addPerson(Person person) {
		if (person != null) {
			Stream<Person> foundPeople = people.stream().filter(p -> p.getId() == person.getId());
			if (foundPeople != null && foundPeople.count() > 0) {
				return null;
			}
			people.add(person);
			return person;
		} else {
			System.out.println("person was not found");
			return null;
		}
	}
}
