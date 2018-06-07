
class Person {
	String name;
	int age;

	void speak() {
		System.out.println("Hello. My name is "+name+" and I am "+age +" years old.");
	}
	
	int getAge()
	{
		return age;
	}
	
	void move(String dir, double speed)
	{
		System.out.println(name + " is moving "+ dir + "wards with speed "+speed);
	}
}



public class App7 {

	public static void main(String[] args) {
		Person myPerson = new Person();
		myPerson.name = "Suprotik Dey";
		myPerson.age = 22;

		myPerson.speak();
		System.out.println(myPerson.getAge());
		
		myPerson.move("West",23.5);
	}

}
