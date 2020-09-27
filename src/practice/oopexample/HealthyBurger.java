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
        int additionsPrice = 0 ;
        System.out.println("Base price : " + getBasePrice());
        if (!getAddition_1().getNameOfAddition().isEmpty()) {
            System.out.println(getAddition_1().getNameOfAddition() + " : " + getAddition_1().getPriceOfAddition());
            additionsPrice += getAddition_1().getPriceOfAddition();
        }
        if (!getAddition_2().getNameOfAddition().isEmpty()){
            System.out.println(getAddition_2().getNameOfAddition() + " : " + getAddition_2().getPriceOfAddition());
            additionsPrice += getAddition_2().getPriceOfAddition();
        }
        if (!getAddition_3().getNameOfAddition().isEmpty()){
            System.out.println(getAddition_3().getNameOfAddition() + " : " + getAddition_3().getPriceOfAddition());
            additionsPrice += getAddition_3().getPriceOfAddition();
        }
        if (!getAddition_4().getNameOfAddition().isEmpty()) {
            System.out.println(getAddition_4().getNameOfAddition() + " : " + getAddition_4().getPriceOfAddition());
            additionsPrice += getAddition_4().getPriceOfAddition();
        }
        if (!getAddition_5().getNameOfAddition().isEmpty()) {
            System.out.println(getAddition_5().getNameOfAddition() + " : " + getAddition_5().getPriceOfAddition());
            additionsPrice += getAddition_5().getPriceOfAddition();
        }
        if (!getAddition_6().getNameOfAddition().isEmpty()) {
            System.out.println(getAddition_6().getNameOfAddition() + " : " + getAddition_6().getPriceOfAddition());
            additionsPrice += getAddition_6().getPriceOfAddition();
        }
        int total = getBasePrice() + additionsPrice ;
        System.out.println("Total price : " + total +"\n");
        return total ;
    }

    public Additions getAddition_5() {
        return addition_5;
    }

    public Additions getAddition_6() {
        return addition_6;
    }
}
