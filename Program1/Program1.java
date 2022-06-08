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
	   double numTwiceMonth = amount/24;
       double numBiWeekly = amount/26;
       String twiceMonth;
       String biWeekly;

       developerInfo();
    
       // Enter more statements here to make
	   // the program work as expected

       DecimalFormat payFormatter = new DecimalFormat("##,###.##");

       twiceMonth = "$" + payFormatter.format(numTwiceMonth);
       biWeekly = "$" + payFormatter.format(numBiWeekly);

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
       System.out.println("Program: One \n");

    } // End of the developerInfo method
}
