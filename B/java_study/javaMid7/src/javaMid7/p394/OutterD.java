package javaMid7.p394;

public class OutterD {

	static int sia=200;
	
	static void sM() {
		int ss=10;
		class InnerD{
		    int sid=20;
		    void siM() {
		    	System.out.println("InnderD의 클래스의 siM()부분임" + sid + " " + sia );
		    }
		}
		InnerD id = new InnerD();
		id.siM();
	}
}
