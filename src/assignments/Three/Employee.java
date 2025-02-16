package assignments.Three;

public class Employee {

String firstNatme;

String lastName;
int id;
int salary;
public Employee(String firstName, String lastName,int id,int salary) {
	this.firstNatme=firstName;
	this.lastName=lastName;
	this.id=id;
	this.salary=salary;
	
}
public int getID() {
	return this.id;
	
}

public  String getfirstName() {
	return this.firstNatme;
}
public String getlastName() {
	return this.lastName;
	
}
public int getsalary() {
	return this.salary;
}
public String getName() {
	return this.firstNatme+this.lastName;
	
}
public  int getAnnualSalary() {
	return this.salary*12;
}
public int raiseSalary(int percent) {
	this.salary=this.salary+(this.salary/100)*percent;
	return this.salary;
	
	
}


public String toString() {
	return "Employee [firstNatme=" + firstNatme + ", lastName=" + lastName + ", id=" + id + ", salary=" + salary + "]";
}
public static void main(String[] args) {
	Employee employee= new Employee( "sirisha","konjerla", 1234, 10000);
	System.out.println("Employee full name "+employee.getName());
	System.out.println("Employee annual salary "+employee.getAnnualSalary() );
	System.out.println("raise employee salary 5% "+employee.raiseSalary(5));
	System.out.println("employee details "+employee.toString());
	Employee employee1= new Employee( "srinu","jagar", 456, 10000);
}

}
