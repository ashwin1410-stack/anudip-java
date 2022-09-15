public class PrimeNumber {
	
	static void primeNumber()
	{
		for (int i=1;i<=20;i++)
		{
			int j=2;
			if (j<=20)
			{				
				if (i%j!=0)
					System.out.println(i);			   
			}			
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("The prime number are:");
		primeNumber();         
	}
}

