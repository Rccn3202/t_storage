package javaMid7.p409;

public class AnynousEx {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Ok��ư�� Ŭ���մϴ�");
				
			}
		}
		
		btnOk.setClickListener( new OkListener() );
		btnOk.click();

		Button btnCancle = new Button();
		
		class CancleListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel��ư�� Ŭ���մϴ�");
				
			}
			
		}
		
		btnCancle.setClickListener( new CancleListener() );
		btnCancle.click();
		
		//�����̽��ٸ� �������ϴ�.
		//���콺�� Ŭ���߽��ϴ�
		
		//11�� 10�б��� ����
		//������ ������ �ڹٿ��� ȭ���� ������ �� ����ϴ� �����Դϴ�. 
	}

}
