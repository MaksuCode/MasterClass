package practice;

public class ElectricCarr extends Carr {

    private int batteryLimit ;


    public ElectricCarr(int passengerLimit, int gearLimit, int doorNumber, boolean isFourXFour, boolean isSelfDrivingCar, int batteryLimit) {
        super(passengerLimit, gearLimit, doorNumber, 4, "diesel", isSelfDrivingCar,false);
        this.batteryLimit = batteryLimit;
    }

    public int getBatteryLimit() {
        return batteryLimit;
    }

    @Override
    public void changeGear(int gear) {
        super.changeGear(gear);
    }
}
