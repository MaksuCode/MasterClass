package practice;

public class ReverseArrayChallenge {

    public static void reverse(int[] array) {
        int temp ;
        for (int i = 0 ; i < array.length/2 ; i++) {
            temp = array[i] ;
            array[i] = array[array.length-(i+1)] ;
            array[array.length-(i+1)] = temp ;
        }
    }
}



