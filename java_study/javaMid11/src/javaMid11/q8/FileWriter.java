package javaMid11.q8;

import java.io.IOException;

public class FileWriter implements AutoCloseable {
   public FileWriter( String filePath) throws IOException {
	  System.out.println(filePath + " 파일을 엽니다.");
  }
   
  public void write(String data) throws IOException {
	  System.out.println(data + "를 파일에 저장합니다");
  }
  
  @Override
  public void close() throws IOException {
	   System.out.println("파일을 닫습니다 473");
		//   void close() throws Exception
	   // Override 규칙
	   // 1. 부모의 리턴타입 매소드명 매개변수는 동일해야 함
	   // 2. 접근제한자는 자식이 같거나 크거나
	   // 3. 예외처리는 자식이 같거나 자식이 작거나
	}
}
