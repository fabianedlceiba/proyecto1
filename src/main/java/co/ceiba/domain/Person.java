package co.ceiba.domain;

/**
 * Clase Persona
 * 
 * @author Fabian Diaz
 * @version 1.0
 */
public class Person {
	
	private String name;
	private String lastName

	/**
	 * Constructor de la clase
	 */

	public Person() {
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param name
	 *            Nombre de la persona
	 * @param lastName
	 *            Apellido de la persona
	 */
	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
