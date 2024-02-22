package Ex3;

public class Twin {

    public boolean Prim(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

   public void Twins(int limit) {
        for (int i = 3; i < limit - 2; i++) {
            if (Prim(i) && Prim(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
