package Interface;

public interface ATM  //Interface
{
void ShowBalance();
void Withdraw();
}

class HDFCATM implements ATM  //HDFC ATM class
{
	 public void ShowBalance()
	{
		System.out.println("HDFC-ShowBalance");
	}
	public void Withdraw()
	{
		System.out.println("HDFC-Withdraw");
	}
}

class ICICIATM implements ATM  //ICICI ATM class
{
	public void ShowBalance()
	{
		System.out.println("ICICI-ShowBalance");
	}
	public void Withdraw()
	{
		System.out.println("ICICI-Withdraw");
	}
}

class ATMExecution    //ATM execution class  
					 // Query 1: Here without extending the class we are creating the object for another class??
					 // Query 2: If i add "public" then it is showing error
{
	public static void main(String[] args)
	{
		ICICIATM obj_ICICI=new ICICIATM();
		HDFCATM obj_HDFC=new HDFCATM();
		
		obj_ICICI.ShowBalance();
		obj_HDFC.Withdraw();	
	}

}




