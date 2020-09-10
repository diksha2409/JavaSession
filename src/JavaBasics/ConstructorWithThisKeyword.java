package JavaBasics;

public class ConstructorWithThisKeyword {
	//class variables
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		this.name=name; //this.global variable=local variable
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj=new ConstructorWithThisKeyword("tomm", 30);
	

	}

}
