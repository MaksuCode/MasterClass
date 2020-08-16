package practice;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1 ;
        }
        return Math.round(kilometersPerHour / 1.60934) ;

    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value!");
        }else{
            long milesPerHourRounded = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+
                    " km/h = " +milesPerHourRounded+
                    " mi/h" );
        }
    }
}
