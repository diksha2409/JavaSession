package OOPSConceptPart1;

public class Car {

	//class variables
	int mod;
	int wheel;


	public static void main(String[] args) {

		Car a=new Car(); //RHS is called object of car class, 'a' is object reference variable
		Car b=new Car(); //new keyword is used to create the object 
		Car c=new Car(); //'a','b','c' are the object reference variables

		a.mod=2015;
		a.wheel=4;

		b.mod=2014;
		b.wheel=4;

		c.mod=2013;
		c.wheel=4;

		System.out.println("Before assigning the references");
		System.out.println(a.mod);
		System.out.println(a.wheel);	
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the references");
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod); //Output will be 10
		c.mod=20;
		System.out.println(a.mod); //Output will be 20
		System.out.println(c.mod);
		
	}

}
