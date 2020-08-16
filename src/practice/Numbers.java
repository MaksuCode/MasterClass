package practice;

public class Numbers {

    public void checkNumber (int number){
        if (number > 0) System.out.println("Positive");
        if (number == 0) System.out.println("Zero");
        if (number < 0) System.out.println("Negative");
    }


    public static void printEqual(int first , int second , int third){
        if (first < 0 || second < 0 || third <0){
            System.out.println("Invalid Value");
        }else if (first == second && second == third) {
            System.out.println("All numbers are equal");
        }else if (first != second  &&  second != third && first != third){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void printNumberInWord (int number){

        switch (number)  {
            case 0 :
                System.out.println("ZERO");
                break;
            case 1 :
                System.out.println("ONE");
                break;
            case 2 :
                System.out.println("TWO");
                break;
            case 3 :
                System.out.println("THREE");
                break;
            case 4 :
                System.out.println("FOUR");
                break;
            case 5 :
                System.out.println("FIVE");
                break;
            case 6 :
                System.out.println("SIX");
                break;
            case 7 :
                System.out.println("SEVEN");
                break;
            case 8 :
                System.out.println("EIGHT");
                break;
            case 9 :
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static void sumChallenge(int lowerRangeValue , int upperRangeValue) {
        int sum = 0;
        int count = 0 ;
        if (lowerRangeValue < 0 || upperRangeValue < 0){
            System.out.println("Both range values can not be negative!");
        }else if (lowerRangeValue > upperRangeValue){
            System.out.println("Lower range value can't be bigger than upper range value!");
        }else{
            for (int i = lowerRangeValue ; i <= upperRangeValue ; i++){
                if (checkIfTheNumberCanBe_DividedBy(i,3,5)){
                    sum += i ;
                    count += 1 ;
                    System.out.println(i + " can be divided by 3 and 5.");
                }
            }
        }
        System.out.println("There are " + count + " appropriate numbers.");
        System.out.println("Sum of these numbers = " + sum);
    }

    private static boolean checkIfTheNumberCanBe_DividedBy(int targetNumber , int divide1 , int divide2){
        boolean canBeDivided = false;
        if (divide1 <= 0 || divide2 <= 0 || targetNumber <= 0) {
            System.out.println("Invalid parameter...");
        }else if (targetNumber % divide1 == 0 && targetNumber % divide2 == 0){
            canBeDivided = true ;
        }else {
            canBeDivided = false ;
        }
        return canBeDivided ;
    }

    private static boolean isOdd(int number){
        boolean isNumberOdd ;
        if (number < 0){
            isNumberOdd = false ;
        }else if (number % 2 > 0) {
            isNumberOdd = true ;
        }else {
            isNumberOdd = false ;
        }
        return isNumberOdd ;
    }

    public static int sumOdd (int start , int end){
        int sum = 0 ;
        if (start < 0 || end < 0){
            return -1 ;
        }else if (start > end){
            return -1;
        }else{
            for (int i = start ; i <= end ; i++){
                if (isOdd(i)){
                    sum += i ;
                }
            }
        }
        return sum ;
    }

    private static boolean isEvenNumber(int number){
        if (number < 0){
            System.out.println("Invalid value");
            return false ;
        }
        return (number % 2) == 0 ? true : false ;
    }

    public static int sumOfEvenNumbers (int start , int end){
        int count = 0 ;
        while (start <= end){
            start++;
            if (!isEvenNumber(start)){
                continue;                                   //Bypassing
            }
            System.out.println("Even number found : " + start);
            count ++ ;
        }
        System.out.println("There are " + count + " numbers within the range.");
        return count ;
    }













}
