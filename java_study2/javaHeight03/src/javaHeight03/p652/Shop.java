package javaHeight03.p652;

public class Shop {
   private String custname; //고객명
   private String custPhone; //고객전화번호
   private int point; //포인트
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Shop(String custname, String custPhone, int point) {
		super();
		this.custname = custname;
		this.custPhone = custPhone;
		this.point = point;
	}
   
    @Override
	public int hashCode() {
		return custPhone.hashCode() + custname.hashCode();
	}
    
    @Override
	public boolean equals(Object obj) {
		if( obj instanceof Shop ) {
			Shop shop = (Shop) obj;
			return shop.custPhone.equals(this.custPhone) && shop.custname.equals(this.custname);
		}
		return false;
	}
    
}
