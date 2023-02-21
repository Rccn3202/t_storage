package javaMid3.p318;

public class PolyEx02 {
  public static void main(String[] args) {
	  Driver mydriver = new Driver();
	  
	  Bus bus = new Bus();
	  mydriver.driver( bus );
	  
	  Taxi taxi = new Taxi();
	  mydriver.driver( taxi );
	  
	  
  }
}
