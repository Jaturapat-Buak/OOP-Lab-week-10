public class Main1 {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        Account acct1 = new Account(5000, "Sommai");
        Account acct2 = new Account(3000, "Somchai");
        Account acct3 = new Account(900, "Somsri");

        myBank.addAccount(acct1);
        myBank.addAccount(acct2);
        myBank.addAccount(acct3);

        System.out.println("Number of Accounts: " + myBank.getNumAccount());

        System.out.println("\n=== Deposit & Withdraw Transactions ===");
        
        System.out.println("Depositing 1,000 to Sommai...");
        myBank.getAccount(0).deposit(1000);

        System.out.println("Withdrawing 500 from Somchai...");
        myBank.getAccount(1).withdraw(500);

        System.out.println("Withdrawing 1,500 from Somsri (Should fail if insufficient balance)...");
        myBank.getAccount(2).withdraw(1500);

        System.out.println("\n=== All Account Details ===");
        for (int i = 0; i < myBank.getNumAccount(); i++) {
            myBank.getAccount(i).showAccount();
        }
    }
}
