package ExceptionHandling;

// UNChecked : agar error hai apne mention kiya hai, but apne use handle nhi kiya hai, NO BACKUP!
// Checked : backup ready hai, agar nhi hai to error batayga
class BankAccount2 {

	int accNo;
	double balance;
	
	BankAccount2(int accNo, double balance){
		this.accNo = accNo;
		this.balance = balance;		
	}
	
//	return type of throw is *throws* Exception
	double withdraw(double amount) throws Exception{
		
		if(amount > balance) {
			Exception e = new Exception("Insufficient Balance!");
			throw e;
		}
		else {
			balance -= amount;
			return balance;
		}		
	}
}
public class BankAccount{
		
		public static void main(String args[]) {
			BankAccount2 bankAcc = new BankAccount2(1001, 5000);
			try {
//				Checked Exception: These are the exceptions that are checked at compile time
				double balance = bankAcc.withdraw(3000);
				System.out.println("Balance Left: " + balance);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("Khatam..Tata...Byebyee");
			}
			
//			Unchecked Exception: These are the exceptions that are not checked at compile time.
//			In C++, all exceptions are unchecked, so it is not forced by the compiler to either 
////			handle or specify the exception.
//			int i = Integer.parseInt("SKD");
		}
		
	}
