package assignments.Three;

public class Person {

String name;
int age;
public Person( String name, int age) {
	this.name=name;
	this.age=age;		
}
public String getName() {
	return this.name;
	
}
public int getAge(){
	return this.age;
	
}
public static void main(String[] args) {
	Person person = new Person("sirisha", 34);
	System.out.println("person name " + person.getName());
	System.out.println("person age  " + person.getAge());
	
	
}

}




