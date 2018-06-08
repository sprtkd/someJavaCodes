import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

public class App6 {

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> q1 = new ArrayBlockingQueue<>(4);

		q1.add(1);
		q1.add(2);

		System.out.println(q1 + "end");

		LinkedList<String> animals = new LinkedList<>();

		animals.add("cat");
		animals.add("dog");

		Iterator<String> it = animals.iterator();

		while (it.hasNext()) {
			String v = it.next();
			System.out.println(v);
			if(v.equals("cat"))
				it.remove();
		}
		
		System.out.println("----------------");

		for (String animal : animals)
			System.out.println(animal);

	}

}
