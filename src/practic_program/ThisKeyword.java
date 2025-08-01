package practic_program;

public class ThisKeyword {
	
	int num1;
	int num2;                       // num1, num2, result, are instance variable
	int result;

	public ThisKeyword(int num1, int num2)            // number1, number2 are local variable
	{
	this.num1=num1;  //this represent the current object                        // this num1 is belongs to the object created in ThisKeywordTest class by using 
	this.num2=num2;                                  //"new" keyword.
//instance variable  = Local variables		
		                                            //if i created Two objects which having Two instances num1 and num2
		                                            // then num1 is for first object and num2 is for second object
	}                                              // num1   =  number1;     num1 & num2 belongs to an object
	                                              //  num2   =  number2;     number1 & number2 are local variables.
	                                      
	
               
	                                            // local Variables always shadow instance variable
}



//this.num1 is specifying that the variable that num1 and num2
// are not local....they are instance variable

// when you have the same local variable name and instance variable name
// use this.abc keyword
// this.abc is use for instance variable