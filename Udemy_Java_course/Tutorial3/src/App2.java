import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App2 {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<>();
		TreeMap<Integer, String> tmap = new TreeMap<>();
		
		testMap(hmap);
		testMap(lhmap);
		testMap(tmap);

	}

	public static void testMap(Map<Integer, String> map) {
		map.put(1, "one");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(3, "three");
		map.put(19, "nineteen");

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key+": "+value);
		}

	}

}
