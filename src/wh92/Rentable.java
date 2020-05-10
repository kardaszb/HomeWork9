package wh92;

public interface Rentable {
    void rent(String firstName, String lastName, String id, Person person);

    void handOver();

    boolean isRent();
}
