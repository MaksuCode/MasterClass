package practice;

import java.util.List;

public class NumberToWords {

    public static void numberToWords (int number) {
        if(number < 0) {
            System.out.println("Invalid value");
        }
        int reversedNumber = reverse(number) ;
        int difference = getDigitCount(number) - getDigitCount(reversedNumber) ;
        while (reversedNumber > 0) {
            int digit = reversedNumber % 10 ;
            System.out.println(digitToString(digit));
            reversedNumber /= 10 ;
        }
        while (difference > 0) {
            System.out.println(digitToString(0));
            difference-- ;
        }
    }

    private static String digitToString(int digit){
        String digitString = null;
        switch (digit){
            case 0 :
                digitString = "ZERO" ;
                break;
            case 1 :
                digitString = "ONE" ;
                break;
            case 2 :
                digitString = "TWO" ;
                break;
            case 3 :
                digitString = "THREE" ;
                break;
            case 4 :
                digitString = "FOUR" ;
                break;
            case 5 :
                digitString = "FIVE" ;
                break;
            case 6 :
                digitString = "SIX" ;
                break;
            case 7 :
                digitString = "SEVEN" ;
                break;
            case 8 :
                digitString = "EIGHT" ;
                break;
            case 9 :
                digitString = "NINE" ;
                break;
            default:
                break;

        }
        return digitString ;
    }


    public static int getDigitCount(int number) {
        return Numbers.getEachDigit(number).size();

    }

    public static int reverse (int number){
        List<Integer> digits = Numbers.getEachDigit(number) ;
        number = 0 ;
        for (int i = 0; i < digits.size() ; i++) {
            number += (digits.get(i) * Math.pow(10,digits.size()-i)) ;
        }
        return number/10 ;
    }


}
