package javaMid2.p302;

import javaMid2.p301.A;

public class C {
   
	void m() {
		A a  = new A();
	//	a.value = 500; //안됨 왜? protected로 value변수가 선언 되어 있어서 다른 패키지 안됨. 자녀만 가능 
	}
}
