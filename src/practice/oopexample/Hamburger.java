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

    {
        System.out.println("This is a init block");
    }

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

    public int getBasePrice() {
        return basePrice;
    }

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
        int total = getBasePrice() + additionsPrice ;
        System.out.println("Total price : " + total);
        return total ;
    }

    public Additions getAddition_1() {
        return addition_1;
    }

    public Additions getAddition_2() {
        return addition_2;
    }

    public Additions getAddition_3() {
        return addition_3;
    }

    public Additions getAddition_4() {
        return addition_4;
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
