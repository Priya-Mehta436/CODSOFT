package Project3;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("         WELCOME TO JAVA ATM          ");
        System.out.println("======================================");

        BankAccount userAccount = new BankAccount(2000.00); 

        ATM atm = new ATM(userAccount);
        atm.start();

        System.out.println("======================================");
        System.out.println("    Thank you for using Java ATM!     ");
        System.out.println("======================================");
    }
}
