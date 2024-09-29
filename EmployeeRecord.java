//clase que representa el registro de empleados con sus atributos
public class EmployeeRecord {
    private String firstName;
    private String lastName;
    private int age;
    private int employeeId;
    private String email;

    // constructor que inicializa los atributos del empleado
    public EmployeeRecord(String firstName, String lastName, int age, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employeeId = employeeId;
        this.email = generateEmail();
    }

    //metodo que genera el correo institucional con nombre y apellido
    private String generateEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@mentormakers.com";
    }

    //metodo para imprimir info del empleado
    public void showEmployeeDetails() {
        System.out.println("Employee Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Employee Number: " + employeeId);
        System.out.println("Email: " + email);
    }
}
