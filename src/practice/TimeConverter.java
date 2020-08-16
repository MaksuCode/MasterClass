package practice;

public class TimeConverter {

    private static final String INVALID_RANGE_MESSAGE = "Invalid parameter range spotted!" ;

    public static String getDurationString(int minutes , int seconds){
        if (minutes <= 0 || seconds <= 0 || seconds >= 60){
            return INVALID_RANGE_MESSAGE ;
        }
        int hour = minutes / 60 ;
        int remainderMinutes = minutes % 60 ;
        return hour+ "h " + remainderMinutes + "m " + seconds + "s" ;
    }
    public static String getDurationString(int seconds){
        if (seconds < 0){
            return INVALID_RANGE_MESSAGE ;
        }
        int minutes = seconds / 60 ;
        int remainderSeconds = seconds % 60 ;
        return getDurationString(minutes,remainderSeconds) ;

    }





}
