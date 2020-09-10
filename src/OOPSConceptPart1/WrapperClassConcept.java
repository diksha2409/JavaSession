package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		//data conversion: String to int
		String x="100";
		System.out.println(x+20);
		int i = Integer.parseInt(x);
		System.out.println(i+20);

		//data conversion: String to double
		String y="12.33";
		System.out.println(y+10);
		double d=Double.parseDouble(y);
		System.out.println(d+10);

		//data conversion: String to boolean
		String k="truefalse";
		System.out.println(k);
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		//data conversion: int to String
		int j=200;
		System.out.println(200+20);
		String s=String.valueOf(j);
		System.out.println(s+20);

		//exception: NumberFormatException For input string: "100A"
/*		String u="100A";
		int l=Integer.parseInt(u);
		System.out.println(l);*/
	}

}
