package Ex5;

public class Camion extends Masina {
    private int greutate;

    public Camion(int speed, double regularPrice, String color, int greutate) {
        super(speed, regularPrice, color);
        this.greutate = greutate;
    }

    @Override
    public double getSalePrice(){
        if (greutate > 2000) {  
            return super.getRegularPrice() * 0.9;
        } else {
            return super.getRegularPrice() * 0.8;
        }
    }

    public int getGreutate(){
        return greutate;
    }
}
