package practice;

/*
   This was an interview question for Accenture company
   Deletes the repeated chars in a string and returns the new String
 */

public class StringModifier {

    public String modifyString(String string) { //TODO : bf

        for (int i = 0 ; i < string.length() ; i++) {
            int firstLength = string.length() ;
            String temp = string.substring(i , i+1) ;
            String newString = string.replace(temp , "");
            if (firstLength - newString.length() > 1) {
                string = newString ;
            }
        }
        return string ;
    }


}
