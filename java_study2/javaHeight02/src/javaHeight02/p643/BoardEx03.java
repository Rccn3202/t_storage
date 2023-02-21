package javaHeight02.p643;

import java.util.ArrayList;
import java.util.List;

public class BoardEx03 {

	public static void main(String[] args) {
	   
		     List<Board> boardList1 = new ArrayList<Board>();
		     
		     boardList1.add( new Board("날씨", "비가와요", "홍길동", "0210"));
		     boardList1.add( new Board("요일", "금요일", "김길동", "0211"));
		     boardList1.add( new Board("주말", "프로젝트해요", "이길동", "0212"));
		     
		     for(int i=0; i< boardList1.size(); i++) {
		    	 System.out.println( boardList1.get(i).getWriter()  );
		     }
		     
		     //게시판 제목에 "요일"이라는 것을 쓴 사람의 이름과 작성일 검색하세요
		     //답 김길동 0211
		     for(int i=0; i< boardList1.size(); i++) {
		       if( boardList1.get(i).getSubject().equals("요일") ) {
		    	   System.out.println(  boardList1.get(i).getWriter()   );
		    	   System.out.println( boardList1.get(i).getJoindate() );
		       }
		     } 
		     
		     //작성일이 "0210"것의 게시글의 제목과 내용을 출력하세요
		     for(int i=0; i<boardList1.size(); i++) {
		    	 if( boardList1.get(i).getJoindate().equals("0210")) {
		    		 System.out.println( boardList1.get(i).getSubject()  );
		    		 System.out.println( boardList1.get(i).getContent()  );
		    	 }
		     }
		     
		     
		     
	}

}
