package javaBasic2.ch05.day02;

public class ClassEx153page {

	public static void main(String[] args) {
		// 교재 153
		String name="홍길동이순신정현희";
        String name1 = "홍길동";
        
        String name2 = new String("홍길동");
        String name3 = new String("홍길동");
        
        char c0 = name.charAt(6);
        System.out.println( c0 );
        
        int len = name.length();
        System.out.println("길이는 " + len);
        
        //정현희 각자이름 바꾸기
        String changeWord = name.replace("정현희", "각자이름");
        System.out.println(changeWord);
        
        //165페이지 책을 보시고 실습해 보기
        
        //주말과제
        // 1. 반찬가게 코드 완성하기
        // 2. 문자열 잘라내기 161예제를 참고해서
           /* 주민번호에서 7번째 자리는 성별입니다. 1,3이면 남자, 2 4이면 여자인지 판단하기
            * 생년월일을 잘라서 년도구하기 월구하기 일구하기   
            */
        
        String ssn="880815-1234567";
        String year = ssn.substring(0, 2);
        String month = ssn.substring(2, 4);
        String day = ssn.substring(4, 6);
        System.out.println(year + "년 " + month + "월 " + day + "일");
        
        String gender = ssn.substring(7,8);
        //"1" --> 1
        int gValue = Integer.parseInt(gender);
        if(gValue == 1 || gValue==3 ) System.out.println("남자");
        if(gValue == 2 || gValue==4 ) System.out.println("여자");
        
        if(gender.equals("1") || gender.equals("3"))  System.out.println("남자");
        if(gender.equals("2") || gender.equals("4"))  System.out.println("여자");
        
        //149 null /  NullPointException
        
	}

}
