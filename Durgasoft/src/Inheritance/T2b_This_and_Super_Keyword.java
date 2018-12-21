package Inheritance;
//---------------------------------------------------------------------------------
//Description:::::::
//2b, Basic Example for explaining there is need for "This" and "Super" Keyword 
//  while using "Same" variables for a.local, b.Current and c.Super (Parent) class
//---------------------------------------------------------------------------------
class A_2b                   // Parent Class or Super Class
{
	int a=10;
	int b=20;
}

class B_2b extends A_2b	 // Child Class  and it is inheriting Parent class A_2a
{
	int a=100;          
	int b=200;
	
	void addmethod(int a, int b)
	{		
		System.out.println(a+b);      //a Local Variables (Inside the method - "addmethod")
		System.out.println(a+b);	  //b Current Class (Class B_2b) variables
		System.out.println(a+b);      //c Super Class (Class A_2b) Variables 
	                                 
	}	
	
	public static void main(String[] args)
	{
		B_2b b_2b=new B_2b();				
		b_2b.addmethod(1000,2000);      //- Important - we are directly accessing the method 
										// of same class
	}
}
