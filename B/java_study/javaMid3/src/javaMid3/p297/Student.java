package javaMid3.p297;

public class Student extends Person{
    public void 공부하기() {
    	System.out.println(" 학교 공부 ");
    }
    @Override
    public void 말하기() {
    	// TODO Auto-generated method stub
    	System.out.println("말을 짧게 줄여 말함");
    }
    @Override
    public void 먹기() {
    	// TODO Auto-generated method stub
    	System.out.println("파스타, 피자");
    }
    @Override
    public void 걷기() {
    	// TODO Auto-generated method stub
    	System.out.println("걷기 싫어함");
    }
    @Override
    public void 잠자기() {
    	// TODO Auto-generated method stub
    	System.out.println("새벽잠이 많음");
    }
}
