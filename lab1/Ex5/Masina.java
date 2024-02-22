package Ex5;

public class Masina{

    private int speed;
    private double regularPrice;
    private String color;

    public Masina(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }

    // Getter methods
    public int getSpeed() {
        return speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public String getColor() {
        return color;
    }
}
