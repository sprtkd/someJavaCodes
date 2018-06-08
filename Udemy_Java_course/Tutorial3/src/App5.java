import java.util.ArrayList;
import java.util.Comparator;

public class App5 {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<>();

		arrlist.add("lion");
		arrlist.add("cat");
		arrlist.add("animul");
		arrlist.add("animals");

		arrlist.sort(new StringComparator());

		for (String i : arrlist)
			System.out.println(i);
	}

}

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);
	}
	
}
