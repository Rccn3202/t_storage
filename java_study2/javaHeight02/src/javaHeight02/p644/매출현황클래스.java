package javaHeight02.p644;

public class ������ȲŬ���� {
   private String ��������;
   private String �ŷ�ó�ڵ�;
   private String ��������;
   private int �Ǹŷ�;
   private int ����ݾ�;
   private String ����ó;
	   
	@Override
	public String toString() {
			// Object Ŭ������ �޼ҵ��� �ּҸ� ������ �ڵ����� toString()�ٴ´�.
		    //�׷��� ��� Ŭ���� ObjectŬ������ �ڽ��̹Ƿ� �̰��� ������ �����
	  return �������� + " " + �ŷ�ó�ڵ� + " " + �������� + " " + �Ǹŷ� + " " + ����ݾ� +" " + ����ó  ;
	}   
   
	public ������ȲŬ����(String ��������, String �ŷ�ó�ڵ�, String ��������, int �Ǹŷ�, int ����ݾ�, String ����ó) {
		this.�������� = ��������;
		this.�ŷ�ó�ڵ� = �ŷ�ó�ڵ�;
		this.�������� = ��������;
		this.�Ǹŷ� = �Ǹŷ�;
		this.����ݾ� = ����ݾ�;
		this.����ó = ����ó;
	}
	public String get��������() {
		return ��������;
	}
	public void set��������(String ��������) {
		this.�������� = ��������;
	}
	public String get�ŷ�ó�ڵ�() {
		return �ŷ�ó�ڵ�;
	}
	public void set�ŷ�ó�ڵ�(String �ŷ�ó�ڵ�) {
		this.�ŷ�ó�ڵ� = �ŷ�ó�ڵ�;
	}
	public String get��������() {
		return ��������;
	}
	public void set��������(String ��������) {
		this.�������� = ��������;
	}
	public int get�Ǹŷ�() {
		return �Ǹŷ�;
	}
	public void set�Ǹŷ�(int �Ǹŷ�) {
		this.�Ǹŷ� = �Ǹŷ�;
	}
	public int get����ݾ�() {
		return ����ݾ�;
	}
	public void set����ݾ�(int ����ݾ�) {
		this.����ݾ� = ����ݾ�;
	}
	public String get����ó() {
		return ����ó;
	}
	public void set����ó(String ����ó) {
		this.����ó = ����ó;
	}
	   
	   
   
}
