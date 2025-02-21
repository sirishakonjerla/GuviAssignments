package assignments.four;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ListToArray {

	public static void main(String[] args) {
		List<String> stringList= new ArrayList<String>();
		stringList.add("Apple");
		stringList.add("Dragon");

		stringList.add("Grapes");
		
		String[] stringArray =convertListToArray(stringList);
		System.out.println("Array::"+ Arrays.toString(stringArray));

	}

	private static String[] convertListToArray(List<String> stringList) {
		String[] stringArray = new String[stringList.size()];
		for(int i=0; i<stringList.size();i++) {
			stringArray[i]=stringList.get(i);
		}
		
		return stringArray;
	}
	
}