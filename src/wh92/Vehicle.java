package wh92;

abstract public class Vehicle implements Movable {
    private String name;
    private int prodYear;

    public Vehicle(String name, int prodYear) {
        this.name = name;
        this.prodYear = prodYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    @Override
    public String turnLeft() {
        return "lewo";
    }

    @Override
    public String turnRight() {
        return "prawo";
    }

    @Override
    public String goForward() {
        return "przod";
    }

    @Override
    public String goBack() {
        return "tyl";
    }

}
