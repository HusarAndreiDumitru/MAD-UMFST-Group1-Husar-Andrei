package Ex4;

public class Jocuri {
    // Private fields to encapsulate the data
    private String nume;
    private int dataLansare;
    private double pret;

    // Constructor to initialize the fields
    public Jocuri(String nume, int dataLansare, double pret) {
        this.nume = nume;
        this.dataLansare = dataLansare;
        this.pret = pret;
    }

    // Getter methods to access the private fields
    public String getNume() {
        return nume;
    }

    public int getLansare() {
        return dataLansare;
    }

    public double getPret() {
        return pret;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setLansare(int dataLansare) {
        this.dataLansare = dataLansare;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void afiseazaDateJoc() {
        System.out.println("Nume Joc: " + nume);
        System.out.println("Data lansarii jocului: " + dataLansare);
        System.out.println("Pretul jocului: " + pret);
    }
}