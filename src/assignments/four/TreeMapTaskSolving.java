package assignments.four;
import java.util.TreeMap;



public class TreeMapTaskSolving {

	public static void main(String[] args) {
		employeeNamesInAlphabeticalOrderUsingTreeMap();
	}
	
	public static void employeeNamesInAlphabeticalOrderUsingTreeMap() {
		
		TreeMap<String, Integer> myTreeMap = new TreeMap<String, Integer>();
		
		myTreeMap.put("Srinu", 5000);
		myTreeMap.put("Siri", 3000);
		myTreeMap.put("Vidhula", 2000);
		myTreeMap.put("Daksh", 4000);
		myTreeMap.put("Anusha", 1000);
		
		System.out.println("value in my tree map is :: " + myTreeMap);
		
	}

}
