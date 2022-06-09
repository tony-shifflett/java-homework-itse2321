//********************************************************************
//
//  Author:        Charles Shifflett
//
//  Program #:     3
//
//  File Name:     EmployeeTest.java
//
//  Course:        ITSE 2321 Object-Oriented Programming - Java 
//
//  Due Date:      6/17/2022
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter 2
//
//  Description:   Employee class and paired test implementation displaying
//                 class methods and attributes
//********************************************************************

public class EmployeeTest{
    public static void main(String[] args){
        //create two employee objects with info provided in prompt
        Employee firstEmployee = new Employee ("John", "Doe", 2875.00);
        Employee secondEmployee = new Employee ("Jane", "Doe", 3150.75);

        //call developer info as required in each assignment
        developerInfo();

        //display employee info
        System.out.printf("%s %s earns $%,.2f per month%n", firstEmployee.displayFirstName(), 
        firstEmployee.displayLastName(),firstEmployee.displaySalary());

        System.out.printf("%s %s earns $%,.2f per month%n", secondEmployee.displayFirstName(), 
        secondEmployee.displayLastName(),secondEmployee.displaySalary());

        //additional print statement to improve legibility wihtout modifying previous statements, which may create an issue if additional test cases are added later
        System.out.println("");

        //raise the salary of each employee by 20%
        firstEmployee.setSalary(firstEmployee.displaySalary()*1.20);
        secondEmployee.setSalary(secondEmployee.displaySalary()*1.20);

        //display results of the raise
        System.out.printf("%s %s earns $%,.2f per month following a 20%% raise %n", firstEmployee.displayFirstName(), firstEmployee.displayLastName(),firstEmployee.displaySalary());

        System.out.printf("%s %s earns $%,.2f per month following a 20%% raise %n", secondEmployee.displayFirstName(), secondEmployee.displayLastName(),secondEmployee.displaySalary());

    }

    //***************************************************************
    //
    //  Method:       developerInfo
    // 
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A 
    //
    //**************************************************************
    public static void developerInfo()
    {
       System.out.println("Name:    Charles Shifflett");
       System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
       System.out.println("Program: Three \n");

    } // End of the developerInfo method
}