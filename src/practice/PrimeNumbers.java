package practice;

public class PrimeNumbers {

    public static boolean isPrime (int n){

        if (n == 1) {
            return false ;
        }

        for (int i = 2 ; i <= (long) Math.sqrt(n) ; i++){  //TODO : Understand why n/2 is used for!  (long) Math.sqrt(n)
//            System.out.println("Looping " + i);
            if (n % i == 0){
                return false ;
            }
        }
        return true ;
    }

    public static void countOfPrimeNumbers (int lowerRangeValue , int upperRangeValue , int limit){
        if (lowerRangeValue < 0 || upperRangeValue < 0){
            System.out.println("Both range values can not be negative!");
        }else if (lowerRangeValue > upperRangeValue){
            System.out.println("Lower range value can't be bigger than upper range value!");
        }else{
            int count =0 ;
            for (int i = lowerRangeValue; i <= upperRangeValue ; i++){
                if (isPrime(i)){
                    count++ ;
                    System.out.println(i);
                }
                if (count == limit){
                    System.out.println("Reached the limit... (" + limit + ")");
                    break;
                }
            }
        }
    }

    public static void countOfPrimeNumbers (int lowerRangeValue , int upperRangeValue){
        int count = 0 ;
        if (lowerRangeValue < 0 || upperRangeValue < 0){
            System.out.println("Both range values can not be negative!");
        }else if (lowerRangeValue > upperRangeValue){
            System.out.println("Lower range value can't be bigger than upper range value!");
        }else{

            for (int i = lowerRangeValue; i <= upperRangeValue ; i++){
                if (isPrime(i)){
                    count++ ;
                    System.out.println(i);
                }
            }
            System.out.println("There are " + count + " prime numbers within the given range.");
        }
    }

    public static int justCountOfPrimeNumbers(int lowerRangeValue , int upperRangeValue){
        int count = 0 ;
        if (lowerRangeValue < 0 || upperRangeValue < 0){
            System.out.println("Both range values can not be negative!");
        }else if (lowerRangeValue > upperRangeValue){
            System.out.println("Lower range value can't be bigger than upper range value!");
        }else{
            for (int i = lowerRangeValue; i <= upperRangeValue ; i++){
                if (isPrime(i)){
                    count++ ;
                }
            }
        }
        return count ;
    }
}
