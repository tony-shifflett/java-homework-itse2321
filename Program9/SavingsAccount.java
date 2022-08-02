

class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double balance){
        savingsBalance = balance;
    }

    private void calculateMonthlyInterest (){
        double monthlyInterest = savingsBalance * (annualInterestRate/12);
    }

    private void depositAmount(double deposit){
        savingsBalance += deposit;
    }

    private void withdrawAmount(double withdrawal){
        savingsBalance -= withdrawal;

    }


    private static void modifyInterestRate(float newRate){
        annualInterestRate = newRate;
    }

    //test code
    public void displayBalance(){
        System.out.println(savingsBalance);
    }

}