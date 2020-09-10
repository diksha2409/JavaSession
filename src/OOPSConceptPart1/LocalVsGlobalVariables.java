package OOPSConceptPart1;

public class LocalVsGlobalVariables {

	//Global variables or class variables
	//global varibles can be access through out the class
	//if u want to access global variable ten you have to create an object for that class
	String name="Tom";
	int age =25;



	public static void main(String[] args) {
		//local variable for main() 
		//local variables can be access in the class directly
		int i=10;
		System.out.println(i);
		
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public void sum() {
		//local variables for sum()
		int i=15 ;
		int j=20;

	}
}


