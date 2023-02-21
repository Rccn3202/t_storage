package javaBasic2.ch05.day04;

public class ArrayEx02 {

	public static void main(String[] args) {
	/*	Banchan b1 = new Banchan();
		Banchan b2 = new Banchan();
		Banchan b3 = new Banchan();
       
		Banchan[] banArr = { b1,b2,b3 }; */
		
		Banchan[] banArr = { new Banchan(), new Banchan(), new Banchan() };
		System.out.println(banArr[0]);
		System.out.println(banArr[1]);
		System.out.println(banArr[2]);
		
		//[0]�ּҿ� ������ 10 5 �Է��� ����
		banArr[0].setKind("������");
		banArr[0].setMakeFood(10);
		banArr[0].setSaleFood(5);
		
		System.out.println( banArr[0].getKind()  );
		System.out.println( banArr[0].getMakeFood()  );
		System.out.println( banArr[0].getSaleFood() );
		
		//[1]�ּҿ� ���� 7 3
		//[2]�ּҿ� ������� 15 13
		
		//��) Ŭ���� Hospital ���� Ŭ������ ����� 
		//   �ʵ�� ������� (medical department) - ġ��, ����, �����ܰ�, �������а� 
		//        �ǻ��(doctor name) - �����, ������, �ڸ�ȣ, �����
		//        ������(treatment day) - "20230117", "20230116", "20230112", "20230110"
		// �̷��� �ؼ� �Է��ϰ� ����ϴ� �� �����
		/* �����
		 *   ������� �ǻ�� ������
		 *   ġ��    �����  20230117
		 *   ����    ������  20230116
		 *   �����ܰ� �ڸ�ȣ  20230112
		 *   �������а� ����� 20230110   
		 *   
		 *   11�� 5�б��� ���� 
		*/
		Hospital[] hosArr = {new Hospital(),new Hospital(),new Hospital(),new Hospital()};

		   hosArr[0].setMedicalDepartment("ġ��");
		      hosArr[0].setDoctorName("�����");
		      hosArr[0].setTreatmentDay("20230117");
		      
		      hosArr[1].setMedicalDepartment("����");
		      hosArr[1].setDoctorName("������");
		      hosArr[1].setTreatmentDay("20230116");
		      
		      hosArr[2].setMedicalDepartment("�����ܰ�");
		      hosArr[2].setDoctorName("�ڸ�ȣ");
		      hosArr[2].setTreatmentDay("20230112");
		      
		      hosArr[3].setMedicalDepartment("�������а�");
		      hosArr[3].setDoctorName("�����");
		      hosArr[3].setTreatmentDay("20230110");
		      
		      System.out.println("�������   �ǻ��    ������");
		      
		      for( int i=0 ; i< hosArr.length ; i++) {
		    	  System.out.println(hosArr[i].getMedicalDepartment()+" "+hosArr[i].getDoctorName()+" "+hosArr[i].getTreatmentDay());
		      }
		      
		      for( Hospital h  : hosArr) {
		    	  System.out.println(h.getMedicalDepartment()+" "+h.getDoctorName()+" "+h.getTreatmentDay());
		      }
		      
//		      System.out.println(hosArr[0].getMedicalDepartment()+" "+hosArr[0].getDoctorName()+" "+hosArr[0].getTreatmentDay());
//		      System.out.println(hosArr[1].getMedicalDepartment()+" "+hosArr[1].getDoctorName()+" "+hosArr[1].getTreatmentDay());
//		      System.out.println(hosArr[2].getMedicalDepartment()+" "+hosArr[2].getDoctorName()+" "+hosArr[2].getTreatmentDay());
//		      System.out.println(hosArr[3].getMedicalDepartment()+" "+hosArr[3].getDoctorName()+" "+hosArr[3].getTreatmentDay());
//		
		
	}
}
class Hospital{
	   String medicalDepartment;
	   String doctorName;
	   String treatmentDay;
	   public String getMedicalDepartment() {
	      return medicalDepartment;
	   }
	   public void setMedicalDepartment(String medicalDepartment) {
	      this.medicalDepartment = medicalDepartment;
	   }
	   public String getDoctorName() {
	      return doctorName;
	   }
	   public void setDoctorName(String doctorName) {
	      this.doctorName = doctorName;
	   }
	   public String getTreatmentDay() {
	      return treatmentDay;
	   }
	   public void setTreatmentDay(String treatmentDay) {
	      this.treatmentDay = treatmentDay;
	   }
}


class Banchan{
	String kind;
	int makeFood;
	int saleFood;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getMakeFood() {
		return makeFood;
	}
	public void setMakeFood(int makeFood) {
		this.makeFood = makeFood;
	}
	public int getSaleFood() {
		return saleFood;
	}
	public void setSaleFood(int saleFood) {
		this.saleFood = saleFood;
	}

}