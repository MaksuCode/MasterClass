package practice.polymorphism;

public class Car {

    private boolean engine ;
    private int cylinders ;
    private int wheels ;
    private String name ;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true ;
        this.wheels = 4 ;
    }

    public String startEngine() {
        return "Car - > Engine started." ;
    }

    public String accelerate() {
        return "Car - > Accelerated." ;
    }

    public String brake(){
        return "Car - > Braked." ;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}
