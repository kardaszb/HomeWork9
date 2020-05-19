package wh92;

public class RentableCar extends Car implements Rentable {
    public RentableCar(String name, int prodYear, int seatNo) {
        super(name, prodYear, seatNo);
    }

    @Override
    public Person rent(String firstName, String lastName, String id) {
        return null;
    }

    @Override
    public Person handOver() {
        return null;
    }

    @Override
    public boolean isRent() {
        return false;
    }
}
