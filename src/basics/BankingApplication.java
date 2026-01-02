package basics;

/* BankingApplication
 * Use of meaningful variable names, constants, comments, and logical code organization
 * purpose: Calculate interest and manage bank account operations.
 */


public class BankingApplication {
    private static final double ANNUAL_INTEREST_RATE = 0.04; //4% annual interest
    private static final int MINIMUM_BALANCE = 100; // Minimum account balance
    private static final int MAXIMUM_WITHDRAWAL = 2000; // Daily withdrawal limit.
    private static final String BANK_NAME = "Bank of the Philippine Islands";

    // == INSTANCE VARIABLES ==
    private String accountHolderName;
    private long accountNumber;
    private double accountBalance;
    private int monthlyWithdrawals;

    /*
     * Constructor to initialize a bank account.
     *
     * @param name = the name of the account holder
     * @param initialBalance = the starting balance (must be > 100)
     * @param accountNum A unique account identifier
     */

    public BankingApplication(String name, double initialBalance, long accountNumber) {
        this.accountHolderName = name;
        this.accountBalance = initialBalance;
        this.accountNumber = accountNumber;
        this.monthlyWithdrawals = 0;

        /* Calculates and adds annual interest to the account.
         * Formula: Interest = Balance * Rate * Time (years)
         *
         * @return the amount of interest added.
         */

    }

    //==== MAIN METHOD - Program's entry point ====
    public static void main(String[] args) {

        //Create bank account with initial balance.
        BankingApplication account = new BankingApplication("AC Parrilla", 1500.00, 123456789L);
        account.displayAccountSummary();
        System.out.println("--Performing transactions");
        account.depositMoney(500);
        account.withdrawMoney(300);
        account.withdrawMoney(1800); //Exceeds limit
        account.withdrawMoney(1200); //Will be below minimum

        //Apply interest

        double interest = account.applyAnnualInterest();
        System.out.println("\nInterest Applied: $" + String.format("%.2f", interest));

        //Display final state
        account.displayAccountSummary();
    }

    public double applyAnnualInterest() {
        double interestAmount = accountBalance * ANNUAL_INTEREST_RATE;
        accountBalance += interestAmount;
        return interestAmount;
    }

    /*
     * Attempts to withdraw money from the account.
     * Validates against minimum balance and daily limits.
     *
     * @param withdrawalAmount The amount to withdraw
     * @return true if withdrawal was successful, false otherwise
     */
    public boolean withdrawMoney(double withdrawalAmount) {
        //Check if withdrawal exceeds daily limit
        if (withdrawalAmount > MAXIMUM_WITHDRAWAL) {
            System.out.println("ERROR: Withdrawal exceeds daily limit of $" + MAXIMUM_WITHDRAWAL);
            return false;
        }
        double balanceAfterWithdrawal = accountBalance - withdrawalAmount;

        //Check if balance would fall below minimum.
        if (balanceAfterWithdrawal < MINIMUM_BALANCE) {
            System.out.println("ERROR: Insufficient funds. Minimum balance must be " + MINIMUM_BALANCE);
            return false;
        }
        //Perform the withdrawal
        accountBalance = balanceAfterWithdrawal;
        monthlyWithdrawals++;
        System.out.println("SUCCESS: Widthdrew $" + withdrawalAmount + ". New balance: $" + accountBalance);
        return true;
    }

    /*
     * Deposits money into the account.
     *
     * @param depositAmount = the amount to deposit (must be positive (!))
     * @return true if deposit is successful, otherwise return false.
     */
    public boolean depositMoney(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("ERROR: Deposit amount must be positive!");
            return false;
        }
        accountBalance += depositAmount;
        System.out.println("SUCCESS: Deposited $" + depositAmount + ". New balance: $" + accountBalance);
        return true;
    }

    /*
     * Displays summary of account information.
     */
    public void displayAccountSummary() {
        System.out.println("\n====ACCOUNT SUMMARY====");
        System.out.println("Bank: " + BANK_NAME);
        System.out.println("Account holder: " + accountHolderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current balance: $" + String.format("%.2f", accountBalance));
        System.out.println("Monthly withdrawals: " + monthlyWithdrawals);
        System.out.println("Interest rate: " + ANNUAL_INTEREST_RATE * 100 + "%");
        System.out.println("====================\n");


    }
}