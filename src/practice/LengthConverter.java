package practice;

public class LengthConverter {

    public static double calcFeetAndInchesToCentimeter (double feet , double inches){

        if (feet < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid Value range spotted!");
            return -1 ;
        }
        double centimeter = (feet * 30.48) + (inches * 2.54) ;
        System.out.println(feet + " feets and " + inches + " inches equals to " + centimeter + " centimeters");
        return  centimeter ;
    }

    public static double calcFeetAndInchesToCentimeter (double inches){
        if (inches <= 0){
            System.out.println("Invalid Value range spotted!");
            return -1 ;
        }
        double feet = (int) inches / 12 ;
        double remainderInches = (int) inches % 12 ;
        System.out.println(inches + " inches equals to " + feet + " feets and " + remainderInches);
        return calcFeetAndInchesToCentimeter(feet,remainderInches) ;

    }
}
