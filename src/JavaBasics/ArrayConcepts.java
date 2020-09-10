package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {

		//Array: to store similar datatype in a array variable		
		//Lowest index in 0
		//higest index is n-1 where n is size of array
		//one dimentional array
		
		//disadvantages of array:
		//1. size is fixed(Static array) - to overcome this problem we used collections(dynamic array)
		//2. similar datatypes- stores only similar datatype values - to overcome this problem we used object array
		//3. 
		
		//integer array
		int i[]=new int[4];

		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i[3]);

		//ArrayIndexOutOfBoundsException throws when try to access the value which does not exist
		//		System.out.println(i[4]);

		//size of array
		System.out.println("Size of array is "+i.length);

		//print all the values of array. whenever ask to print all values will use for loop always
		for(int j=0;j<i.length;j++) {
			System.out.println("Array values are:" +i[j]);
		}

		//Double Array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.33;
		d[2]=14.44;
		System.out.println(d[2]);

		//Character array
		char c[]=new char[3];
		c[0]='q';
		c[1]='2';
		c[2]='$';
		System.out.println(c[2]);

		//boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[1]);

		//String array
		String s[]=new String[3];
		s[0]="test";
		s[1]="Hello";
		s[2]="World";
		System.out.println(s.length);
		System.out.println(s[2]);
		
		//Object array: used to store diff datatypes values
		Object ob[]=new Object[6];
		ob[0]="tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
		ob[5]="London";
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		for(int k=0;k<ob.length;k++) {
			System.out.println("values in object arrays are :" +ob[k]);
		}
		
		

	}

}
