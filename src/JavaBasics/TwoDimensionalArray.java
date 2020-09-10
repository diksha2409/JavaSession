package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		//two dimensional array
		String x[][]=new String[3][5];

		System.out.println(x.length); //it will give you the total no of rows
		System.out.println(x[0].length); //it will give you the total no of columns

		//Assigning vaue for first row with diff columns
		x[0][0]="A";
		x[0][1]="B";	
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		//Assigning vaue for second row with diff columns
		x[1][0]="0";
		x[1][1]="1";	
		x[1][2]="2";
		x[1][3]="3";
		x[1][4]="4";
		//Assigning vaue for third row with diff columns
		x[2][0]="a2";
		x[2][1]="b2";	
		x[2][2]="c2";
		x[2][3]="d2";
		x[2][4]="e2";
		
		System.out.println(x[1][2]);
		
		//print all the values of 2D array
		for(int row=0; row<x.length; row++) {
			for(int col=0; col<x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}
	}

}
