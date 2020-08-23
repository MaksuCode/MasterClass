package practice;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter your year of birth :");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt() ;
            scanner.nextLine() ;
            System.out.println("Please enter your name : ");
            String name = scanner.nextLine() ;
            int age = 2020 - yearOfBirth ;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and your are " + age + " years old.") ;
            }else{
                System.out.println("Inavalid age!");
            }
        }else{
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }
}
