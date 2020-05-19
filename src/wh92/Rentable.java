package wh92;

public interface Rentable {
    Person rent(String firstName, String lastName, String id);
    Person handOver();
    boolean isRent();
}
