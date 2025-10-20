import java.util.Scanner;
    public class Payroll {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("How many hours did you work this week? ");
            double hrs = input.nextDouble();
    
            System.out.print("What is your regular pay rate? ");
            double rate = input.nextDouble();
            
            Employee emp = new Employee(123, rate);
            
             double reg = emp.getRegularPay(hrs);
            double ot = emp.getOvertimePay(hrs);

            System.out.println("Regular pay is " + reg);
            System.out.println("Overtime pay is " + ot);
    }
}
