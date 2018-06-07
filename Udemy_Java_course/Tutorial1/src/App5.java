import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line:");
		String line = input.nextLine();
		System.out.println("The line you entered:\n" + line);

		System.out.println("Enter an integer:");
		int value = input.nextInt();
		System.out.println("The value you entered: " + value);

		do {
			System.out.println("Enter an integer:");
			value = input.nextInt();
		} while (value != 5);

		System.out.println("You entered a 5!");
		boolean loop=true;
		while (loop) {
			line = input.nextLine();
			switch (line) {
				case "start":
					System.out.println("Machine started");
					break;
				case "stop":
					System.out.println("Machine stopped");
					loop=false;
					break;
					
				default:
					System.out.println("Unknown command");
					break;
			}
		}

		input.close();
	}

}
