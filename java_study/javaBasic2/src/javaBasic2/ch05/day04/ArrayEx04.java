package javaBasic2.ch05.day04;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 1�� �Է�-�Ǳ��űݾ� ��� / 2�� �Է�-�Ǳ��űݾ� ��� / 3�� �Է�-�Ǳ��űݾ� ��� -- �ݺ���
		// 1��,2��, 3�� �ݺ� ����Ѵ�
		Movie[] m = new Movie[3];
		Scanner sc = new Scanner(System.in);
		
        for(int i=0; i<m.length; i++) { //i=0, 1, 2
       
        	m[i] = new Movie();
        	
        	System.out.println( (i+1) +  "��° ���ڵ�(��)==>");
           	
        	System.out.print("��ȭ�� >");
        	String movieName=sc.nextLine();
        	
        	System.out.print("�ݾ� >");
        	int moviePrice =sc.nextInt();
        	sc.nextLine();
        	
        	System.out.print("���� >");
        	int age =sc.nextInt();
        	sc.nextLine();
        	
        	System.out.print("���Ź�� >");
        	String type=sc.nextLine();
        	        	
        	System.out.println( movieName + " " + moviePrice + " " + age + " " + type  );
        	
        	m[i].setMovieName(   movieName );
        	m[i].setMoviePrice( moviePrice );
           	m[i].setAge(  age  );
        	m[i].setType(  type  );
        	
        	m[i].priceCalc();
        }
        System.out.println();
        System.out.printf("%10s %10s %10s %10s", "��ȭ��", "�ݾ�", "����", "�Ǳ��űݾ�");
        for( int i=0; i<m.length; i++) {
        	System.out.printf("\n %10s %10d %10d %10d ", m[i].getMovieName(), m[i].getMoviePrice(), m[i].getAge(), m[i].getPrice());
        }
	}//end main

}//end class

class Movie{
	String movieName;//��ȭ��
	int moviePrice;//����
	int age;//����
	String type;//���Ź�� ���ͳ� ���� ����
	
	
	int price;//�Ǳ��űݾ�
	double rate;//������
	//�������ž� ��� �޼ҵ�
	public int priceCalc() {
		if( age < 20 )  rate = 0.25;
		else if( age >= 20 && age < 30) rate = 0.2;
		else rate=0.15;
		
		if(type.equals("���ͳ�")) rate = rate + 0.05;
		else if(type.equals("����")) rate = rate + 0.1;
		
		price =(int) ( Math.round( moviePrice *  ( 1 - rate)  ) );
		
		return price;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMoviePrice() {
		return moviePrice;
	}
	public void setMoviePrice(int moviePrice) {
		this.moviePrice = moviePrice;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}