package ListConcepts;

public class Employee {

	String name;
	int age;
	String department;

	//if the local var and global var is same then we have to use "this" keyword
	Employee(String name, int age, String department){
		this.name=name;
		this.age=age;
		this.department=department;

	}


}
