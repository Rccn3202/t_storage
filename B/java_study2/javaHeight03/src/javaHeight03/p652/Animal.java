package javaHeight03.p652;

public class Animal {
    private String kind;//���� ����
    private int lifeSpan;//����
	public Animal(String kind, int lifeSpan) {
		super();
		this.kind = kind;
		this.lifeSpan = lifeSpan;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
    //���ü �����
	//kind�� ���� lifeSpan ������ ���� ��ü �ν���
	@Override
	public int hashCode() {
		
		return kind.hashCode() + lifeSpan;
	}
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Animal) {
			Animal animal = (Animal) obj;
			return animal.kind.equals(this.kind) && animal.lifeSpan == this.lifeSpan;
		}
		return false;
	}
	
   
}
