package javaBasic3.ch06.day01;

public class ClassEx03 {

	public static void main(String[] args) {
		// �����ڳ��� ȣ���ϱ� 
         Book book = new Book();
         
         System.out.println( book.getBookTitle() );
         System.out.println( book.getBookPrice() );
	}
}

class Book{
	String bookTitle;//å����
	int bookPrice;//å����
	
	public Book() {
		this(30000);
		System.out.println("�̰��� �⺻ �������̴�.");
	}
	
	public Book(int bookPrice) {
		this("�̰��� CSS�̴�.");
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