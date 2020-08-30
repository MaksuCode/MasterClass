package practice.polymorphism;

public class LandRover extends Car {

    public LandRover(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Landrover - > engine started." ;
    }

    @Override
    public String accelerate() {
        return "Landrover - > Accelerated." ;
    }

//    @Override
//    public String brake() {
//        return "Landrover - > Braked." ;
//    }
}
