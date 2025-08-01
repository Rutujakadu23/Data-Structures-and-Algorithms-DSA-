package practic_program;

public class Find_prime {
public static void main(String[] args) {
	
	int num=27;
	boolean isPrime=true;
	
	for (int i=2;i<=num/2;++i) {
		if(num%i==0) {
			isPrime=false;
		}
	}
	if(isPrime) {
		System.out.println(num + "is a prime number.");
	}else
		System.out.println(num + "is not prime numbe");
}
}
