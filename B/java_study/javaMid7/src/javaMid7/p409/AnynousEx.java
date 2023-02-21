package javaMid7.p409;

public class AnynousEx {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Ok버튼을 클릭합니다");
				
			}
		}
		
		btnOk.setClickListener( new OkListener() );
		btnOk.click();

		Button btnCancle = new Button();
		
		class CancleListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel버튼을 클릭합니다");
				
			}
			
		}
		
		btnCancle.setClickListener( new CancleListener() );
		btnCancle.click();
		
		//스페이스바를 눌렀습니다.
		//마우스를 클릭했습니다
		
		//11시 10분까지 쉬기
		//지금의 구조는 자바에서 화면을 구현할 때 사용하는 구조입니다. 
	}

}
