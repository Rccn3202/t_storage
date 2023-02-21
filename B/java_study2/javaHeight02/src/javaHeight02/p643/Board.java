package javaHeight02.p643;

public class Board {
    private String subject;//게시판 제목
    private String content;//게시판 내용
    private String writer;//게시판 글쓴이
    private String joindate;//작성일
    
        
	public Board(String subject, String content, String writer, String joindate) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.joindate = joindate;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
    
    
}
