package Ex5;

public class Ford extends Masina{
    private int year;
    private int manDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manDiscount){
        super(speed, regularPrice, color);
        this.manDiscount = manDiscount;
        this.year = year;
    }
    
    @Override
    public double getSalePrice(){
        double discount = super.getSalePrice();
        return discount - manDiscount;
    }

    public int getYear(){
        return year;
    }
}
