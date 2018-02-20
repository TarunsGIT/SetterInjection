package in.co.person;

public class Person {

	private String Salutation;
	private String name;

	Person() {
		System.out.println("Default Cons");
	}

	public void setSalutation(String salutation) {// XML INPUT
		Salutation = salutation;
	}

	public void hello(String name) {// METHOD INPUT
		System.out.println(" Hello.. " + Salutation + " " + name);
	}

}
