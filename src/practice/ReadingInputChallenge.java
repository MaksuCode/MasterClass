package practice;

import java.util.Scanner;

public class ReadingInputChallenge {

    public static void readInputValues(){
        int sum = 0;
        int count = 0 ;
        Scanner scanner = new Scanner(System.in) ;
        while (true) {
            int order = count +1 ;
            System.out.println("Please enter number #" +order + " :");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                count ++ ;
                if (count == 10) {
                    break;
                }
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();  // handle end of line (enter key)
        }
        scanner.close();
        System.out.println("Sum of the numbers = " + sum);
    }

    public static void printMaxAndMinNumbers() {
        Scanner scanner = new Scanner(System.in) ;
        int minNumber = 0;
        int maxNumber = 0;
        boolean isFirstValue = true ;

        while (true) {
            System.out.println("Enter number ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (isFirstValue){
                    maxNumber = number ;
                    minNumber = number ;
                    isFirstValue = false ;
                }
                if (number > maxNumber) {
                    maxNumber = number ;
                }else if (number < minNumber) {
                    minNumber = number ;
                }
            }else {
                break;
            }
        scanner.nextLine() ;
        }
        System.out.println("Min number : " + minNumber + " , Max number : " + maxNumber);
        scanner.close();
    }
}
