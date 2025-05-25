import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter usage type (1 for Domestic, 2 for Commercial): ");
        int usageType = sc.nextInt();

        if (usageType != 1 && usageType != 2) {
            System.out.println("Invalid usage type");
            return;
        }

        System.out.print("Enter Customer Number: ");
        int customerNumber = sc.nextInt();

        System.out.print("Enter number of units consumed: ");
        int units = sc.nextInt();

        System.out.print("Enter number of days to deposit the bill: ");
        int days = sc.nextInt();

        double rate = 0;

        if (usageType == 1) { // Domestic
            if (units >= 300) rate = 3.5;
            else if (units >= 100) rate = 2.5;
            else rate = 1.5;
        } else { // Commercial
            if (units >= 300) rate = 5.0;
            else if (units >= 100) rate = 3.5;
            else rate = 2.0;
        }

        double billAmount = units * rate;
        if (days > 10) billAmount += 50; // Late fee

        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Total Bill: Rs. " + billAmount);
    }
}
