package practice;

public class Dog extends Animal {

    private int eyes ;  //Unique characteristics to dog.
    private int legs ;
    private int tail ;
    private int teeth ;
    private String coat ;

    public Dog (String name, int brain, int body, int size, int weight , int eyes , int legs , int tail , int teeth , String coat) {
        super(name, brain, body, size, weight); //Super calls the constructor of the class we are extending from(Animal class)
        this.eyes = eyes ;
        this.legs = legs ;
        this.tail = tail ;
        this.teeth = teeth ;
        this.coat = coat ;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    private void chew () {
        System.out.println("Dog.chew() called.");
    }

    public void walk() {
        System.out.println("Dog.walk() called.");
        super.move(5);  //Executes the move method in extended class(Animal)
    }

    public void run() {
        System.out.println("Dog.run() called.");
        move(15); //Executes the move method in this class(Dog)
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        super.move(speed); //Executes the move method in extended class(Animal)
    }










    public static boolean shouldWakeUp(boolean barking , int hourOfDay){

        boolean wakeUpNeeded ;
        if (barking){
            if (hourOfDay > 23 || hourOfDay <0){
                wakeUpNeeded= false ;
            }else if (hourOfDay <8 || hourOfDay >22){
                wakeUpNeeded= true ;
            }else{
                wakeUpNeeded = false ;
            }
        }else{
            wakeUpNeeded = false ;
        }
        return wakeUpNeeded ;
    }

}
