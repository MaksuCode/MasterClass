package practice.oopexample;

public class Meat {

    private String nameOfMeat ;
    boolean isOverCooked ;

    public Meat(String nameOfMeat) {
        this.nameOfMeat = nameOfMeat ;
    }

    public Meat( String nameOfMeat , boolean isOverCooked) {
        this(nameOfMeat) ;
        this.isOverCooked = isOverCooked ;

    }

    public String getNameOfMeat() {
        return nameOfMeat;
    }

    public boolean isOverCooked() {
        return isOverCooked;
    }
}
