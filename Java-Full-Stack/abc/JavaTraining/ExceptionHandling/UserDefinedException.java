package ExceptionHandling;

class BankAccount32{
	int accNo;
	double balance;
	
	public BankAccount32(int accNo, double balance){
		this.accNo = accNo;
		this.balance = balance;		
	}
	
//  AccountException is user defined
	double withdraw(double amount) throws AccountException{
		
		if(amount > balance) {
			AccountException e = new AccountException("Insufficient Balance!");
			throw e;
		}
		else {
			balance -= amount;
			return balance;
		}		
	}
}
class AccountException extends Exception {
	AccountException(String msg){
		super(msg);
	}
}
public class UserDefinedException{
		
		public static void main(String args[]) throws Exception {
			BankAccount2 bankAcc = new BankAccount2(1001, 5000);
			try {

				double balance = bankAcc.withdraw(6000);
				System.out.println("Balance Left: " + balance);
			}
			catch(AccountException e) {
				System.out.println(e.getMessage());
			}		
			
		}
		
	}
