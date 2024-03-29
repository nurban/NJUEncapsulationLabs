package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "Peter";
        employee.lastName = "Piper";
        employee.ssn = "333-1234";
        
        //Calls Day method in class Employee -- this method encapsulates the other helper methods
        //by calling them, in the order that they are needed to occur.
        employee.Day();
        
        //Statement which prints out the employee's status by calling the getStatus method
        //from the Employee class.
        System.out.println("The employee's status is: " + employee.getStatus());
    }      
    
}
