package practice;

public class DigitSumChallenge {

    public static int sumDigits (int number) {
        if (number < 10) {
            return -1 ;
        }

        int sum = 0 ;
        while (number > 0) {
            int digit = number % 10 ; //extract the least significant digit.
            sum += digit ;
            number /= 10 ;            //drop the least significant digit.
        }
        return sum;
    }

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {  //TODO : bugfix 10
            return -1 ;
        }
        int lastDigit = number % 10 ;
        if (number > 10) {
            number = number/10 ;
        }
        while (number > 10) {
            number /= 10 ;
        }
        int firsDigit = number ;
        return firsDigit  + lastDigit ;
    }
}
