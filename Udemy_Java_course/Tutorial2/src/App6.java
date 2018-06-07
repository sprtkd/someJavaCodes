
public class App6 {

	public static void main(String[] args) {
		towerOfHanoi(10, "FromPole", "ToPole", "SparePole");
	}

	public static void towerOfHanoi(int numOfDisks, String fromPole, String toPole, String sparePole) {
		if (numOfDisks == 1) {
			System.out.println("Move Disk 1 from " + fromPole + " to " + toPole);
			return;
		}

		towerOfHanoi(numOfDisks - 1, fromPole, sparePole, toPole);
		System.out.println("Move Disk " + numOfDisks + " from " + fromPole + " to " + toPole);
		towerOfHanoi(numOfDisks - 1, sparePole, toPole, fromPole);

		return;
	}

}
