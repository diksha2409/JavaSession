package OOPSConceptPart2;

//"has-a" relationship
public class BMW extends Car{

	//When same method is present in parent class as well as in child class with the same name and same no of arg is called method overriding
	public void start() {
		System.out.println("BMW start method");
	}
	
	public void theftSafety() {
		System.out.println("BMW theftsafety method");
	}
}
