package JavaBasics;

public class DataTypes {

	//main() is starting /execution point of program
	public static void main(String[] args) {

		//Primitive data types: integer, double, char,boolean

		//data type integer
		int i=10;
		i=20;
		int j=30;
		System.out.println(j);
		int k=-1;
		System.out.println("value of k is" +k);

		//data type double
		double d=12.33;
		d=11.11;
		double d1=13.13;
		double d2=100; //because it will be treated as 100.00
		System.out.println( d1+d2);

		//data type char. char only allow single digit value and should be written within single quotes
		char c='a';
		c='b';
		char c1='K';
		char c2='1';
		char c3='$';

		//data type boolean- true and false are values and aslo keywords already available in java
		boolean b1 = true;
		boolean b2=false;

		//data type string, string is not a data type it is a class but yes we can use string as a data type for string values 
		String s ="java trainings";
		String s2="Hi, this is my java code";
		String s3="1000";
		String s4="12.33";


	}

}
