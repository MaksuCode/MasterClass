package practice;

public class SwitchPractice {

    public static void switchCharExample (char variable){

        switch (variable) {
            case 'A' : case 'B' : case 'C' : case 'D' : case 'E' :
                System.out.println("The char value is : " + variable);
                break;
            default:
                System.out.println("The char value not found...");
                break;
        }
    }

    public static void switchStringExample (String variable){

        switch (variable.toLowerCase()) {
            case "a" : case "b" : case "c" : case "d" : case "e" :
                System.out.println("The char value is : " + variable);
                break;
            default:
                System.out.println("The char value not found...");
                break;
        }
    }
}
