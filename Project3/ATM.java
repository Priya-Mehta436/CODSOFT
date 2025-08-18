package Project3;
import java.util.Scanner;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("          ATM  MENU           ");
            System.out.println("==============================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("==============================");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n Checking your balance...");
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("\n Enter amount to deposit: Rs. ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("\n Enter amount to withdraw: Rs. ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
