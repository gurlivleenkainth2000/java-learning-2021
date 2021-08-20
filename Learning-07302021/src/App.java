import java.util.Scanner;

class Transaction {
	int transactionAmount;
	int month;
	int dues;
	int totalAmounts;
	int interest;
	
	Transaction() {}

	Transaction(int transactionAmount, int month, int interest) {
		System.out.println();
		this.transactionAmount = transactionAmount;
		this.month = month;
		this.interest = interest;
		totalAmounts = transactionAmount + ( transactionAmount * interest / 100) ;
		dues = totalAmounts;
	}
	
	int calculatePeriod(int fixedAmount) {
		System.out.println("Transaction Amount: " + transactionAmount);
		System.out.println("Total Amount: " + totalAmounts);
		System.out.println("Total Dues: " + dues);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		while (dues > 0) {
			month++;
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Month: " + month);
//			Scanner scan = new Scanner(System.in);
//			if(month > 1) {
//			    System.out.println("You want to do new transaction (Y or N): ");
//			    System.out.println();
//			    String newTransaction = scan.nextLine();
//			    System.out.println(newTransaction);
//			    if(newTransaction.equals("Y") || newTransaction.equals("y")) {                  
//			        System.out.println("Enter Transaction Amount: ");
//			        transactionAmount = scan.nextInt();
//			        System.out.println(transactionAmount + " Amount Transacted ");
//			        totalAmounts = transactionAmount + ( transactionAmount * interest / 100) ;
//			        dues += totalAmounts;    
//			    }
//			}
//
//			scan.close();
			if(dues >= fixedAmount) {
				System.out.println("Amount Pay: " + fixedAmount);
				dues -= fixedAmount;
			} else {
				System.out.println("Amount Pay: " + dues);
				dues -= dues;
			}
			
			System.out.println("Remaining Dues: " + dues);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
		}
		
		return month;
	}

	@Override
	public String toString() {
		return "Transaction [transactionAmount=" + transactionAmount + ", month=" + month + ", due=" + dues
				+ ", totalAmounts=" + totalAmounts + ", interest=" + interest + "]";
	}
	
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Transaction Amount: ");
		int transactionAmount = scanner.nextInt();
		
		System.out.println("Enter Interest Rate: ");
		int interest = scanner.nextInt();
		
		System.out.println("Enter Fixed Payable Amount: ");
		int fixedAmount = scanner.nextInt();
		scanner.close();
		
		Transaction transaction = new Transaction(transactionAmount, 0, interest);
		
		int totalMonth = transaction.calculatePeriod(fixedAmount);
		
		System.out.println("In " + totalMonth + " month dues will be 0");
		
	}

}

