package Ex1;
import java.util.Scanner;
import Ex2.*;
import Ex3.*;
import Ex4.*;
import Ex5.*;

public class Numar{
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
//Ex1
    System.out.println("Alegeti exercitiul: ");
    switch (scaner.nextInt()) {
        case 1: 
            System.out.println("Introdu un numar: ");
            double numar = scaner.nextDouble();
            scaner.close();

            if(numar > 0){
                System.out.println("Numarul este pozitiv: " + numar);
            }else if(numar < 0){
                System.out.println("Numarul este negativ: " + numar);
            }else{
                System.out.println("Numarul este 0");
            }          
            break;

        case 2:
            System.out.println("Introdu marimea sirului: ");
            int marime = scaner.nextInt();

            int[] sir = new int[marime];

            System.out.println("Introdu elementele sirului: ");

            for(int i = 0; i < sir.length; i++){
                sir[i] = scaner.nextInt();
                System.out.println("Pozitia: " + (i + 1) + " " + "Elementul: " + sir[i]);
            }

            Average ave = new Average();
            double aveRez = ave.calAverage(sir);
            System.out.println("Average: " + aveRez);
            break;

        case 3:
            Twin a = new Twin();
            System.out.println("Indica limita: ");
            int limit = scaner.nextInt();
            a.Twins(limit);
            break;

        case 4:
            Jocuri joc1 = new Jocuri("Minecraft", 2009, 29.00);
            joc1.afiseazaDateJoc();
            System.out.println("----------------------------------------");
            System.out.println("Numele jocului inainte de schimbare: " + joc1.getNume());
            System.out.println("----------------------------------------");
            joc1.setNume("DOOM");
            joc1.afiseazaDateJoc();
            break;
        
        case 5:
            Sedan Sedan = new Sedan(200, 30000, "Negru", 14);
            Ford Ford1 = new Ford(190, 45000, "Alb", 2008, 5);
            Ford Ford2 = new Ford(160, 35000, "Verde", 2007, 10);
            Masina car = new Masina(130, 20000, "Mov");

            System.out.println("Pretul Sedanului: " + Sedan.getRegularPrice());
            System.out.println("Pretul primului Ford: " + Ford1.getRegularPrice());
            System.out.println("Pretul celui de-al doilea Ford: " + Ford2.getRegularPrice());
            System.out.println("Pretul masinii generale: " + car.getRegularPrice());
        default:
            break;
    }
        
//Ex2
        

    }
}
