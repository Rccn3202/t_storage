package javaMid3.b1318;

public class PolyMain {

	public static void main(String[] args) {
		CaptionTv ca = new CaptionTv(); //�θ� Ŭ���� / �ڽ�Ŭ���� ��� ��� ���� 
		ca.channel = 11;
		ca.power = true;
		ca.text = "�ĳ��";
		ca.caption();
		ca.channelUp();
		ca.channelDown();
		
		Tv tv = new Tv(); //�θ�Ŭ������ �ڱ� �͸� ��밡�� 
		tv.channel=7;
		tv.power=false;
		tv.channelDown();
		tv.channelUp(); 
		
		//���������� ��üȭ�ϱ�
		Tv tv1 = new CaptionTv();
		tv1.channel=7;
		tv1.power=false;
		tv1.channelDown();
		System.out.println("============");
		tv1.channelUp(); 
		//���������� �θ���� override�� �޼ҵ�� �ڽİ� ���´�
		
		//tv1.text="�ڽ� �ʵ�";  �ڽ� �ʵ� ������.
		//tv1.caption(); �ڽ� �ʵ� ������
		
		//�ڽ� �ʵ�� �޼ҵ带 ����Ϸ��� �ٿ�ĳ���� �ϼ���
		CaptionTv ct1 = (CaptionTv)  tv1;
		ct1.text = "�ڽ��ʵ�";
		ct1.caption();
		
		

	}

}
