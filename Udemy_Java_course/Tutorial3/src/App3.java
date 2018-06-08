import java.util.HashSet;

public class App3 {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<>();

		if (hset.isEmpty())
			System.out.println("Empty..");

		hset.add("one");
		hset.add("two");
		hset.add("three");

		System.out.println(hset);
		
		if(hset.contains("one"))
			System.out.println("one");
		
		if(hset.contains("hell"))
			System.out.println("hekl");
		
		
		HashSet<String> hsetnew = new HashSet<>();

		hsetnew.add("six");
		hsetnew.add("four");
		hsetnew.add("three");
		hsetnew.add("one");
		
		System.out.println(hsetnew);
		
		HashSet<String> intersect = new HashSet<>(hset);
		intersect.removeAll(hsetnew);
		System.out.println(intersect);
		
	}

}
