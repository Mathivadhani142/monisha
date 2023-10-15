package day1;

public class Usecar {
public static void main(String[]args) {
	 Car c1 = new Car();
	 c1.brand = "Maruti ";
	 System.out.println("brand :"+c1.brand);
	 c1.price = 600000;
	 System.out.println("price :"+c1.price);
	 c1.colour = "red";
	 System.out.println("colour :"+c1.colour);
	 c1.netprice= (c1.price-(c1.price*5/100));
	 System.out.println("netprice :"+c1.netprice);
	 c1.taxamount =((c1.price*2/100) + c1.netprice); 
	 System.out.println("taxamount :"+c1.taxamount);
}
}
