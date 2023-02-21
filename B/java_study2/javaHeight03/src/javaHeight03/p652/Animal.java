package javaHeight03.p652;

public class Animal {
    private String kind;//동물 종류
    private int lifeSpan;//수명
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
    //동등객체 만들기
	//kind가 같고 lifeSpan 같으면 같은 객체 인식함
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
