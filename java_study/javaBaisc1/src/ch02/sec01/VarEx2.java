package ch02.sec01;

import java.util.Scanner;

public class VarEx2 {

	public static void main(String[] args) {
		//교재 43
		//문자 한글자 'a' 컴퓨터사용하는 전 세계문자는 유니코드라 명시해둠 
		char aWord='a';//97 - ?  = 65
		System.out.println( (char) (aWord - 32));

		//문제 대문자 K를 변수 넣기 --> 소문자 s를 출력하기 
        char kWord='K';
        System.out.println( (char) (kWord + 40 ));
		//문제 나의 이름의 유니코드 숫자 알아보기
		char name1='정';
		char name2='현';
		char name3='희';
		System.out.println((int) (name1) + "  " + (int) name2 + "  " + (int) name3 );
	
		//여러글자 문자열 " " 문자열 객체인 String을 사용한다.
		String name = "정현희";  //1 3바이트 2 6바이트 3 9바이트 
		
		String hakbun = "221208"; //문자열 --> 정수형으로 바꾸기 
		System.out.println(Integer.valueOf( hakbun ) + 1 ); //1byte = 8bit
		
		String avgS = "52.3"; // 52.2 + 100 = 152.2
		// 문자열은 계산 안되니깐 문자열을 실수형으로 바꿔야 한다.
		float convAvg=Float.parseFloat(avgS); //"52.3" --> 52.3
		convAvg = convAvg + 100;
		System.out.println(convAvg);
		
		double convAvg1 = Double.parseDouble(avgS);
		convAvg1 = convAvg1 + 100;
		System.out.println(convAvg1+"~~");
		
		String 성별="false"; // "true"-->true
		//문자열 "true"을 불린형(논리)으로 변환하세요
		boolean 변환한성별 = Boolean.parseBoolean(성별);
		System.out.println(변환한성별);
		if (변환한성별)
			System.out.println("남자");
		else 
			System.out.println("여자");
		
		
		
		// 그리고 100을 더해서 출력 한다.
		// 10분 쉬기 10시까지 
		
		
		//위의 학번의 다음사람의 학번을 구하시오 답 221209
		int hakbun1 = 221208;
		// System.out.println("다음 사람의 학번은 " + (hakbun1 + 1)  );
		
		
		//자동타입변환
		byte v1=10; //1byte
		int v2=20; //4byte
		
		v2 = v1;  //v2 = 10  byte형의 값이 int형으로 들어간다 큰 곳으로 이동하니깐 가만히 있음
		
		//강제형 변환
		v1 =( byte ) v2; //v2의 값을 v1에 넣는다 즉 int형이 byte형으로 들어간다. 큰값이 작은 값으로 들어감
		
		int v3=50; //정수형
		double v4 = 10.0; //8바이트 실수형
		float v5=20.5f; //4바이트 실수형
		
		v4 = v3;
		v4 = v5;
		v3 = (int)v4;//정수형 실수형
		v3 = (int) v5;
		v5 = (float)v4;
		
		
		//문제 숫자2개를 입력받아서 사칙연산해 보세요
		Scanner sc = new Scanner(System.in); //키보드 입력을 담당하는 Scanner 클래스를 사용한다
		
//		int x = sc.nextInt();//키보드에서 정수를 입력 받는다 
//		System.out.println("입력값 " + x);
//		
//		int y = sc.nextInt();
//		System.out.println("입력값 " + y);
//		
//		//double형으로 실수 2개를 입력 받으세요
//		double z = sc.nextDouble();
//		System.out.println("실수입력값1 " + z);
//		
//		double z1 = sc.nextDouble();
//		System.out.println("실수입력값2 " + z1);
		
		//boolean형 2개를 입력받으세요 입력은 true false로 해줍니다
/*       boolean b1 = sc.nextBoolean();
         System.out.println("블린형1 ==>" + b1);
         
         boolean b2 = sc.nextBoolean();
         System.out.println("블린형2 ==>" + b2);
*/		
		//문자열형 2개를 입력받으세요 입력은 "자바" "재미있다"로 해줍니다.
		//nextLine()-입력받고 한줄을 내린다. 또는 next()을 사용하세요
		String s1 = sc.next();
		System.out.println("문자형1==>" + s1);
		
		String s2 = sc.next();
		System.out.println("문자형2==>" + s2);
		
		
		
		
		
	}
}
