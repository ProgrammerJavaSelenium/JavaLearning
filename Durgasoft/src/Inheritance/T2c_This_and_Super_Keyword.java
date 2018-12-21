package Inheritance;
//---------------------------------------------------------------------------------
//Description:::::::
//2b, Basic Example for using "This" and "Super" Keyword to avoid the ambiguity arised 
//  while using "Same" variables for a.local, b.Current and c.Super (Parent) class
//---------------------------------------------------------------------------------
class A_2c                  // Parent Class or Super Class
{
	int a=10;
	int b=20;
}

class B_2c extends A_2c	 // Child Class  and it is inheriting Parent class A_2a
{
	int a=100;          
	int b=200;
	
	void addmethod(int a, int b)
	{

		System.out.println(a+b);              //a Local Variables (Inside the method - "addmethod")
		
		System.out.println(this.a+this.b);	  //b Current Class (Class B_2c) variables
														//- Important - we are directly accessing the "variables"
					  									// of current class using the "this" keyword
		System.out.println(super.a+super.b);  //c Super Class (Class A_2c) Variables 
														//- Important - we are directly accessing the "variables"
										  				// of Parent class using the "super" keyword
	}	
	
	public static void main(String[] args)
	{
		B_2c b_2c=new B_2c();				
		b_2c.addmethod(1000,2000);      //- Important - we are directly accessing the method 
										// of same class
	}
}
