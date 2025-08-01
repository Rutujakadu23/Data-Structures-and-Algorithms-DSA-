package practic_program;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		
	System.out.println("Before swapping: a="+a+",b="+b);
	
	a=a+b;   //a 5=10+5  a=15
	b=a-b;   //b 10=5-10 b=5
	a=a-b;    //a 5=15-5  a=10

	System.out.println("After swapping: a="+a+",b="+b);
	
	}

}
