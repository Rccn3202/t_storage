package javaMid3.p297;

public class C extends BB{
	int s=0;
	@Override
	public int sum() {
		for(int i=1; i<=200; i++) {
			s = s + i;
		}
		return s;
	}
	
	@Override
	public int dif() {
		return s - 200;
	}
	
	public long mul() {
		long m=1;
		for(int i=1; i<=20; i++) {
			m = m * i;
		}
		return m;
	}
}
