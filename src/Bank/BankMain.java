package Bank;

public class BankMain {



	public static void main(String[] args) {
				 
			BankA A = new BankA();
			A.getBalance(1000);
			
			BankB B=new BankB ();
			((Bank) B).getBalance(1500);
			
			BankC C=new BankC ();
			C.getBalance(2000);
			}
		

	}



