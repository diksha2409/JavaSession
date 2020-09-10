package OOPSConceptPart2;

//interface have only method declaration
//it does not have method body 
//in interface we can declare variables, variables are by default static in nature
//variables value will not be changed i.e its final/constant in nature 
//no static methods in interface 
//no main method in interface
//we can not create an object of interface
//interface is abstract in nature i.e we can not create an object of interface

public interface USBBank {
	int min_val=100;

	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
}
