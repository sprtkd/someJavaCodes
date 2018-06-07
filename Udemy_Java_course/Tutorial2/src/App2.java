
public class App2 {

	public static void main(String[] args) {
		Plant p1;
		p1 = new Plant();
		p1.grow();
		p1= new Tree();
		p1.grow();
		
		int ab=888;
		System.out.println(ab);
		byte cd=78;
		System.out.println(cd);
		ab=cd;
		cd=(byte)128;
		System.out.println(cd);
		System.out.println(ab);
		
		
	}

}
