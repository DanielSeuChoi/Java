
/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("START");
        // System.err.println(args[0]);
        BankAccount account = new BankAccount(5, 25);
        BankAccount account2 = new BankAccount(10, 70);
        BankAccount account3 = new BankAccount(15, 60);
        BankAccount account4 = new BankAccount(20, 50);
        // System.out.println(BankAccount.numberOf);
        System.out.println("\n----------Number of Total Accounts----------");
        BankAccount.getNumOfAccounts();
        account.getTotBalance();
        account2.getTotBalance();
        account3.getTotBalance();
        account4.getTotBalance();
        // Get balance in checking account for each
        System.out.println("\n----------Checkings Account----------");
        System.out.printf("Balance for checking account: $%s %n", account.getCheckBalance());
        System.out.printf("Balance for checking account2: $%s %n", account2.getCheckBalance());
        System.out.printf("Balance for checking account3: $%s %n", account3.getCheckBalance());
        System.out.printf("Balance for checking account4: $%s %n", account4.getCheckBalance());
        // Get balance in savings account for each
        System.out.println("\n----------Savings Account----------");
        System.out.printf("Balance for checking account: $%s %n", account.getSavingsBalance());
        System.out.printf("Balance for checking account2: $%s %n", account2.getSavingsBalance());
        System.out.printf("Balance for checking account3: $%s %n", account3.getSavingsBalance());
        System.out.printf("Balance for checking account4: $%s %n", account4.getSavingsBalance());
        System.out.println("\n----------Total Balance of every account----------");
        BankAccount.getTotalBalance();

        System.out.println("\n----------Deposits Account----------");
        account.depositC(10);
        account.depositS(10);
        account.withdraw(10);
        // System.out.printf("New balance is: $%s", account.getSingleBalance());

        // ArrayList<String> acc = new ArrayList<String>();
        String acc = new String();
        account.addAccounts(acc);
        // System.out.println(account2.getSavingsBalance());

        // System.out.println("------ Welcome -------- \n\n");
        // ArrayList<String> currentAccount = new ArrayList<String>();
        // account.Accounts(currentAccount, true);
        // System.out
        // .println(
        // "\n---Type one of the following---- \n checkings:checkings balance \n
        // savings:savings balance");
        // System.out.println("FINISH");
    }
}