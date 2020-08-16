package practice;

public class Dog {

    public static boolean shouldWakeUp(boolean barking , int hourOfDay){

        boolean wakeUpNeeded ;
        if (barking){
            if (hourOfDay > 23 || hourOfDay <0){
                wakeUpNeeded= false ;
            }else if (hourOfDay <8 || hourOfDay >22){
                wakeUpNeeded= true ;
            }else{
                wakeUpNeeded = false ;
            }
        }else{
            wakeUpNeeded = false ;
        }
        return wakeUpNeeded ;
    }

}
