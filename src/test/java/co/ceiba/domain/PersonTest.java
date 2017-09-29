package co.ceiba.domain;

import co.ceiba.testdatabuilder.PersonTestDataBuilder;
import org.junit.Test;
import org.junit.Assert;

public class PersonTest {
	private static String NAME = "Dilson";
	private static String LAST_NAME = "Escobar";
	
	@Test
	public void personaTest() {
		//Arrange
		PersonTestDataBuilder object = new PersonTestDataBuilder().
				withName("Dilson").
				withLastName("Escobar");
		
		//Act
		Person person1 = object.build();
		Person person2 = new Person(NAME, LAST_NAME);
		
		//Assert
		Assert.assertEquals(NAME, person1.getName());
		Assert.assertEquals(LAST_NAME, person1.getLastName());
		
		Assert.assertEquals(person1.getName(), person2.getName());
		Assert.assertEquals(person1.getLastName(), person2.getLastName());
	}
}
