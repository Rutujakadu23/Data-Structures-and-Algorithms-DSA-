package practic_program;         // For Odd Numbers

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number to check if it is prime");
		
	int num = s.nextInt();
		
	boolean isPrime = true;
		
		if(num<=1) {
		isPrime = false;	
		}else {
		for(int i=2; i<=num / 2; i++) {
				
			if(num % i==0) {
					
				isPrime = false;
					
				}
			}
		}
		
		
		if(isPrime) {
			System.out.println(num +  " is a prime number.");
		
		}else {
			System.out.println(num+  "  is not prime number");
		
		
		}
		
		
		
		
		s.close();
		
		
		
		
		
		
		

	}

}
