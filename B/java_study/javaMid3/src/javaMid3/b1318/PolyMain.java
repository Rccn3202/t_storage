package javaMid3.b1318;

public class PolyMain {

	public static void main(String[] args) {
		CaptionTv ca = new CaptionTv(); //부모 클래스 / 자식클래스 모두 사용 가능 
		ca.channel = 11;
		ca.power = true;
		ca.text = "파노라마";
		ca.caption();
		ca.channelUp();
		ca.channelDown();
		
		Tv tv = new Tv(); //부모클래스는 자기 것만 사용가능 
		tv.channel=7;
		tv.power=false;
		tv.channelDown();
		tv.channelUp(); 
		
		//다형성으로 객체화하기
		Tv tv1 = new CaptionTv();
		tv1.channel=7;
		tv1.power=false;
		tv1.channelDown();
		System.out.println("============");
		tv1.channelUp(); 
		//다형성에서 부모것을 override한 메소드는 자식게 나온다
		
		//tv1.text="자식 필드";  자식 필드 못쓴다.
		//tv1.caption(); 자식 필드 못쓴다
		
		//자식 필드와 메소드를 사용하려면 다운캐스팅 하세요
		CaptionTv ct1 = (CaptionTv)  tv1;
		ct1.text = "자식필드";
		ct1.caption();
		
		

	}

}
