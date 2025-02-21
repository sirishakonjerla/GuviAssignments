package assignments.four;
public class StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		String str="Hello";
		try {
			char character =str.charAt(10);
			System.out.println("Hello");
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
}
}