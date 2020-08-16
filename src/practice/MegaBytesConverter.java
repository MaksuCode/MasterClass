package practice;

public class MegaBytesConverter {



    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabyte = kiloBytes / 1024 ;
        int remainder = kiloBytes % 1024 ;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else if (remainder > 0){
            System.out.println(kiloBytes+ " KB = " +megabyte+ " MB and " +remainder+ " KB");
        }else{
            System.out.println(kiloBytes+ " KB = " + megabyte+ " MB");
        }


    }

}
