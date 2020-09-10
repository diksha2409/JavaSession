package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
	
		System.out.println(USBBank.min_val);
		
		HSBCBank b=new HSBCBank();
		
		b.credit();
		b.debit();
		b.transferMoney();
		b.educationLoan();
		b.carLoan();
		
		//dynamic polymorphism
		USBBank us=new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
	}

}
