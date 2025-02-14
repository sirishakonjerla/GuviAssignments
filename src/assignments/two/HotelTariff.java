package assignments.two;


import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of month");
		int month = scanner.nextInt();
		System.out.println("Enter room rent per day");
		float rent=scanner.nextFloat();
		System.out.println("Number of days to stay");
		int days=scanner.nextInt();
		float roomtariff=0;
		switch (month) {
		case 4,5,6,11,12:
			 roomtariff=rent*days+((rent*days)/100)*20;
			System.out.printf("%.2f",roomtariff);
		    break;
		case 1,2,3,7,8,9,10:
		  roomtariff=rent* days;  
			System.out.printf("%.2f",roomtariff);
		    break;
		 default:
			 System.out.println("Invalid month");
		
		}
		
		
		

	}

}
