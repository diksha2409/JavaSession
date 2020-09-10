package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(20);
		obj.sum(10, 5);
	}

	public static void main(int i) {
	}

	public static void main(int p, int q) {
	}

	//we can overload main method
	//you can not create an method inside the method
	//duplicate methods: i.e same method name with same arguments are not allowed within the samae class
	//method overloading: When method name is same with diff arguments within the same class

	public void sum() { //0 input param
		System.out.println("sum method with zero arguments");
	}

	public void sum(int i) { //1 input param
		System.out.println("sum method with one argument");
		System.out.println(i);
	}

	public void sum(double d) {

	}

	public void sum(int k,int l) { //2 input param
		System.out.println("sum method with two arguments");
		System.out.println(k+l);
	}


}
