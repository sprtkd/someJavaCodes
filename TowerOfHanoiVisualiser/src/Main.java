import java.util.Scanner;

import com.sprtkd.TowerOfHanoi;

public class Main {

	public static void main(String[] args) {
		int disks;

		System.out.println("\t..Welcome to Tower of Hanoi Simulation..\n");
		System.out.println("Enter the number of disks to simulate: ");
		Scanner in = new Scanner(System.in);
		disks = in.nextInt();
		TowerOfHanoi th = new TowerOfHanoi(disks);

		th.simulate();

		in.close();
	}

}
