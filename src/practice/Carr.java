package practice;

public class Carr extends Vehicle {

    private int wheels ;
    private int gearLimit ;
    private int doorNumber ;
    private String fuelType ;
    private boolean isFourXFour ;
    private boolean isSelfDrivingCar ;

    private int currentGear ;



    public Carr(int passengerLimit, int wheels, int gearLimit, int doorNumber, String fuelType, boolean isFourXFour, boolean isSelfDrivingCar) {
        super(1, false, true, passengerLimit);
        this.wheels = wheels;
        this.gearLimit = gearLimit;
        this.doorNumber = doorNumber;
        this.fuelType = fuelType;
        this.isFourXFour = isFourXFour;
        this.isSelfDrivingCar = isSelfDrivingCar;

        this.currentGear = 1 ;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear ;
        System.out.println("Car.changeGear() called. Change to " + currentGear + " gear" );
    }



    @Override
    public void steer(int direction) {
        super.steer(direction);
    }

    @Override
    public void move(int velocity, int direction) {
        super.move(velocity, direction);
    }

    public int getGearLimit() {
        return gearLimit;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public boolean isFourXFour() {
        return isFourXFour;
    }

    public boolean isSelfDrivingCar() {
        return isSelfDrivingCar;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
