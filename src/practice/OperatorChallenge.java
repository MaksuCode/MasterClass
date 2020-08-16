package practice;

public class OperatorChallenge {

    public Boolean checkIfRemainderExists(double firstVarible, double secondVariable, double multiplyBy, double divideBy) {

        double sumOfVariables = firstVarible + secondVariable;
        double result = sumOfVariables * multiplyBy;
        double remainder = result % divideBy;
        boolean doesRemainderExists = (remainder == 0) ? true : false;
        if (doesRemainderExists) {
            System.out.println("The result is without a remainder");
        } else {
            System.out.println("The result is with a remainder which is : " + remainder);
        }
        return true;
    }


}
