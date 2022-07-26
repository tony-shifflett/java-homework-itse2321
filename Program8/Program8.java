//********************************************************************
//
//  Author:        Charles Shifflett
//
//  Program #:     Program 8
//
//  File Name:     Program8.java
//
//  Course:        ITSE 2321 Object-Oriented Programming - Java 
//
//  Due Date:      7/18/2022
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter 
//
//  Description:   Multiplication Program
//
//********************************************************************

//scanner
import java.util.Scanner; 
import java.util.Random;

public class Program8
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
	private static Random classEightRandom = new Random();
    private static int x;
    private static int y;
    private static int answer;
    private static int numCorrectGuesses = 0;
    private static boolean keepGoing = true;
    
    public static void main(String[] args)
    {

        developerInfo();
        displayProblem();
        System.out.println(answer);

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
       System.out.println("Program: Eight \n");

    } // End of the developerInfo method

    // Assignment Functions
    
    //Multiplication Problem Functions
    private static void displayProblem(){
        x = classEightRandom.nextInt(10);
        y = classEightRandom.nextInt(10);
        answer = x * y;
        System.out.printf("How much is %d times %d?%n", x, y);
    }
}
