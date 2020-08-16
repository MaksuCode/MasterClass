package practice;

public class Interest {

    public static double calculateInterest (double amount , double interestRate){
        double interestAmount = amount * (interestRate/100) ;
        System.out.println(amount + " at " + interestRate + "% interest = " + interestAmount);
        return interestAmount ;
    }
}
