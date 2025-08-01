package practic_program;

public class Constructor {
	
	int num1;
	int num2;
	int result;  // instance variable
	
	
	public Constructor()     //Default constructor                  // Constructor has same name as class name.
	{                                            // constructor never return anything
		num1=5;
		num2=5;
		System.out.println("in constructor");
	}
	
	public Constructor(int n)   //Parameterised 
	{
		num1=n;
		num2=n;
		
	}
	
	public Constructor(double d, int n)
	{
		num1=(int)d;
		num2=n;
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor(9.5,8) ;      // Constructor
	                                            // Every time you create a object it will call the constructor//
           System.out.println(obj.num1);            // Constructor only allocate the memory.
		
	
	
		
	}}


