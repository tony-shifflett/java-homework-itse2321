//********************************************************************
//
//  Author:        Charles Shifflett
//
//  Program #:     3
//
//  File Name:     Employee.java
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

public class Employee {
    //class attributes
    private String firstName;
    private String lastName;
    private double monthlySalary; 

    //constructor
    public Employee (String first, String last, double pay){
        this.firstName = first; 
        this.lastName = last;
        this.monthlySalary = pay; 
    }

    //getters
    public String displayFirstName(){
        return firstName; 
    }
    public String displayLastName(){
        return lastName;
    }
    public double displaySalary(){
        return monthlySalary;
    }

    //setters
    public void setFirstName (String first){
        this.firstName = first; 
    }
    public void setLastName (String last){
        this.lastName = last;
    }
    public void setSalary(double pay){
        if (pay >= 0){
            this.monthlySalary = pay; 
        }
    }
}