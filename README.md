# Java Fundamentals - Homework - Task 1
A simple Java-based system for collecting employee information and creating email addresses depending on the employee's name. The application takes user input for employee first name, last name, age, and employee number and validates it.


## Project Structure
- **codecanvas/**:          Main project folder
  - **.idea/**:             IDE configuration files (e.g., for IntelliJ IDEA)
  - **.out/**:              Output directory 
  - **EmployeeRecord.java**: Java class for handling employee records
  - **Main.java**:         Main class with the entry point of the application
  - **README.md**:         Documentation


## Instructions to Run the Program
1. Make sure you have the Java Development Kit (JDK) installed on your PC. To check this, run: `java -version` on your terminal. (If JDK is not installed, download it from the official Oracle website or AdoptOpenJDK.)
2. Open Terminal/Command Prompt: Locate the project files by navigating the directory.
3. Compile both Main.java and EmployeeRecord.java using the following command: `javac Main.java EmployeeRecord.java`
4. After compilation, run the program using: `java Main`
5. User Interaction: The program will ask you to enter employee information such as first and last names, ages, and employee numbers. Follow the onscreen instructions.

## Additional Information

### Functionality
The program takes employee information, creates an email address using the first and last names, and displays the entire employee record.

### Error Handling
The application validates:
- **Age**: 
  - Must be between 0 and 100.
  - Must not contain spaces or letters.
- **Employee Number**: 
  - Must be between 27560000 and 27569999.
  - Must not contain spaces or letters.

### Future Improvements
- Consider adding a **front end** to enhance user interaction.
- Create a **database** to store employee records for better data management and retrieval.

### Dependencies
There are no external requirements to operate this project. It solely needs core Java libraries.





