package javaBasic2.ch05.day02;

public class ClassEx153page {

	public static void main(String[] args) {
		// ���� 153
		String name="ȫ�浿�̼���������";
        String name1 = "ȫ�浿";
        
        String name2 = new String("ȫ�浿");
        String name3 = new String("ȫ�浿");
        
        char c0 = name.charAt(6);
        System.out.println( c0 );
        
        int len = name.length();
        System.out.println("���̴� " + len);
        
        //������ �����̸� �ٲٱ�
        String changeWord = name.replace("������", "�����̸�");
        System.out.println(changeWord);
        
        //165������ å�� ���ð� �ǽ��� ����
        
        //�ָ�����
        // 1. �������� �ڵ� �ϼ��ϱ�
        // 2. ���ڿ� �߶󳻱� 161������ �����ؼ�
           /* �ֹι�ȣ���� 7��° �ڸ��� �����Դϴ�. 1,3�̸� ����, 2 4�̸� �������� �Ǵ��ϱ�
            * ��������� �߶� �⵵���ϱ� �����ϱ� �ϱ��ϱ�   
            */
        
        String ssn="880815-1234567";
        String year = ssn.substring(0, 2);
        String month = ssn.substring(2, 4);
        String day = ssn.substring(4, 6);
        System.out.println(year + "�� " + month + "�� " + day + "��");
        
        String gender = ssn.substring(7,8);
        //"1" --> 1
        int gValue = Integer.parseInt(gender);
        if(gValue == 1 || gValue==3 ) System.out.println("����");
        if(gValue == 2 || gValue==4 ) System.out.println("����");
        
        if(gender.equals("1") || gender.equals("3"))  System.out.println("����");
        if(gender.equals("2") || gender.equals("4"))  System.out.println("����");
        
        //149 null /  NullPointException
        
	}

}
