package javaMid3.p321;

public class InstanceofEx {
   public static void personInfo(Person person) {
	   System.out.println("name :" + person.name);
	   person.walk();
	   //���������� �θ�ü ������ �ڽ� ��ü�� ������ ����
	  // System.out.println( person.studentNo );
	   //��� (Student) person �̷��� �ٿ� ĳ�����ϱ�
	   
	  // Animal animal = new Cat();    
	   // (Cat) animal
	   
	   if(person instanceof Student ) {
		 //person��ü�� �ּҰ� StudentŬ������ ����ų �� ������ ��  
		   Student s = (Student) person;
		   System.out.println( s.studentNo );
		   s.study();
	   }
   }
   public static void main(String[] args) {
	  Person p1 = new Person("ȫ�浿");
	  personInfo(p1);
	  System.out.println();
	  
	  Person p2 = new Student("��浿", 10);
	  personInfo(p2);
  }
}
