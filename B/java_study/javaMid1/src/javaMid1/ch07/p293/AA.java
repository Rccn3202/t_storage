package javaMid1.ch07.p293;

public class AA extends A{
   int aa;
   public void setAa(int aa) {
	this.aa = aa;
   }
   public int getAa() {
	return aa;
   }
   public AA() {
	  //�θ������ ȣ����
	// super(200); //������ �θ��� �⺻�����ڸ� ȣ���ض�  
	 super();  
	 System.out.println("AAŬ������ �⺻ ������");
   }
   public AA(int aa) {
	  System.out.println("AAŬ������ ����� ������");
   }
   
}
