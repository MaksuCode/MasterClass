package practice.oopexample;

public class HealthyBurger extends Hamburger {

    private Additions addition_5 ;
    private Additions addition_6 ;

    public HealthyBurger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat) {
        super(basePrice, nameOfBurger, breadRollType, meat);
        this.addition_5 = new Additions() ;
        this.addition_6 = new Additions() ;

    }

    public HealthyBurger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat, Additions addition_1) {
        super(basePrice, nameOfBurger, breadRollType, meat, addition_1);
        this.addition_5 = new Additions() ;
        this.addition_6 = new Additions() ;
    }

    public HealthyBurger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat, Additions addition_1, Additions addition_2) {
        super(basePrice, nameOfBurger, breadRollType, meat, addition_1, addition_2);
        this.addition_5 = new Additions() ;
        this.addition_6 = new Additions() ;
    }

    public HealthyBurger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat, Additions addition_1, Additions addition_2, Additions addition_3) {
        super(basePrice, nameOfBurger, breadRollType, meat, addition_1, addition_2, addition_3);
        this.addition_5 = new Additions() ;
        this.addition_6 = new Additions() ;
    }

    public HealthyBurger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat, Additions addition_1, Additions addition_2, Additions addition_3, Additions addition_4,
                         Additions addition_5) {
        super(basePrice, nameOfBurger, breadRollType, meat, addition_1, addition_2, addition_3, addition_4);
        this.addition_5 = addition_5 ;
        this.addition_6 = new Additions() ;
    }

    public HealthyBurger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat, Additions addition_1, Additions addition_2, Additions addition_3, Additions addition_4,
                         Additions addition_5 , Additions addition_6) {
        super(basePrice, nameOfBurger, breadRollType, meat, addition_1, addition_2, addition_3, addition_4);
        this.addition_5 = addition_5 ;
        this.addition_6 = addition_6 ;
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + addition_5.getPriceOfAddition() + addition_6.getPriceOfAddition() ;
    }
}
