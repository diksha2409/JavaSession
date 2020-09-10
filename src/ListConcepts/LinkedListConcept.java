package ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll= new LinkedList<String>();

		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");

		//print
		System.out.println("Content of linkedlist:"+ ll);
		
		//add first
		ll.addFirst("Diksha");
		
		//add last
		ll.addLast("Automation");
		System.out.println("Content of linkedlist:"+ ll);

		//get
		System.out.println(ll.get(0));
		
		//set 
		ll.set(0, "Tomm");
		System.out.println(ll.get(0));
		
		//remove
		ll.removeFirst();
		ll.removeLast();
		ll.remove(2);
		System.out.println("Content of linkedlist:"+ ll);
		
		//how to print all the values of LinkedList
		//using for loop
		System.out.println("******Using for loop");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		//using advance for loop
		System.out.println("******Using advance for loop");
		for(String str:ll) {
//			ll.add("RPA"); // not allowed - throw concurrentmodificationexception
			System.out.println(str);
		}
		
		//using iterator
		System.out.println("******Using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//using while loop
		System.out.println("******Using while loop");
		int num=0;
        while(ll.size()>num) {
        	System.out.println(ll.get(num));
        	num++;
        }
	}

}
