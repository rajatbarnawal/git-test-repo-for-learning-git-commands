import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Rajat", 10000));
		list.add(new Employee(2, "Ravi", 12000));
		list.add(new Employee(3, "Ram", 80000));
		list.add(new Employee(5, "Raj", 18000));
		list.add(new Employee(4, "Ramesh", 35000));

		Map<Integer, String> map = list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println("Map with id and name:" + map);
		
		Map<Integer,Long> map2=list.stream().collect(Collectors.toMap(Employee::getId, Employee::getSalary));
		System.out.println("Map with id and salary:" + map2);
		
		Map<String,Long> map3 = list.stream().collect(Collectors.toMap(x -> x.getName(), x -> x.getSalary()));
		System.out.println("Map with Name and Salary:"+ map3);
		
	}
}
