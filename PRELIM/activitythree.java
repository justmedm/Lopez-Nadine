import java.util.Scanner;

public class ActivityThreeLopez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("=================================");
        System.out.println("Menu:");
        System.out.println("C1 = PHP 100.00");
        System.out.println("C2 = PHP 150.00");
        System.out.println("C3 = PHP 200.00");
        System.out.println("=================================");
        System.out.println("Add-ons:");
        System.out.println("R4 = PHP 35.00");
        System.out.println("R5 = PHP 50.00");
        System.out.println("=================================");

       
        System.out.print("Enter the quantity of C1: ");
        int c1Quantity = scanner.nextInt();
        total += c1Quantity * 100.00;

        System.out.print("Enter the quantity of C2: ");
        int c2Quantity = scanner.nextInt();
        total += c2Quantity * 150.00;

        System.out.print("Enter the quantity of C3: ");
        int c3Quantity = scanner.nextInt();
        total += c3Quantity * 200.00;

        System.out.print("Enter the quantity of R1: ");
        int r1Quantity = scanner.nextInt();
        total += r1Quantity * 35.00;

        System.out.print("Enter the quantity of R2: ");
        int r2Quantity = scanner.nextInt();
        total += r2Quantity * 50.00;
        
        double exchangeRate = 0.018;
        double totalInDollars = total * exchangeRate;
   
        System.out.println("=================================");
        System.out.println("Total Price: PHP " + total);
        System.out.println("Total Price (USD): $" + totalInDollars);
        int totalQuantity = c1Quantity + c2Quantity + c3Quantity + r1Quantity + r2Quantity;
        System.out.println("Total Quantity: " + totalQuantity);
    }
}
