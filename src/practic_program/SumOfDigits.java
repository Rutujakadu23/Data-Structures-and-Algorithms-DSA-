package practic_program;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		
		while(num!=0) {
			sum+=num%10;
			num/=10;
			
		}
System.out.println("sum of digits:"+sum);
	}

}
