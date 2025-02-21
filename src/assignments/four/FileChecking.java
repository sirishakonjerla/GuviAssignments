package assignments.four;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileChecking {

	public static void main(String[] args) {
		try {
			FileInputStream myFile =new FileInputStream(new File("example.txt"));
		} catch (FileNotFoundException e) {
			
		System.out.println(e.getMessage());
		}

	}

}
 