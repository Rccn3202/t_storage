package javaMid7.p394;

public class OutterD {

	static int sia=200;
	
	static void sM() {
		int ss=10;
		class InnerD{
		    int sid=20;
		    void siM() {
		    	System.out.println("InnderD�� Ŭ������ siM()�κ���" + sid + " " + sia );
		    }
		}
		InnerD id = new InnerD();
		id.siM();
	}
}
