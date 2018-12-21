package Inheritance;
//---------------------------------------------------------------------------------
//Description:::::::
//2a, Basic Example for explaining there is no need for "This" and "Super" Keyword 
//    while using "UNIQUE" variables for a.local, b.Current and c.Super (Parent) class
//---------------------------------------------------------------------------------
class A_2a                   // Parent Class or Super Class
{
	int a=10;
	int b=20;
}

class B_2a extends A_2a		 // Child Class  and it is inheriting Parent class A_2a
{
	int x=100;          
	int y=200;
	
	void addmethod(int i, int j)
	{
		System.out.println(i+j);      //a Local Variables (Inside the method - "addmethod")
		System.out.println(x+y);	  //b Current Class (Class B_2a) variables
		System.out.println(a+b);      //c Super Class (Class A_2a) Variables 
		                                  //- Important - we are directly accessing the "variables"
										  // of Parent class
	}	
	
	public static void main(String[] args)
	{
		B_2a b_2a=new B_2a();				
		b_2a.addmethod(1000,2000);      //- Important - we are directly accessing the method 
										// of same class
	}
}
