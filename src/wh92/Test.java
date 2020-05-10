package wh92;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        Vehicle[] cars = new Car[2];
        cars[0] = new Car("Toyota", 2015, 5);
        cars[1] = new Car("Ford", 2019, 4);
        cars[0].turnLeft();
        System.out.println(cars[0].toString());

        Rentable carToRent = new RentableCar("Toyota", 2015, 5);

        if (carToRent.isRent())
            System.out.println(carToRent);
        else carToRent.rent("Jan", "Kowalski", "21", person);


        System.out.println(carToRent);

        carToRent.handOver();

        System.out.println(carToRent);


    }
}
