package practice.encapsulation;

public class Printer {

    private int tonerLevel = 100;
    private int pagesPrinted ;
    private boolean isDuplexPrinter ;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel >=0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel ;
        }
        this.pagesPrinted = 0 ;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public Printer (boolean isDuplexPrinter) {
        this(100,isDuplexPrinter) ;
    }

    public int addToner(int tonerAdded) {
        if (tonerAdded > 0 && tonerAdded <=100){
            if ((this.tonerLevel + tonerAdded) > 100) {
                System.out.println("Exceeded the toner limit.");
                return -1 ;
            }
            this.tonerLevel += tonerAdded ;
        }else {
            return  -1 ;
        }
        return this.tonerLevel ;
    }

    public int printPage(int numberOfPages){
        int pagesToPrint = numberOfPages ;
        if (this.isDuplexPrinter) {
            pagesToPrint = (numberOfPages/2) + (numberOfPages % 2) ;
            System.out.println("Printing in duplex mode.");
        }
        if (getTonerLevel() == 0) {
            System.out.println("No toner left in the printer.");
            return -1 ;
        }else if ( getTonerLevel() < numberOfPages){
            System.out.println("There is not enough toner left to print " + numberOfPages + " pages.");
            return  -1 ;
        }else {
            this.tonerLevel -= pagesToPrint ;
            this.pagesPrinted += pagesToPrint ;
        }
        return pagesToPrint ;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    private int getTonerNeededToFillUp(){
        return 100 - getTonerLevel() ;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
