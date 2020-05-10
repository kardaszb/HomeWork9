package wh92;

abstract public class Vehicle implements Movable {
    private String name;
    private String direction;
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

    public String getDirection() {
        return direction;
    }

    private void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public void turnLeft() {
        setDirection("lewo");
    }

    @Override
    public void turnRight() {
        setDirection("prawo");
    }

    @Override
    public void goForward() {
        setDirection("przod");
    }

    @Override
    public void goBack() {
        setDirection("tyl");
    }

}
