import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 103.00;
        double rate = 0.03;
        int year = 1;
        int choice;
        do {
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes\n or any other number for no >> ");
            choice = input.nextInt();
            if (choice == 1) {
                year++;
                balance = balance + (balance * rate);
                System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n%n",
                                  year, rate, balance);
            }
        } while (choice == 1);
    }
}
