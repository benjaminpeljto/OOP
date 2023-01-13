package exception_handling;

public class Person {

	private String name;
	private int age;
	
	public Person(String personName, int personAge) {
		if(personName == null || personName.equals("") || personName.length()>40) {
			throw new IllegalArgumentException("Person name not well defined.");
		}
		
		if(personAge < 0 || personAge > 120) {
			throw new IllegalArgumentException("Person name not well defined (0-120)");
		}
		this.name = personName;
		this.age = personAge;
	}

}
