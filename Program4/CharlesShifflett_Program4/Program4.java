//********************************************************************
//
//  Author:        Charles Shifflett
//
//  Program #:     4
//
//  File Name:     <Program1.java>
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      6/21/2022
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter #5
//
//  Description:   This program calculates and displays employee pay
//                 information based on user input
//********************************************************************

//import the scanner class to get user input
import java.util.Scanner;
class Program4
{ 

    public static void main (String [] args){

        //variable declarations
        int employeeId; 
        double hourlyPay; 
        double hoursWorked; 
        double grossPay;
        double netPay;
        double overTimeHours;
        double regularHours; 
        double regularPayEarned;
        double overTimePayEarned; 
        double deductions; 
        double incomeTax;
        double  parkingCharge = 30.0;
        Scanner employeeInfoScanner = new Scanner(System.in);

        System.out.print("Enter employee id: "); 
        employeeId = employeeInfoScanner.nextInt();

        System.out.print("Enter the hourly rate of pay: "); 
        hourlyPay = employeeInfoScanner.nextDouble();

        System.out.print("Enter the number of hours worked: "); 
        hoursWorked = employeeInfoScanner.nextDouble();

        //calculate value of other variables
        overTimeHours = (hoursWorked > 40) ? (hoursWorked - 40) : 0; 
        regularHours = hoursWorked - overTimeHours; 
        overTimePayEarned = overTimeHours * (hourlyPay * 1.50); 
        regularPayEarned = regularHours * hourlyPay;
        grossPay = hourlyPay * hoursWorked + overTimePayEarned; 
        incomeTax = (grossPay > 600) ? (.125 * grossPay) : 0; 
        deductions = incomeTax + parkingCharge; 
        netPay = grossPay - deductions; 

        //create space between input and output
        System.out.println("");
        //call developerInfo per requirement
        developerInfo();

        //display results
        System.out.println("Program 4\n");
        System.out.printf("ID Number:           %d%n", employeeId);
        System.out.printf("Pay Rate:            %.2f%n", hourlyPay);
        System.out.printf("Regular Hours:       %.2f%n", regularHours);
        System.out.printf("Overtime Hours:      %.2f%n", overTimeHours);
        System.out.printf("Total Hours:         %.2f%n", hoursWorked);
        System.out.printf("Regular Pay:         %.2f%n", regularPayEarned);
        System.out.printf("Overtime Pay:        %.2f%n", overTimePayEarned);
        System.out.printf("Gross Pay:           %.2f%n", grossPay);
        System.out.printf("Tax:                 %.2f%n", incomeTax);
        System.out.printf("Deductions:          %.2f%n", deductions);
        System.out.printf("Net Pay              %.2f%n", netPay);


        
        

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
       System.out.println("Program: 4 \n");

    } // End of the developerInfo method

}
