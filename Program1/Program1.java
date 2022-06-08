//********************************************************************
//
//  Author:        Charles Shifflett
//
//  Program #:     1
//
//  File Name:     <Program1.java>
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      6/7/2022
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter #1
//
//  Description:   This program calculates and displays the gross pay
//                 of an employee over two different pay periods  
//********************************************************************

//import to allow use of DecimalFormat
import java.text.*; 

public class Program1
{
    //***************************************************************
    //
    //  Method:       main
    // 
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A 
    //
    //**************************************************************
	public static void main(String[] args)
    {
       // declare variables here
	   double amount = 32500.00;
       String twiceMonth;
       String biWeekly;

       developerInfo();
    
       // Enter more statements here to make
	   // the program work as expected
       
       //I wasn't sure about formatting the numbers, as it wasn't mentioned in 
       //the assignment instructions. I read the comment above this to indicate
       //that I should add statements rather than modify existing ones, so instead
       //of using printf, I used the DecimalFormat class as described in the Java 
       //documentation found here: https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html

       DecimalFormat payFormatter = new DecimalFormat("$##,###.##");

       twiceMonth = payFormatter.format(amount/24);
       biWeekly = payFormatter.format(amount/26);

       System.out.println("Annual Salary           = " + amount);
       System.out.println("When paid twice a month = " + twiceMonth);
       System.out.println("When paid bi-weekly     = " + biWeekly);

    } // End of the main method
	
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
       System.out.println("Program: 1 \n");

    } // End of the developerInfo method
}
