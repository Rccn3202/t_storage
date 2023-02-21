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
		
		//[0]주소에 조림류 10 5 입력해 보기
		banArr[0].setKind("조림류");
		banArr[0].setMakeFood(10);
		banArr[0].setSaleFood(5);
		
		System.out.println( banArr[0].getKind()  );
		System.out.println( banArr[0].getMakeFood()  );
		System.out.println( banArr[0].getSaleFood() );
		
		//[1]주소에 국류 7 3
		//[2]주소에 샐러드류 15 13
		
		//문) 클래스 Hospital 병원 클래스를 만들고 
		//   필드는 진료과목 (medical department) - 치과, 내과, 정형외과, 통증의학과 
		//        의사명(doctor name) - 김수영, 최진민, 박명호, 정경미
		//        진료일(treatment day) - "20230117", "20230116", "20230112", "20230110"
		// 이렇게 해서 입력하고 출력하는 것 만들기
		/* 출력은
		 *   진료과목 의사명 진료일
		 *   치과    김수영  20230117
		 *   내과    최진민  20230116
		 *   정형외과 박명호  20230112
		 *   통증의학과 정경미 20230110   
		 *   
		 *   11시 5분까지 쉬기 
		*/
		Hospital[] hosArr = {new Hospital(),new Hospital(),new Hospital(),new Hospital()};

		   hosArr[0].setMedicalDepartment("치과");
		      hosArr[0].setDoctorName("김수영");
		      hosArr[0].setTreatmentDay("20230117");
		      
		      hosArr[1].setMedicalDepartment("내과");
		      hosArr[1].setDoctorName("최진민");
		      hosArr[1].setTreatmentDay("20230116");
		      
		      hosArr[2].setMedicalDepartment("정형외과");
		      hosArr[2].setDoctorName("박명호");
		      hosArr[2].setTreatmentDay("20230112");
		      
		      hosArr[3].setMedicalDepartment("통증의학과");
		      hosArr[3].setDoctorName("정경미");
		      hosArr[3].setTreatmentDay("20230110");
		      
		      System.out.println("진료과목   의사명    진료일");
		      
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