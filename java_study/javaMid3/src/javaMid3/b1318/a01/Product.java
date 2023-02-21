package javaMid3.b1318.a01;

public class Product {
   int price;
   int bonunsPoint;
   
   public Product() { }
   
   public Product(int price) {
	   this.price = price;
	   bonunsPoint = (int) (price / 10.0);
   }
   
}