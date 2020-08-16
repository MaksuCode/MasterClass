package practice;

public class PlayingCat {

    public static boolean isCatPlaying (boolean summer , int temperature){

        boolean catIsPlaying ;

        if (summer){
            if (temperature <25 || temperature > 45){
                catIsPlaying = false ;
            }else {
                catIsPlaying = true ;
            }
        }else{
            if (temperature <25 || temperature > 35){
                catIsPlaying = false ;
            }else{
                catIsPlaying = true ;
            }
        }
        return catIsPlaying ;
    }
}
