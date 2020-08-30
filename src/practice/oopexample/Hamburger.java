package practice.oopexample;

public class Hamburger {

    private int basePrice;
    private String nameOfBurger ;
    private Bread breadRollType ;
    private Meat meat ;
    private Additions addition_1 ;
    private Additions addition_2 ;
    private Additions addition_3 ;
    private Additions addition_4 ;

    //Hamburger with no additions.
    public Hamburger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat) {
        this.basePrice = basePrice;
        this.nameOfBurger = nameOfBurger;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.addition_1 = new Additions();
        this.addition_2 = new Additions();
        this.addition_3 = new Additions();
        this.addition_4 = new Additions();
    }

    //Hamburger with 1 additions.
    public Hamburger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat, Additions addition_1) {
        this(basePrice , nameOfBurger ,breadRollType ,meat) ;
        this.addition_1 = addition_1 ;
        this.addition_2 = new Additions();
        this.addition_3 = new Additions();
        this.addition_4 = new Additions();
    }

    //Hamburger with 2 additions.
    public Hamburger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat, Additions addition_1 , Additions addition_2) {
        this(basePrice , nameOfBurger ,breadRollType ,meat) ;
        this.addition_1 = addition_1 ;
        this.addition_2 = addition_2 ;
        this.addition_3 = new Additions();
        this.addition_4 = new Additions();
    }

    //Hamburger with 3 additions.
    public Hamburger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat, Additions addition_1 , Additions addition_2 , Additions addition_3) {
        this(basePrice , nameOfBurger ,breadRollType ,meat) ;
        this.addition_1 = addition_1 ;
        this.addition_2 = addition_2 ;
        this.addition_3 = addition_3 ;
        this.addition_4 = new Additions();
    }

    //Hamburger with 4 additions.
    public Hamburger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat, Additions addition_1 , Additions addition_2 , Additions addition_3 , Additions
                     addition_4) {
        this(basePrice , nameOfBurger ,breadRollType ,meat) ;
        this.addition_1 = addition_1 ;
        this.addition_2 = addition_2 ;
        this.addition_3 = addition_3 ;
        this.addition_4 = addition_4 ;
    }

    private int getBasePrice() {
        return basePrice;
    }

    public int getTotalPrice() {
        int totalPrice = getBasePrice() + addition_1.getPriceOfAddition() + addition_2.getPriceOfAddition() + addition_3.getPriceOfAddition() + addition_4.getPriceOfAddition() ;
        System.out.println("Total prices : " + totalPrice);
        System.out.println("Base price : " + getBasePrice());
        return 1 ; // TODO : fix

    }

    public String getNameOfBurger() {
        return nameOfBurger;
    }

    public Bread getBreadRollType() {
        return breadRollType;
    }

    public Meat getMeat() {
        return meat;
    }

}
