
public class EmployeeTest{
    public static void main(String[] args){

        //instantiating an object of Employee class 
        Employee testEmployee = new Employee("Tony", "Shifflett", 5000);
        
        //verifying getters work as expected
        System.out.println(testEmployee.displayFirstName());
        System.out.println(testEmployee.displayLastName());
        System.out.println(testEmployee.displaySalary()); 

        //testing setters
        testEmployee.setFirstName("Charles"); 
        testEmployee.setLastName("Bryant"); 
        testEmployee.setSalary(6000);

        //verifying results of getter tests
        System.out.println(testEmployee.displayFirstName());
        System.out.println(testEmployee.displayLastName());
        System.out.println(testEmployee.displaySalary()); 

        //testing salary getter with invalid number 
        testEmployee.setSalary(-4000);
        System.out.println(testEmployee.displaySalary()); 

        

    }
}

