package exBaisc;

public class MyFrist {

	public static void main(String[] args) {
		//변수 선언하기
		String university; //대학명
		String department;//학과명
		String studentId;//학번
		
		//변수에 값을 넣기
		university = "서울대학교";
		department ="컴퓨터공학과";
		studentId = "23080511";
		
		System.out.println(university);
		System.out.println(department);
		System.out.println(studentId);
		
        System.out.println("------------"); 
		System.out.println("학교 : " + university);
		System.out.println("학과 : " + department);
		System.out.println("학번 : " + studentId);
		
		System.out.println("------------");
		System.out.println("학교 : " + university + "학과 : " + department + "학번 : " + studentId ) ;
	
		System.out.println("------------");
		System.out.print("학교 : " + university);
		System.out.print("학과 : " + department);
		System.out.print("학번 : " + studentId);
	
		System.out.println("------------");
		System.out.printf("학교 :  %s, 학과 : %s, 학번 : %s", university, department, studentId);
	}

}
