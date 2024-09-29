import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to MentorMarkers Corp Portal!");
        System.out.println("Please, enter your employee info belowN");

        // recopilar nombre y apellido de usuario
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        // solicita la edad
        int age = ageValidation(scanner);

        // solicita numero de empleado
        int employeeNumber = employeeIdValidation(scanner);

        // crear el registro del empleado
        EmployeeRecord employee = new EmployeeRecord(firstName, lastName, age, employeeNumber);

        // muestra la información del empleado
        employee.showEmployeeDetails();

        scanner.close();
    }

    // Método para validar la edad
    private static int ageValidation(Scanner scanner) {
        int age = -1;
        while (true) {
            System.out.print("Enter Age (0-100): ");
            try {
                age = Integer.parseInt(scanner.nextLine()); // lee y convierete la entrada a entero
                if (age >= 0 && age <= 100) {
                    break; // salir del bucle si la edad es válida
                } else {
                    System.out.println("Invalid input. Please enter an age between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number."); //en caso de que usuario ingrese un espacio o letra
            }
        }
        return age;
    }

    // Método para validar el número de empleado
    private static int employeeIdValidation(Scanner scanner) {
        int employeeNumber = -1; //
        while (true) {
            System.out.print("Enter Employee Number (27560000 - 27569999): ");
            try {
                employeeNumber = Integer.parseInt(scanner.nextLine());
                if (employeeNumber >= 27560000 && employeeNumber <= 27569999) {
                    break; //sale del bucle si es esta dentro del rango
                } else {
                    System.out.println("Invalid Employee Number. Please enter a number between 27560000 and 27569999.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return employeeNumber;
    }
}
