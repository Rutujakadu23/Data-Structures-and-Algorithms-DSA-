package opps_concept;

public interface Interface1 {
	
	// All variables are
	public static final int A=5;
	static final int B=5;
    final int c=10;
    int D=10;
	
	// In Interface Ther are two methods 1)abstract method
                                        //2)Default & static method
	//All methods 
	public abstract void m1();
	void m5() ;
		//All methods are of type....without body
	// put public abstract void m1();
	// or put only abstract void m1();
	// or put only void m1();

	abstract void m2();
	void m3();
	
	default void m4() { //if we want body then only default method is used//
		//everyone will get only one default copy
		System.out.println("default");
	}
	
	static void m6() {
	// static method share in child interfaces
	}
}
