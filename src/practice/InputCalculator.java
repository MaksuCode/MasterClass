package practice;

import java.util.Scanner;

public class InputCalculator {

        public static void inputThenPrintSumAndAverage() {

            Scanner scanner = new Scanner(System.in) ;
            int sum = 0 ;
            int count = 0 ;
            double avg = 0 ;

            while (true) {
                boolean isAnInt = scanner.hasNextInt();
                if (isAnInt) {
                    sum += scanner.nextInt() ;
                    count++ ;
                }else{
                    break;
                }
                scanner.nextLine();
            }
            avg = Math.round((double) (sum / count)) ;
            System.out.println("SUM = " + sum + " AVG = " + (long)avg);
        }

}




