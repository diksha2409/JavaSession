package JavaBasics;

public class FinalizeConcept {

	public void finalize(){
		System.out.println("Inside the finalize method");
	}
	
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinallyConcept f2 = new FinallyConcept();
		
		f1=null;
		f2=null;

		System.gc();
	}

}
