package javaMid8.Exec.p422.q7;

public class Chatting {
   class Chat{
	   void start() { }
	   void sendMessage(String message) { }
   }
   void startChat(String chatId) {
	  String nickName="�⺻��";
	  
	  
	  Chat chat = new Chat() { 
		  @Override
		void start() {
			while(true) {
				String inputData = "�ȳ��ϼ���";
				String message = "[" + nickName + "]" + inputData;
				sendMessage(message);
			}
		}
	  };
	  chat.start();
   }
}
