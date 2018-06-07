
public class Person implements Info {
	public void greet() {
		System.out.println("Hello there");
	}

	@Override
	public void showInfo() {
		System.out.println("This is a Person class");		
	}

}
