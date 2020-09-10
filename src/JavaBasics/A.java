package JavaBasics;

public class A {

	public A() {
		System.out.println("Parent class constructor");
	}
	
	public A(int i) {
		System.out.println("Single parameter constructor*************");
		System.out.println("Parent class constructor with value of i "+ i);
	}
	
	public A(int i, int j) {
		System.out.println("Double parameter constructor**************");
		System.out.println("Parent class constructor with value of i "+ i);
		System.out.println("Parent class constructor with value of j "+ j);
	}
}
