import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		LinkedList<Integer> linkList = new LinkedList<>();

		calcDelay(arrList);
		calcDelay(linkList);
	}

	public static void calcDelay(List<Integer> list) {
		

		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1E5; i++) {
			list.remove(list.size()-1);
		}
		
		long endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime);
	}

}
