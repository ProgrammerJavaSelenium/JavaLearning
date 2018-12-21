package Constructor;

public class T4_Class_with_aParamCon_and_without_bZeroargCon_withoutMethod 
{
	
//  Removing Method	
//		void m1()
//		{
//			System.out.println("m1 method");
//		}
		
//  Removing User Defined Zero arg Constructor 1
//		T3_Class_with_UserDefinedConstructor_with_NoMethod()
//		{
//			System.out.println("0 -arg constructor");
//		}
		
		//User Defined Param Constructor 2
	   T4_Class_with_aParamCon_and_without_bZeroargCon_withoutMethod(int a)
		{
			System.out.println("1 -arg constructor");
		}
		
		//Main Method
		public static void main(String[] args)
		{
			T4_Class_with_aParamCon_and_without_bZeroargCon_withoutMethod Obj1=new T4_Class_with_aParamCon_and_without_bZeroargCon_withoutMethod();
			T4_Class_with_aParamCon_and_without_bZeroargCon_withoutMethod Obj2=new T4_Class_with_aParamCon_and_without_bZeroargCon_withoutMethod(10);
			
//			Obj1.m1();
//			Obj2.m1();			
		}
		
	}

//********************************************************************************
//Output:
//	Error
//********************************************************************************

