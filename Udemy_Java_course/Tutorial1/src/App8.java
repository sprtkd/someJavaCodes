class PersonObj {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}

public class App8 {
	public static void main(String[] args) {
		PersonObj p1 = new PersonObj();

		p1.setName("Suprotik Dey");
		p1.setAge(22);

		System.out.println(p1.getName() + ": " + p1.getAge());
	}
}
