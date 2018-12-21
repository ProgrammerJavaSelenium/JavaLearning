package Constructor;

public class T3_Class_with_UserDefinedConstructor_with_NoMethod 
{
	
//  Removing Method	
//		void m1()
//		{
//			System.out.println("m1 method");
//		}
		
		//User Defined Constructor 1
		T3_Class_with_UserDefinedConstructor_with_NoMethod()
		{
			System.out.println("0 -arg constructor");
		}
		
		//User Defined Constructor 2
		T3_Class_with_UserDefinedConstructor_with_NoMethod(int a)
		{
			System.out.println("1 -arg constructor");
		}
		
		//Main Method
		public static void main(String[] args)
		{
			T2_Class_with_Parameterized_Constructor Obj1=new T2_Class_with_Parameterized_Constructor();
			T2_Class_with_Parameterized_Constructor Obj2=new T2_Class_with_Parameterized_Constructor(10);
			
//			Obj1.m1();
//			Obj2.m1();			
		}
		
	}

//********************************************************************************
//Output:
//	0 -arg constructor
//	1 -arg constructor
//********************************************************************************

