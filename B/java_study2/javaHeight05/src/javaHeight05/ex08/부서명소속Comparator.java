package javaHeight05.ex08;

import java.util.Comparator;

public class �μ���Ҽ�Comparator implements Comparator<�μ���Ҽ�>{

	@Override
	public int compare(�μ���Ҽ� o1, �μ���Ҽ� o2) {
		
		return o1.get�μ���().compareTo(o2.get�μ���()) ;
	}
}
