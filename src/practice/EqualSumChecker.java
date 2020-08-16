package practice;

public class EqualSumChecker {

    public static boolean hasEqualSum(int first , int second , int third){

        int sum = first + second ;
        if (sum == third){
            return true ;
        }else {
            return false ;
        }
    }

    public static boolean hasTeen(int firstValue , int secondValue , int thirdValue ){
        if (isTeen(firstValue) || isTeen(secondValue) || isTeen(thirdValue)){
            return true ;
        }else {
            return false ;
        }
    }

    private static boolean isTeen(int number){
        if (number > 12 && number <20){
            return true ;
        }else{
            return false ;
        }
    }
}
