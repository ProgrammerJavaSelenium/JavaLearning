package Constructor;

public class T1_Class_with_NoConstructor_DefaultConstructor 
{
	void m1()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args)
	{
		T1_Class_with_NoConstructor_DefaultConstructor t=new T1_Class_with_NoConstructor_DefaultConstructor();
		t.m1();
	}
	
	/*Default Constructor - It is created by Compiler while compiling and 
	 * 						executed by JVM at run time when no User defined constructor 
	 * 						is not defined in Class
	 * 					  - Here there will be No Return types 
	 * 
	 * Test()
	 * {
	 * 		Empty Implementation
	 * }
	 */
}
