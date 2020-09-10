package JavaBasics;

public class FinallyConcept {

	public static void main(String[] args) {
		//test1();
		//test2();
		division();
		divisionException();
	}
	public static void test1(){
		try{
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}
		catch(Exception e){
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside finally block");
		}
	}

	public static void test2() {
		try{
			System.out.println("inside test2");
		}
		finally { 
			System.out.println("finally code in test2 method");
		}
	}

	public static void division() {
		try {
			System.out.println("inside try block");
			int i=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}
		finally{
			System.out.println("excute this code even after any exception");
		}
	}
	
	public static void divisionException() {
		try {
			System.out.println("inside try block");
			int i=10/0;
		}
		catch(NullPointerException e) {
			System.out.println("inside catch block will throw an ArithmeticException");
		}
		finally{
			System.out.println("excute this code even after any exception");
		}
	}
}
