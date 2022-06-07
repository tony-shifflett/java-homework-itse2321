//********************************************************************
//
//  Author:        <Your name>
//
//  Program #:     <Programming Assignment Number>
//
//  File Name:     <Program1.java>
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      <Due Date>
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       <Chapter #>
//
//  Description:   <An explanation of what the program is designed to do>
//
//********************************************************************

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
	   
       developerInfo();
    
       // Enter more statements here to make
	   // the program work as expected
    
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
       System.out.println("Name:    <Put your full name here>");
       System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
       System.out.println("Program: One \n");

    } // End of the developerInfo method
}
