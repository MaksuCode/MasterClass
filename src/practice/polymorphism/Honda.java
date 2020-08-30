package practice.polymorphism;

public class Honda extends Car {

    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Honda - > Engine started." ;
    }

    @Override
    public String accelerate() {
        return "Honda - > Accelerated." ;
    }

    @Override
    public String brake() {
        return "Honda - > Braked." ;
    }
}
