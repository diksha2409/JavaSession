package JavaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {

		//While loop
		//disadvantage of while loop is it will generate infinite loop if we dnt get incremental/decremental part

		int i=1;  //inititalization

		while(i<=10) {//conditional part
			System.out.println(i);
			i=i+1; //decremental/incremental part
		}
		System.out.println("######################");

		//For loop
		//j++ means j=j+1
		for(int j=0; j<=10; j++) {//initialization,conditional,incremental/decremental
			System.out.println(j);
		}
		System.out.println("######################");

		//print 10 to 1
		for(int k=10;k>=1;k--) {//k-- means k=k-1
			System.out.println(k);

		}
	}

}
