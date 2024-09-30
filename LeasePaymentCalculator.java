import java.util.Scanner;

public class LeasePaymentCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the Lease Payment Calculator");

        // entradas del usuario con validacion
        double totalLeaseAmount = getValidDouble(scanner, "Please enter the total lease amount: ");
        double initialPayment = getValidDouble(scanner, "Enter the initial down payment: ", totalLeaseAmount);
        int leaseDurationMonths = getValidInt(scanner, "For how many months will the lease be paid? (Lease duration in months): ");
        double annualInterestRate = getValidDoubleInRange(scanner, "Enter the interest rate in percentage (0 - 100): ", 0, 100);

        // calculo en base a equacion proporcionada en enunciado
        double financedAmount = totalLeaseAmount - initialPayment;
        double totalWithInterest = financedAmount + (financedAmount * (annualInterestRate / 100));
        double monthlyLeasePayment = totalWithInterest / leaseDurationMonths;

        // verificar si monthly payment es mayor a financed amount
        if (monthlyLeasePayment > financedAmount) {
            System.out.println("Error: The monthly payment cannot exceed the financed amount. Please check your inputs.");
        } else {
            // Output result
            System.out.printf("The monthly lease payment is: %.2f\n", monthlyLeasePayment);
        }

        System.out.println("bye");
    }

    // metodo para validar que el numero ingresado sea positivo
    public static double getValidDouble(Scanner scanner, String prompt) {
        double value;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            value = scanner.nextDouble();
            if (value < 0) {
                System.out.println("The value cannot be negative. Please try again.");
            }
        } while (value < 0);
        return value;
    }

    // metodo para validar que el down payment sea menor o igual al total leased amount
    public static double getValidDouble(Scanner scanner, String prompt, double maxValue) {
        double value;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.print("Please enter a valid number: ");
                scanner.next(); // Discard invalid input
            }
            value = scanner.nextDouble();
            if (value < 0 || value > maxValue) {
                System.out.println("The down payment cannot be greater than the total lease amount or negative. Please try again.");
            }
        } while (value < 0 || value > maxValue);
        return value;
    }

    // metodo para validar que el numero de meses sea un numero positivo
    public static int getValidInt(Scanner scanner, String prompt) {
        int value;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            value = scanner.nextInt();
            if (value <= 0) {
                System.out.println("The number of months must be greater than 0. Please try again.");
            }
        } while (value <= 0);
        return value;
    }

    // metodo para validar que el interest rate este dentro de un rango valido
    public static double getValidDoubleInRange(Scanner scanner, String prompt, double min, double max) {
        double value;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            value = scanner.nextDouble();
            if (value < min || value > max) {
                System.out.println("The interest rate must be between " + min + " and " + max + "%. Please try again.");
            }
        } while (value < min || value > max);
        return value;
    }
}
