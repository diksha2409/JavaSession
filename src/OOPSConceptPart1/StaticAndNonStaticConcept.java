package OOPSConceptPart1;

public class StaticAndNonStaticConcept {

	//global variables: the scope of global variables will be available across all functions with some conditions
	
	String name="Tom";  //non static global variable
	static int age=25; //static global variable


	public static void main(String[] args) { 
		
		//how to call static methods and variables
		//1. direct calling
		sum();
		System.out.println(age);
		//2. calling by class name
		StaticAndNonStaticConcept.sum();
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods and variables
		//by creating an object of the class
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static methods by using object reference: yes we can access
		obj.sum(); //warning will be given and this is not the good practice.
		
	}

	public void sendMail() { //non static method
		System.out.println("Send mail method");
	}

	public static void sum() { //static method
		System.out.println("sum method");
	}



}
