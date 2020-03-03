import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
	public static void main(String[] args) {
		Map <Integer,String> map = new HashMap<>();
		map.put(10, "Raman");
		map.put(12, "Ram");
		map.put(11, "Rahul");
		map.put(13, "Ravi");
		
		
		System.out.println("Now Exporting the Map key");
		
		List<Integer> list = map.keySet().stream().collect(Collectors.toList());
		list.forEach(System.out::println);
		
		System.out.println("\n Exporting the map values");
		
		List<String> list2 = map.values().stream().collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		System.out.println("\n Exporting map values except Ravi");
		
		List<String> list3 = map.values().stream().filter(x-> !"ravi".equalsIgnoreCase(x)).collect(Collectors.toList());
		list3.forEach(System.out::println);
		
		
	}

}
