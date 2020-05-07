package wh92;

public class Test {
    public static void main(String[] args) {
        Vehicle[] cars = new Car[2];

        cars[0] = new RentableCar("Toyota", 2015, 5);
        cars[1] = new RentableCar("Ford", 2019, 4);

    }
}
