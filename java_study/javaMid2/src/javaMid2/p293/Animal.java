package javaMid2.p293;

public class Animal {
   //부모클래스
	private String food;
	private String sound;
	
	public void printAll() {
		System.out.println( "먹는 것은 " + food);
		System.out.println( "소리는? " + sound);
	}
	
	public final void ppAA() {
		
	}
	
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
}
