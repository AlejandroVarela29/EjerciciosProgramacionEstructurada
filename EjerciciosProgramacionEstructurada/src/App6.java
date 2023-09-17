import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the customer's account number.
        System.out.print("Enter the customer's account number: ");
        int accountNumber = input.nextInt();
        // Get the customer's account type.
        System.out.print("Enter the customer's account type (s or S for savings, c or C for checking): ");
        char accountType = input.next().charAt(0);
        // Get the customer's minimum balance.
        System.out.print("Enter the customer's minimum balance: ");
        double minimumBalance = input.nextDouble();
        // Get the customer's current balance.
        System.out.print("Enter the customer's current balance: ");
        double currentBalance = input.nextDouble();
        // Calculate the new balance.
        double newBalance = currentBalance;
        if (currentBalance < minimumBalance) {
            if (accountType == 's' || accountType == 'S') {
                newBalance -= 10;
            } else if (accountType == 'c' || accountType == 'C') {
                newBalance -= 25;
            }
        } else {
            if (accountType == 's' || accountType == 'S') {
                newBalance += currentBalance * 0.04;
            } else if (accountType == 'c' || accountType == 'C') {
                if (currentBalance <= 5000 + minimumBalance) {
                    newBalance += currentBalance * 0.03;
                } else {
                    newBalance += currentBalance * 0.05;
                }
            }
        }
        // Print the customer's information.
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("New Balance: " + newBalance);
    }
}