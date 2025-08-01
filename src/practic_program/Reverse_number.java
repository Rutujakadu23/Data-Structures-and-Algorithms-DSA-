package practic_program;

public class Reverse_number {

	public static void main(String[] args) {
		int num=12334533,reversed=0;
		
		while(num!=0) {
			int digit= num%10;
			
			reversed=reversed*10+digit;
			num/=10;
		}
		
		System.out.println("Reversed number"+reversed);
		
		
		}
		

	}
