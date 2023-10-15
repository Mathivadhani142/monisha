package day1;
import java.util.*;
public class Mathi {
	public static void main(String[] args) 
		    {
		  Scanner abc = new Scanner(System.in);  
		int num ;
		System.out.println("Enter the number");
		 int a = abc.nextInt();
		 int number = 2;
		  for(int i=1;i<=10;i++) {
		System.out.println(i+" x "+a+" = "+a*i);
		 }
		   System.out.println();
		     int fact =1;
		     for(int i =1;i<=5;i++) {
		    	 fact =fact*i;
		     }
		    System.out.println(fact);	 
		   	    
		    }

}
