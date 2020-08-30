package practice.polymorphism;

public class Volvo extends  Car {

    public Volvo(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Volvo - > engine started" ;
    }

    @Override
    public String accelerate() {
        return "Volvo - > Accelerated." ;
    }

    @Override
    public String brake() {
        return "Volvo - > Braked." ;
    }
}
