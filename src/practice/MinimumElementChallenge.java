package practice;

import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in) ;

    public static int[] readIntegers(int count) {
        System.out.println("Please enter " +count+ " numbers.");
        int[] array = new int[count] ;
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array ;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE ;
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] < min) {
                min = array[i] ;
            }
        }
        return min ;
    }


}
