package javaMid8.Exec.p422;

public class Exec01 {

	public static void main(String[] args) {
		// 9�� Ȯ�ι���
        //InnerA�� ��ü�����ϱ�
		OutterA o = new OutterA();
		o.localMethod();
		
		OutterA.InnterA oi = o.new InnterA();
		
		//InnserSA�� ��ü�����ϱ�
		OutterA.InnterSA osi = new OutterA.InnterSA();
	}

}
