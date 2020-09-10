package OOPSConceptPart1;

public class FunctionsInJava {

	//functions and methods are same
	//main method is the starting point of execution
	//return type of main method is always void bcz we never write return statement in main method
	public static void main(String[] args) {
		FunctionsInJava obj= new FunctionsInJava(); 
		//due to this(above) line one object will be created, obj is the reference variable, referring to the object
		//after creating the object the copy of all non static methods will be given to this object

		obj.test();
		int l=obj.pqr();
		System.out.println(l);

		String s1=obj.qa();
		System.out.println(s1);

		int div=obj.division(30, 10);
		System.out.println(div);
	}

	//Non static method
	//void means does not return any value
	//you can not use both return and void at a time.

	//no input no output
	public void test() {
		System.out.println("test method");
	}

	//no input some output
	//here we are returning c which is int so for this method we user int return type
	public int pqr() {
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}

	//no input some output
	//here we are returning s which is String so for this method we user String return type
	public String qa() {
		System.out.println("qa method");
		String s="Selenium";
		return s;
	}

	//here we are returning d which is int so for this method we user int return type
	public int division(int x, int y) {//x and y are the input parameters
		System.out.println("division method");
		int d=x/y;
		return d;
	}
}
