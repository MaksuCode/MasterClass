package practice.oopexample;

public class Additions {

    private int priceOfAddition ;
    private String nameOfAddition ;

    public Additions() {
        this.nameOfAddition = "" ;
    }

    public Additions(String nameOfAddition) {
        this.nameOfAddition = nameOfAddition;
        setPriceOfAddition(nameOfAddition) ;
    }

    public int setPriceOfAddition (String nameOfAddition) {
        this.nameOfAddition = nameOfAddition ;
        switch (nameOfAddition){
            case "Chips" :
                this.priceOfAddition = 5 ;
                break;
            case "Coke" :
                this.priceOfAddition = 4 ;
                break;
            case "Hot Dog" :
                this.priceOfAddition = 3 ;
                break;
            case "Water":
                this.priceOfAddition = 2 ;
                break;
            case "Ketchup" :
                this.priceOfAddition = 1 ;
                break;
            case "Dessert":
                this.priceOfAddition = 7 ;
                break;
        }
        return priceOfAddition ;
    }


    public int getPriceOfAddition() {
        return priceOfAddition;
    }

    public String getNameOfAddition() {
        return nameOfAddition;
    }

}
