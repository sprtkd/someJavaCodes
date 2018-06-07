class MachineU {
	
	private String name;
	private int numofGears;
	
	public static final int key=25;
	
	public static int staticvar=2;
	
	public MachineU(String localname,int gears) {
		System.out.println("Ahoy!");
		name = localname;
		numofGears = gears;
	}
	
	public void printInfo() {
		System.out.println(name +": "+ numofGears);
	}
}

public class App9 {

	public static void main(String[] args) {
		MachineU myMachine = new MachineU("Drill",2);
		myMachine.printInfo();
		
		System.out.println(MachineU.staticvar);
		System.out.println(MachineU.key);
		
	}

}
