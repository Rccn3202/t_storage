package exBaisc;

public class MyFrist {

	public static void main(String[] args) {
		//���� �����ϱ�
		String university; //���и�
		String department;//�а���
		String studentId;//�й�
		
		//������ ���� �ֱ�
		university = "������б�";
		department ="��ǻ�Ͱ��а�";
		studentId = "23080511";
		
		System.out.println(university);
		System.out.println(department);
		System.out.println(studentId);
		
        System.out.println("------------"); 
		System.out.println("�б� : " + university);
		System.out.println("�а� : " + department);
		System.out.println("�й� : " + studentId);
		
		System.out.println("------------");
		System.out.println("�б� : " + university + "�а� : " + department + "�й� : " + studentId ) ;
	
		System.out.println("------------");
		System.out.print("�б� : " + university);
		System.out.print("�а� : " + department);
		System.out.print("�й� : " + studentId);
	
		System.out.println("------------");
		System.out.printf("�б� :  %s, �а� : %s, �й� : %s", university, department, studentId);
	}

}
