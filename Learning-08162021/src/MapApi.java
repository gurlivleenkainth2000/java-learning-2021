import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class MapApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map<Integer, String> map = new HashMap<Integer, String>();
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();		
		
		map.put(101, "John");
		map.put(1021, "Fionna");
		map.put(7037, "Kim");
		map.put(208, "Dave");
		map.put(2074, "Jack");
		map.put(101, "Harry");
//		map.put(null, "Robin");
//		map.put(null, "George");
		
		System.out.println(">>> Map: \n" + map);
		
		map.forEach((id, name) -> {
			System.out.println(id + "\t" + name);
		});
		
		System.out.println();
		Set<Integer> keys = map.keySet();
		keys.forEach((key)->{
			System.out.println(key + "\t" + map.get(key));
		});
	}

}
