package javaMid6.p376;

public class SoubdableEx {

	public static void printSound( Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
