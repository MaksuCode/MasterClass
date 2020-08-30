package practice;

public class Vehicle {

    private int engine ;
    private boolean isPublic ;
    private boolean goesOnTheRoad ;
    private int passengerLimit ;

    private int currentVelocity ;
    private int currentDirection ;


    public Vehicle(int engine, boolean isPublic, boolean goesOnTheRoad, int passengerLimit) {
        this.engine = engine;
        this.isPublic = isPublic;
        this.goesOnTheRoad = goesOnTheRoad;
        this.passengerLimit = passengerLimit;
        this.currentVelocity = 0 ;
        this.currentDirection = 0 ;
    }

    public void steer(int direction) {
        this.currentDirection += direction ;
        System.out.println("Vehicle.steer() called. Steer at " + currentDirection + " degrees.") ;
    }

    public void move(int velocity , int direction) {
        currentVelocity = velocity ;
        currentDirection = direction ;
        System.out.println("Vehicle.move() called. Moving at speed of " + currentVelocity + " in direction " + currentDirection);

    }


    public boolean isGoesOnTheRoad() {
        return goesOnTheRoad;
    }

    public int getPassengerLimit() {
        return passengerLimit;
    }

    public int getEngine() {
        return engine;
    }

    public boolean isPublic() {
        return isPublic;
    }





}
