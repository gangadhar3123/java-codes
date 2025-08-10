import java.util.Scanner;

public class SimpleBankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();

        System.out.print("Enter Initial Balance: ₹");
        double balance = sc.nextDouble();

        // Display menu once
        System.out.println("\n--- Banking Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Loan");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
        System.out.print("Choose an option (1–5): ");
        int choice = sc.nextInt();

        // Handle one operation
        switch (choice) {
            case 1:
                // Deposit
                System.out.print("Enter amount to deposit: ₹");
                double depositAmt = sc.nextDouble();
                if (depositAmt > 0) {
                    balance += depositAmt;
                    System.out.println("₹" + depositAmt + " deposited successfully.");
                    System.out.println("Updated Balance: ₹" + balance);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;

            case 2:
                // Withdraw
                System.out.print("Enter amount to withdraw: ₹");
                double withdrawAmt = sc.nextDouble();
                if (withdrawAmt > 0 && withdrawAmt <= balance) {
                    balance -= withdrawAmt;
                    System.out.println("₹" + withdrawAmt + " withdrawn successfully.");
                    System.out.println("Remaining Balance: ₹" + balance);
                } else {
                    System.out.println("Invalid amount or insufficient balance.");
                }
                break;

            case 3:
                // Loan
                System.out.print("Enter loan amount: ₹");
                double loanAmt = sc.nextDouble();
                System.out.print("Enter duration (in years): ");
                int years = sc.nextInt();

                if (loanAmt > 0 && years > 0) {
                    double interestRate = 9.5;
                    double interest = (loanAmt * interestRate * years) / 100;
                    double totalRepay = loanAmt + interest;

                    // Add loan to balance
                    balance += loanAmt;

                    System.out.println("Loan approved for ₹" + loanAmt);
                    System.out.println("Interest: ₹" + interest);
                    System.out.println("Total repayment amount: ₹" + totalRepay);
                    System.out.println("Loan credited. Updated Balance: ₹" + balance);
                } else {
                    System.out.println("Invalid loan amount or duration.");
                }
                break;

            case 4:
                // Check balance
                System.out.println("Account Holder: " + name);
                System.out.println("Account No: " + accNo);
                System.out.println("Current Balance: ₹" + balance);
                break;

            case 5:
                // Exit
                System.out.println("Thank you, " + name + ". Goodbye!");
                break;

            default:
                System.out.println("Invalid option. Please select between 1 and 5.");
        }

        sc.close();
    }
}
