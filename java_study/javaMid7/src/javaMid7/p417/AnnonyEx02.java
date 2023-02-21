package javaMid7.p417;

public class AnnonyEx02 {

	public static void main(String[] args) {
		 A a = new A() {
			 @Override
			public void abM() {
				// TODO Auto-generated method stub
				
			}
			 @Override
			public void abM2() {
				// TODO Auto-generated method stub
				
			}
		 }; //익명 구현 클래스
            RemoteControll rc =  new RemoteControll() {
				
				@Override
				public void turnOn() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void turnOff() {
					// TODO Auto-generated method stub
					
				}
			};
	}

}
