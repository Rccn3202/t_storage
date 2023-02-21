package javaMid3.p297;

public class ColorPoint extends Point{

	String color="red";
	
	@Override
	void printAll() {
		px = 3;
		py = 4;
		System.out.println( color + "  (" + px + ", " + py + ")" );
	}
}
