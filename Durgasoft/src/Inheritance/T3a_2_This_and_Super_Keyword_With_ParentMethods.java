//b, This and Super keyword with Parent Method

package Inheritance;

class Parent_T3a_2
{
	void m1() { System.out.println("Parent M1 method"); }  //m1 method of Parent class
}

class Child_T3a_2
{
	void m1() 
	{ 	System.out.println("Child M1 method"); }  //m1 method of Child class
//	void m2()   									      //m2 method of Child class
//	{ 
//		m1();
//	}
	public static void main(String[] args)
	{	
		
		Child_T3a_2 t=new Child_T3a_2();
		t.m1();
	}
}

