package practic_program;

public class Fibonacci_series {

	public static void main(String[] args) {
		int n=50;
		int first=0, second=1;
		System.out.println("Fibonacci_series:"+first+","+second);

		
		for(int i=2;i<n;++i) {
			int next=first + second;
			
			System.out.print(","+next);
			first=second;
			second=next;
		}
	}

}
