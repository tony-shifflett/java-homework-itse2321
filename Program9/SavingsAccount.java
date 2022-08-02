

class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double balance){
        savingsBalance = balance;
    }

    private void calculateMonthlyInterest (){
        double monthlyInterest = savingsBalance * annualInterestRate;
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


    public static void main (String [] args) {
        System.out.println("So far so good");
    }
}