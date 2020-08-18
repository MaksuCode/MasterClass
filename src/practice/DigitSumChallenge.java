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
        int sum = 0;
        int lastDigit ;
        if (number < 0) {
            return -1 ;
        }else if (number < 10){
            sum = number * 2 ;
        }else {
            lastDigit = number % 10 ;
            while (number >= 10) {
                number /= 10 ;
            }
            sum = number + lastDigit ;
        }
        return sum ;
    }

    public static int getEvenDigitSum (int number) {
        int sum = 0 ;
        int digit = 0 ;
        if (number < 0) {
            return -1 ;
        }
        while (number > 0) {
            digit = number % 10 ;
            if (digit % 2 == 0) {
                sum = sum + digit ;
            }
            number /= 10 ;
        }
        return sum ;
    }
}
