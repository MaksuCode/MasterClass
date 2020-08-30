package practice.oopexample;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(int basePrice, String nameOfBurger, Bread breadRollType, Meat meat) {
        super(basePrice, nameOfBurger, breadRollType, meat, new Additions("Chips"), new Additions("Drink"));
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice();
    }
}
