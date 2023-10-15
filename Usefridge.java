package day1;

public class Usefridge {
	public static void main(String[]args) {
		 Fridge f1= new Fridge();
		 System.out.println("  FRIDGE task1 ");
		 f1.brand = "Samsung";
		 System.out.println("brand :"+f1.brand); 
	     f1.model = 2023 ;
		 System.out.println("model :"+f1.model);
		 f1.colour = "grey";
	     System.out.println("colour :"+f1.colour);
		 f1.price = 52000;
		 System.out.println("price :"+f1.price);
		 f1.discountamount= 10;
		 System.out.println("discountamount :"+f1.discountamount);
		 f1.netprice= (f1.price-(f1.price*f1.discountamount)/100);
		 System.out.println("netprice :"+f1.netprice);
	}

}
