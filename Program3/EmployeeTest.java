
public class EmployeeTest{
    public static void main(String[] args){
        //create two employee objects with info provided in prompt
        Employee firstEmployee = new Employee ("John", "Doe", 2875.00);
        Employee secondEmployee = new Employee ("Jane", "Doe", 3150.75);

        //display employee info
        System.out.printf("%s %s earns $%,.2f per month%n", firstEmployee.displayFirstName(), 
        firstEmployee.displayLastName(),firstEmployee.displaySalary());

        System.out.printf("%s %s earns $%,.2f per month%n", secondEmployee.displayFirstName(), 
        secondEmployee.displayLastName(),secondEmployee.displaySalary());

        //additional print statement to improve legibility wihtout modifying previous statements, which may create an issue if additional test cases are added later
        System.out.println("");

        //raise the salary of each employee by 20%
        firstEmployee.setSalary(firstEmployee.displaySalary()*1.20);
        secondEmployee.setSalary(secondEmployee.displaySalary()*1.20);

        //display results of the raise
        System.out.printf("%s %s earns $%,.2f per month following a 20%% raise %n", firstEmployee.displayFirstName(), firstEmployee.displayLastName(),firstEmployee.displaySalary());

        System.out.printf("%s %s earns $%,.2f per month following a 20%% raise %n", secondEmployee.displayFirstName(), secondEmployee.displayLastName(),secondEmployee.displaySalary());

    }
}

