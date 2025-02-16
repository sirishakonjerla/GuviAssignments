package assignments.Three;

public class Circle {

	double radius;
	double pi;
	public Circle() {
		
	}
		
	public Circle(double radius ,double pi){
		this.radius=radius;
		this.pi=pi;
		
	}

	public double getCircumference() {
		return 2*pi*radius;
	}
	public static void main(String[] args) {
		Account account = new Account("sirisha",100000 );
		
		System.out.println("balance "+ account.getBalance());
		System.out.println("balance after deposit 50000 "+ account.deposit(50000));
        System.out.println(("balance after withdrawl 4000 "+account.withdrawl(4000)));
	}

}
