package practice;

public class NumberPalindrome {

    public static boolean isPalindrome (int number){
        int reverse = 0 ;
        int numberComparison = number ;
        if (number > 0 ){
            while (number > 0) {
            int lastDigit = number % 10 ;
            reverse = reverse * 10 ;
            reverse += lastDigit ;
            number /=10 ;
        }
        }else {
            number = number * -1 ;
            while (number > 0) {
                int lastDigit = number % 10 ;
                reverse = reverse * 10 ;
                reverse += lastDigit ;
                number /=10 ;
            }
            reverse = reverse * - 1 ;
        }

        if (reverse == numberComparison) {
            return true ;
        }else {
            return false ;
        }
    }
}
