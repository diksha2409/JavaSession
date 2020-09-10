package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		//compile time polymorphism or static polymorphism
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety(); 
		b.engine();

		System.out.println("#############");

		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("#############");
		
		//top casting
		//child class object can be referred by parent class reference variable is called dynamic polymorphism or runtime polymorphism
		Car c1=new BMW(); 
		c1.start();
		c1.stop();
		c1.refuel();
		
		//down casting: is possible but will give you ClassCastException
		BMW b1 =(BMW) new Car();
		
	}

}
