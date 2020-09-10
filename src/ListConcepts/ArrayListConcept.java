package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		//static array: size is fixed
		int a[]=new int[3]; 

		//Dynamic array: EX: ArrayList
		//1. can contain duplicate values/elements
		//2. maintains insertion order
		//3. synchronized
		//4. allows random access to fetch the element because it stores the basis of indexes

		ArrayList arr=new ArrayList();

		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr.size());

		arr.add(40);
		arr.add(50);
		arr.add(50);
		arr.add(12.33);
		arr.add("Test");
		arr.add('A');
		arr.add(true);
		System.out.println(arr.size()); //size of array
		arr.remove(1);
		System.out.println(arr.size());

		System.out.println(arr.get(2)); //to get the value from an index

		//to print all the values from arraylist: 
		//1. use for loop
		//2. using iterator

		for(int i=0; i<arr.size();i++) {
			System.out.println(arr.get(i));
		}

		//non generic vs generic
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(100);
		//		arr1.add("Selenium"); this will not allowed it will throw an error

		//it will accept only String values
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("test");
		arr2.add("selenium");

		//here no restriction, u can add any value
		ArrayList<E> arr3=new ArrayList<E>();

		//Employee class object
		Employee e1=new Employee("Diksha", 25, "QA");
		Employee e2=new Employee("Tomm", 27, "BA");
		Employee e3=new Employee("Peter", 23, "Dev");

		//create an arraylist
		ArrayList<Employee> arr4=new ArrayList<Employee>();
		arr4.add(e1);
		arr4.add(e2);
		arr4.add(e3);

		//iterator to traverse the values
		Iterator<Employee> it=arr4.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.department);
		}

		System.out.println("********************");
		
		//addAll
		ArrayList<String> arr5=new ArrayList<String>();
		arr5.add("test");
		arr5.add("selenium");
		arr5.add("qtp");
		
		ArrayList<String> arr6=new ArrayList<String>();
		arr6.add("dev");
		arr6.add("java");
		arr6.add("javascript");
		
		//addAll function merge the second arraylist with the first arralist
		arr5.addAll(arr6);
		
		for(int i=0; i<arr5.size(); i++) {
			System.out.println(arr5.get(i));
		}
		System.out.println("***********");
		
		//removeAll
		arr5.removeAll(arr6);
		for(int i=0; i<arr5.size(); i++) {
			System.out.println(arr5.get(i));
		}
		System.out.println("***************");
		
		//retainAll
		ArrayList<String> arr7=new ArrayList<String>();
		arr7.add("test");
		arr7.add("selenium");
		arr7.add("qtp");
		
		ArrayList<String> arr8=new ArrayList<String>();
		arr8.add("test");
		arr8.add("java");
		
		arr7.retainAll(arr8);
		for(int i=0; i<arr7.size(); i++) {
			System.out.println(arr7.get(i));
		}

		
	}

}
