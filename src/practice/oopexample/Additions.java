package practice.oopexample;

import java.util.ArrayList;
import java.util.List;

public class Additions {

    private int priceOfAddition ;
    private String nameOfAddition ;

    public Additions() {
        this.nameOfAddition = "" ;
    }

    public Additions(String nameOfAddition) {
        this.nameOfAddition = nameOfAddition;
        setPriceOfAddition(nameOfAddition) ;
        listOfAdditions(nameOfAddition) ;
    }

    public int setPriceOfAddition (String nameOfAddition) {
        this.nameOfAddition = nameOfAddition ;
        switch (nameOfAddition){
            case "Chips" :
                return this.priceOfAddition = 5 ;
            case "Coke" :
                return this.priceOfAddition = 3 ;
            case "Hot Dog" :
                return this.priceOfAddition = 6 ;
            case "Water":
                return this.priceOfAddition = 2 ;
            case "Ketchup" :
                return this.priceOfAddition = 1 ;
            case "Dessert":
                return this.priceOfAddition = 3 ;
        }
        return 0 ;
    }


    public int getPriceOfAddition() {
        return priceOfAddition;
    }

    public String getNameOfAddition() {
        return nameOfAddition;
    }

    public List<String> listOfAdditions (String nameOfAddition) {
        List <String> list = new ArrayList<>() ;
        if (!nameOfAddition.equals("")) {
            list.add(nameOfAddition) ;
        }
        return list ;
    }


}
