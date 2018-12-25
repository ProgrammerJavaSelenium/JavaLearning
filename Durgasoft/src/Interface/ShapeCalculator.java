package Interface;

interface ShapeCalculator 
{
	void calculateArea();
}

class Rectangleshape implements ShapeCalculator
{
	public void calculateArea()
	{
		System.out.println("Rectangle Area");
	}
}
class Circleshape implements ShapeCalculator
{
	public void calculateArea()
	{
		System.out.println("Circle Area");
	}
}

class PlaywithCalculator
{
	ShapeCalculator SC;
	
	PlaywithCalculator(ShapeCalculator SC)
	{
		this.SC=SC;
		SC.calculateArea();
	}
}

class MainClass1
{
	public static void main(String[] args)
	{
		Rectangleshape Rec=new Rectangleshape();
		Circleshape Cir=new Circleshape();
		
		PlaywithCalculator Pwc1=new PlaywithCalculator(Rec);
		PlaywithCalculator Pwc2=new PlaywithCalculator(Cir); 
		//Sysout
	}
}


















