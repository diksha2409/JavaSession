package JavaBasics;

public class ConstructorConcept {

	//Can we overload a constructor: Yes we can overload a constructor
	//constructor will be called the moment when you create an object
	
	public ConstructorConcept() {
		System.out.println("default constructor i.e zero argumenet constr ");
	}

	public ConstructorConcept(int i) {
		System.out.println("single param constr");
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("two params constr");
		System.out.println("the value of i is:"+ i);
		System.out.println("the value of j is:"+ j);
	}

	public static void main(String[] args) {
		ConstructorConcept obj =new ConstructorConcept();	
		ConstructorConcept obj1=new ConstructorConcept(10);
		ConstructorConcept obj2=new ConstructorConcept(10,20);
		
	}

}
