package day1;

public class Findaverage {
	public static void main(String[]args) {
	Average m1= new Average();
	m1.name = "Natraj";
	System.out.println("Student Name :"+m1.name);
	m1.rollnumber = 901821;
	System.out.println("Student roll number :"+m1.rollnumber);
	m1.marks =75;
	System.out.println("Tamil :"+m1.marks);
	m1.marks = 65;
	System.out.println("English :"+m1.marks);
	m1.marks = 74;
	System.out.println("maths :"+m1.marks);
	m1.marks = 56;
	System.out.println("physics :"+m1.marks);
	m1.marks = 85;
	System.out.println("chemistry :"+m1.marks);
	m1.marks = 89;
	System.out.println("biology :"+m1.marks);
	
	System.out.println("TOTAL   :"+(m1.marks+m1.marks+m1.marks+m1.marks+m1.marks+m1.marks));
	System.out.println("AVERAGE :"+(m1.marks+m1.marks+m1.marks+m1.marks+m1.marks+m1.marks)/6);
	
	
	
	
	}
	}
