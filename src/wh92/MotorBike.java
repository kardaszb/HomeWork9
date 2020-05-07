package wh92;

public class MotorBike extends Vehicle {
    private int speedLimit;

    public MotorBike(String name, int prodYear, int speedLimit) {
        super(name, prodYear);
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
