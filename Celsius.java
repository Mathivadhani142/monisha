package day1;

public class Celsius {
 
	   public static void main (String args[])  {
	   // { float Fahrenheit, Celsius;  
	       int   Celsius= 13;  
	       int   Fahrenheit =((Celsius*9)/5)+32;  
	        ////  System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  

	        
	          {
	              int a,  // To hold first digit (Ones) of number 
	                  b,  // To hold second digit (Tens) of number
	                  c;  // To hold third digit (Hundreds) of number

	      	for(int number = 1; number <= 500; number++)
	      	{
	                  int temp = number;
	      	    a = temp % 10;

	                  temp = temp / 10;
	             b = temp % 10;
	                  
	                  temp = temp / 10;
	                  c = temp % 10;

	      	    if(a*a*a + b*b*b + c*c*c == number)
	                  {
	      	        System.out.println(number);
	                  }
	   }
	          }}}
