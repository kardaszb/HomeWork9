package wh92;

public class RentableCar extends Car implements Rentable {
    private Person person;

    public RentableCar(String name, int prodYear, int seatNo) {
        super(name, prodYear, seatNo);
    }

    @Override
    public void rent(String firstName, String lastName, String id, Person person) {
        this.person = person;
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setId(id);
    }

    @Override
    public void handOver() {
        person = null;
    }

    @Override
    public boolean isRent() {
        if (person == null)
            return false;
        else return true;
    }

    @Override
    public String toString() {
        return "Samochód wypożyczony dla: " + person;
    }
}
