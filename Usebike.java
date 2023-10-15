package day1;

public class Usebike {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		//System.out.println("  BIKE task4 ");
		b1.brand = "Maruti Shift";
	//	System.out.println("brand :" + b1.brand);
		b1.price = 600000;
		//System.out.println("price :" + b1.price);
		b1.colour = "red";
		//System.out.println("colour :" + b1.colour);
		b1.tube = true;
		//System.out.println("Tubeless is " + b1.tube);
		b1.netprice = ((b1.price * 5) / 100 + b1.price);
		//System.out.println("netprice :" + b1.netprice);
		//b1.taxamount = ((b1.price * 10) / 100 + b1.netprice);
		//System.out.println("Taxamount :" + b1.taxamount);
		//b1.discount = ((b1.price * 3) / 100 - b1.discount);
		//System.out.println("discountamount :" + b1.discount);
        b1.display();
        
	}
}
