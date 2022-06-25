//********************************************************************
//
//  Author:        Charles Shifflett
//
//  Program #:     2
//
//  File Name:     <Program1.java>
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      6/11/2022
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter #2
//
//  Description:   This program calculates and displays the various costs 
//                 associated with a restaurant bill.   
//********************************************************************

public class Program2
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
       // variable declarations
       double mealCost = 44.50; 
       double taxPercentage = .0825;
       double tipPercentage = .15;
       double billTotal; 
       double tipAmount;
       double taxAmount; 

       

       developerInfo();
       //calculate various costs
       tipAmount = mealCost*tipPercentage;
       taxAmount = mealCost*taxPercentage;
       billTotal = mealCost+tipAmount+tipPercentage;
       



       System.out.printf("Meal cost           = $%,.2f%n", mealCost);
       System.out.printf("Total Tip           = $%,.2f%n", tipAmount);
       System.out.printf("Total Tax           = $%,.2f%n", taxAmount);
       System.out.printf("Bill Total          = $%,.2f%n", billTotal);
       
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
       System.out.println("Program: 2 \n");

    } // End of the developerInfo method
}