package assignments.four;
import java.util.ArrayList;
public class ClearArrayList{
	public static void main (String[] args) {
	ArrayList<String> stringlist = new ArrayList<String>();
	stringlist.add("Banana");
	stringlist.add("Banana");
	stringlist.add("orange");
	System.out.println("ArrayList before clearing::" + stringlist);
	int listLen = stringlist.size();
	for( int i=listLen-1; i>=0; i--) {
		stringlist.remove(i);
	}
	System.out.println("ArrayList after cleaning::" + stringlist);
	
}

}

