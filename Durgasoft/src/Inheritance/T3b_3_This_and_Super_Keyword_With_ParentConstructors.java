//c, This and Super keyword with Parent Method

package Inheritance;

class Parent_T3b_3                        //Class 1 (Parent Class)
{
	Parent_T3b_3()  //0 - arg Constructor
	{
		System.out.println("Parent 0-arg Constructor");
	}
}

class Child_T3b_3 extends Parent_T3b_3             //Class 2 extending Class 1 i.e, Child Class
{
	Child_T3b_3() //0 - arg Constructor
	{
		this(10);   //Calling the current class -  0 arg Constructor
		System.out.println("Child 0-arg Constructor");
	}
	Child_T3b_3(int a) //1 - arg Constructor
	{
		super();   //Calling the Parent class - 0 arg Constructor
		System.out.println("Child 1-arg Constructor");
	}
	public static void main(String[] args)  //Main Method 
	{
		new Child_T3b_3();
	}
}
//
//*****************************************
/*output:
	Parent 0-arg Constructor
	Child 1-arg Constructor
	Child 0-arg Constructor*/
//
//*****************************************	

