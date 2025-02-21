package assignments.four;
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args)  throws Exception{
		int[] num= {1,2,3,4,5};
		try {
			for(int i=0;i<=num.length;i++) {
			System.out.println(num[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("e.getMessage");
		}
	

	}
}