package wh92;

public class Car extends Vehicle {
    private int seatNo;

    public Car(String name, int prodYear, int seatNo) {
        super(name, prodYear);
        this.seatNo = seatNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
}
