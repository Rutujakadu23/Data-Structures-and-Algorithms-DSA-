package practic_program;

public class Check_vowel {

	public static void main(String[] args) {
		String s="Hello World";
		boolean Vowel= s.toLowerCase().matches(".*[aeiou].*");
		
		if (Vowel) {
			System.out.println("The string contain vowels.");
		}else {
			System.out.println("no vowals in the string");
		}
		

	}

}
