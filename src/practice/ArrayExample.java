package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {


    private static Scanner scanner = new Scanner(System.in) ;
    int[] baseData = new int[10] ;

    public static int[] arrayScanner(){
        int[] myIntegers = getIntegers(5) ;
        for (int i = 0 ; i < myIntegers.length ; i++) {
            System.out.println("Element " + i + " typed as : " + myIntegers[i]);
        }
        System.out.println("Average of the typed values : " +avgOfValuesInsideArray(myIntegers));
        return myIntegers ;
    }

    private static double avgOfValuesInsideArray(int[] array) {
        int sum = 0 ;
        for (int i = 0 ; i < array.length ; i++){
            sum += array[i] ;
        }
        return (double) sum/ (double) (array.length) ;
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number] ;
        for (int i = 0 ; i < values.length ; i++) {
            values[i] = scanner.nextInt() ;
        }
        return values ;
    }

    public static void printArray(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }


    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length] ;
//        for (int i = 0 ; i < array.length ; i++) {
//            sortedArray[i] = array[i] ;
//        }
        int[] sortedArray = Arrays.copyOf(array , array.length) ;
        boolean flag = true ;
        int temp ;
        while (flag) {
            flag = false ;
            for (int i = 0 ; i < sortedArray.length-1 ; i++){
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i] ;
                    sortedArray[i] = sortedArray[i+1] ;
                    sortedArray[i+1] = temp ;
                    flag = true ;
                }
            }
        }
        return sortedArray ;
    }


    public  void getInput() {
        for (int i = 0 ; i < baseData.length ; i++) {
            baseData[i] = scanner.nextInt() ;
        }
    }

    public static void resizeArray(int[] array , int plusSize) {
        int[] original = array ;
        array = new int[array.length+plusSize] ;
        for (int i = 0 ; i < original.length ; i++) {
            array[i] = original[i] ;
        }
    }

















}
