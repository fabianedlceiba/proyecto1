package co.ceiba.testdatabuilder;
import co.ceiba.domain.Person;

public class PersonTestDataBuilder {
	private String name;
	private String lastName;
	
	public PersonTestDataBuilder() {
		name = "Ceiba";
		lastName = "Software House";
	}
	
	public PersonTestDataBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Person build() {
		Person person = new Person();
		person.setName(name);
		person.setLastName(lastName);
		
		return person;
	}
}
