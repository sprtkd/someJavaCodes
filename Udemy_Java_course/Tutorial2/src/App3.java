import java.util.ArrayList;

public class App3 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("Hello");
		strings.add("My");
		strings.add("Name");
		
		showList(strings);
		
	}
	
	public static void showList(ArrayList<?> list)
	{
		for(Object item: list)
		{
			System.out.print(item + " ");
		}
	}

}
