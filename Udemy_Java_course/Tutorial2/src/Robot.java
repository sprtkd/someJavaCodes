
public class Robot {
	private int id;
	private Brain brain;
	
	private class Brain {
		public void think()
		{
			System.out.println("brain is thinking");
		}
	}
	
	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Robot: "+id+" starting");
		brain=new Brain();
		brain.think();
	}
}
