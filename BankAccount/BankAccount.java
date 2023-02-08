
public class BankAccount {
    private double checkBalance;
    private double savingsBalance;

    private static int numberOf = 0;
    private static double totals = 0.0;

    // public BankAccount() {
    // this.checkBalance = 2.0;
    // this.savingsBalance = 3.0;

    // }

    // public BankAccount(double savingsBalance) {
    // this.savingsBalance = savingsBalance;

    // }
    // Default constructor
    public BankAccount(double checkBalance, double savingsBalance) {
        this.checkBalance = checkBalance;
        this.savingsBalance = savingsBalance;
        numberOf++;

    }
    // mutator constructor

    public void depositC(double checking) {
        checkBalance += checking;

    }

    public void depositS(double savings) {
        savingsBalance += savings;
    }

    public void withdraw(double amount) {

        if (checkBalance < amount) {
            System.out.printf("Insufficient funds current balance is: $%s ", checkBalance);
        } else {
            checkBalance -= amount;
        }
    }

    public double getSingleBalance() {
        return checkBalance;
    }

    public void getTotBalance() {
        double accountBalance = this.checkBalance + this.savingsBalance;
        totals += accountBalance;
    }

    public double getBalance() {
        return totals;
    }
    // public static void AccountsTotal() {

    // }
    // Total balance of every account
    public static void getTotalBalance() {
        System.out.println("The total of balance of every account is: $" + totals);
    }

    // Number of total accounts
    public static void getNumOfAccounts() {
        System.out.println("The number of acccounts is " + numberOf);
    }

    public double getCheckBalance() {
        return this.checkBalance;
    }

    public void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // public static void Accounts(ArrayList<String> accounts, boolean isCorrect) {
    // System.out.println("Hello, please enter your Information..");
    // String bAccount = System.console().readLine();
    // String newAccount = new String(bAccount);
    // if (isCorrect) {
    // System.out.printf("\n Success! Found: %s", newAccount);
    // }
    // accounts.add(newAccount);
    // }
    public String addAccounts(String accounts) {
        System.out.println("\n Please type either option \n checkings \n savings ");
        String account = System.console().readLine();
        String newAccount = new String(account);
        if (newAccount.indexOf("checkings") > -1) {
            System.out.printf("Your Checkings Balance is: $%s", checkBalance);
        }
        if (newAccount.indexOf("savings") > -1) {
            System.out.printf("Your Savings Balance is: $%s", savingsBalance);
        }
        return "Is this really your account";
    }
}

// public String reactToResponse(String choice) {
// String bAccount = System.console().readLine();
// String newAccount = new String(bAccount);

// if (choice.indexOf("checkings") > -1) {
// return checkBalance;
// }
// return "Is this really your account?";
// }