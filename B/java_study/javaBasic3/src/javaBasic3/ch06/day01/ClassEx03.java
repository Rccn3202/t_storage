package javaBasic3.ch06.day01;

public class ClassEx03 {

	public static void main(String[] args) {
		// 생성자끼리 호출하기 
         Book book = new Book();
         
         System.out.println( book.getBookTitle() );
         System.out.println( book.getBookPrice() );
	}
}

class Book{
	String bookTitle;//책제목
	int bookPrice;//책가격
	
	public Book() {
		this(30000);
		System.out.println("이곳은 기본 생성자이다.");
	}
	
	public Book(int bookPrice) {
		this("이것이 CSS이다.");
		this.bookPrice = bookPrice;
	}
	
    public Book(String bookTitle) {
    	this.bookTitle = bookTitle;
	}
	
	public Book(String bookTitle, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
    
    
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
}