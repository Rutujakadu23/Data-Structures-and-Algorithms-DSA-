package practic_program;

public class Digits_InWords {

	public static void main(String[] args) {
		
		int num=24569;
		String[]words= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String number=Integer.toString(num);
		
         for(char digit:number.toCharArray()) {
        	 
        	 System.out.println(words[digit - '0']+"");
         }
	}

}
