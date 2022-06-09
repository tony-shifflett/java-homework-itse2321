
public class EmployeeTest{
    public static void main(String[] args){

        //instantiating an object of Employee class 
        Employee testEmployee = new Employee("Tony", "Shifflett", 5000);
        
        //verifying getters work as expected
        System.out.println(testEmployee.displayFirstName());
        System.out.println(testEmployee.displayLastName());
        System.out.println(testEmployee.displaySalary()); 

    }
}

