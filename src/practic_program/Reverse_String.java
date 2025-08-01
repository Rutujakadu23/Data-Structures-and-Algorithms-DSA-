package practic_program;

public class Reverse_String {

	public static void main(String[] args) {
		String s="Rutuja Kadu";
		String reversed= new StringBuilder(s).reverse().toString();
		System.out.println("Reversed string:"+ reversed);

	}

}
