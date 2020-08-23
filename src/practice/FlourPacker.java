package practice;

public class FlourPacker { //TODO : finish the class.

    public static boolean canPack(int bigCount , int smallCount , int goal) {
        boolean canPack = true;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false ;
        }
        int bigCountTotalKg = bigCount * 5 ;
        if (bigCountTotalKg > goal && (goal - bigCountTotalKg) < 5) {
            canPack = false ;
        }else if (true){

        }
        return canPack ;
    }

}
