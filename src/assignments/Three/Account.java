package assignments.Three;

public class Account {
	String name;
	int balance;
	String type;
	
public Account() {
	
}
public Account(String name,int balance) {
	this.name=name;
	this.balance=balance;	
}

public Account(String name,int balance,String type) {
	this.name=name;
	this.balance=balance;
	this.type=type;
}
public  int getBalance() {
	return this.balance;	
}
public int deposit(int amount) {
	this.balance =this.balance+amount;
	return this.balance;
}
public int withdrawl(int amount) {
	this.balance=this.balance-amount;
	return this.balance;
}
public static void main(String[] args) {
	Account account = new Account("sirisha",100000 );
	
	System.out.println("balance "+ account.getBalance());
	System.out.println("balance after deposit 50000 "+ account.deposit(50000));
    System.out.println(("balance after withdrawl 4000 "+account.withdrawl(4000)));
}

}
