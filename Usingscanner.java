package day1;
import java.util.Scanner;
public class Usingscanner {
	public static void main(String[]args) {
		Scanner  a = new Scanner(System.in);
		 System.out.println("enter the tamil mark :");
		int tamil = a.nextInt();
		System.out.println("enter the english mark :");
		int english = a.nextInt();
		System.out.println("enter the mathsmark :");
		int maths = a.nextInt();
		System.out.println("enter the science mark :");
		int science = a.nextInt();
		System.out.println("enter the social mark :");
		int social = a.nextInt();
		System.out.println("average :" +(tamil+english+maths+science+social)/5);
	}

}


