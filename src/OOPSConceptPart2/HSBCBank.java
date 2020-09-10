package OOPSConceptPart2;

public class HSBCBank implements USBBank, BrazilBank { //we can achieve multiple inheritance 
	//"is-a" realtionship
	
	//if the class is implementing any interface, then its mandatory to define/override all the methods of interface
	
	//overriding methods of USBBank interface
	public void credit() {
		System.out.println("hsbc---credit method");
	}
	
	public void debit() {
		System.out.println("hsbc---debit method");
	}
	
	public void transferMoney() {
		System.out.println("hsbc---transferMoney method");
	}
	
	//seperate methods of HSBCBank class
	public void educationLoan() {
		System.out.println("hsbc---education loan method");
	}
	
	public void carLoan() {
		System.out.println("hsbc---car loan method");
	}

	//overriding methods of BrazilBank interface
	public void mutualFund() {
		System.out.println("hsbc---mutual fund method");
	}
}
