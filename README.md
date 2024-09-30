# Java Fundamentals - Homework - Task 2
A simple Java-based app that calculates monthly lease payments based on input values such as total lease amount, down payment, lease duration, and interest rate.


## Project Structure
- **codecanvas/**:          Main project folder
  - **.idea/**:             IDE configuration files (e.g., for IntelliJ IDEA)
  - **.out/**:              Output directory 
  - **LeasePaymentCalculator.java**:         Main class with the entry point of the application
  - **README.md**:         Documentation


## Instructions to Run the Program
1. Make sure you have the Java Development Kit (JDK) installed on your PC. To check this, run: `java -version` on your terminal. (If JDK is not installed, download it from the official Oracle website or AdoptOpenJDK.)
2. Run the LeasePaymentCalculator.java file in your IDE.
3. Follow the prompts to enter the total lease amount, down payment, lease duration, and interest rate. The application will calculate and display the monthly lease payment.

## Additional Information

### How It Works
The program calculates the monthly lease payment using the following formula:

Monthly Payment = ((Total Lease Amount - Down Payment) + ((Total Lease Amount - Down Payment) * (Interest Rate / 100))) / Lease Duration

### Input Validation
The application includes input validation to ensure:

  -The total lease amount and down payment are valid numbers and not negative.
  
  -The down payment does not exceed the total lease amount.
  
  -The lease duration is a positive integer.
  
  -The interest rate is between 0% and 100%.
  
  -If invalid input is detected, the application prompts the user to enter the correct values.

### Future Improvements

-User Interface: Develop a graphical user interface (GUI) for better usability.

-Advanced Calculations: Support varying interest rates and multiple payment schedules.

-Export Functionality: Allow users to export calculations to PDF or CSV.

### Dependencies
There are no external requirements to operate this project. It solely needs core Java libraries.



