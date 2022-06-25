//********************************************************************
//
//  Author:        Charles Shifflett
//
//  Program #:     Program 5
//
//  File Name:     Program5.java
//
//  Course:        ITSE 2321 Object-Oriented Programming - Java 
//
//  Due Date:      6/25/2022
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter 6
//
//  Description:   Orientation Program
//
//********************************************************************

//scanner
import java.util.Scanner; 

public class Program5
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
        int numFloors; 
        int numRooms = 0; 
        int occupiedRooms = 0; 
        double percentOccupied; 
        Scanner floorNumScanner =  new Scanner(System.in);
        
        System.out.print("How many floors are there?: "); 
        numFloors = floorNumScanner.nextInt(); 

        for (int i = 0; i < numFloors; i++){
            System.out.printf("How many rooms are there on Floor %d: ", i+1);
            numRooms += floorNumScanner.nextInt(); 
            System.out.print("How many of those rooms are occupied?: ");
            occupiedRooms += floorNumScanner.nextInt(); 
            System.out.println("");
        }
        //calculate percentage of rooms that are occupied
        percentOccupied = (occupiedRooms * 100)/ numRooms; 

	    developerInfo();
        if (percentOccupied % 1 == 0){
            System.out.printf("%.0f%% of the hotel rooms are occupied.%n%n", percentOccupied); 
        }else{
            System.out.printf(" %.1f%% of the hotel rooms are occupied.%n%n", percentOccupied);
        }
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
       System.out.println("Program: Five \n");

    } // End of the developerInfo method
}