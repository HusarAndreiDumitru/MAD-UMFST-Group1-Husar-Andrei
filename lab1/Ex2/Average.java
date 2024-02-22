package Ex2;
 
public class Average {

    

    public double calAverage(int[] sir) {
        double sum = 0;
        for (double element : sir) {
            sum += element;
        }
        return sum / sir.length;
    }
}
