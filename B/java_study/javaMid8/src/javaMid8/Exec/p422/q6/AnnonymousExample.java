package javaMid8.Exec.p422.q6;

public class AnnonymousExample {
	public static void main(String[] args) {
      	Anonymous anony = new Anonymous();
      	anony.field.run(); //�ڵ����� �޸��ϴ�.
      	anony.method1(); //�¿����� �޸��ϴ�
      	anony.method2( new Vehicle() {
			
					@Override
					public void run() {
						System.out.println("Ʈ���� �޸��ϴ�");
						
					}
				  }
      			
      	);

	}
}
