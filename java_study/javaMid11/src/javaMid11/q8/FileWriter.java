package javaMid11.q8;

import java.io.IOException;

public class FileWriter implements AutoCloseable {
   public FileWriter( String filePath) throws IOException {
	  System.out.println(filePath + " ������ ���ϴ�.");
  }
   
  public void write(String data) throws IOException {
	  System.out.println(data + "�� ���Ͽ� �����մϴ�");
  }
  
  @Override
  public void close() throws IOException {
	   System.out.println("������ �ݽ��ϴ� 473");
		//   void close() throws Exception
	   // Override ��Ģ
	   // 1. �θ��� ����Ÿ�� �żҵ�� �Ű������� �����ؾ� ��
	   // 2. ���������ڴ� �ڽ��� ���ų� ũ�ų�
	   // 3. ����ó���� �ڽ��� ���ų� �ڽ��� �۰ų�
	}
}
