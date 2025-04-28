import java.util.Scanner;

public class Odev7 {

    /**
     * @author Onur TAŞ, 2021...
     */

    public static void main(String[] args) {


        double tutar = 0.0;

        double [] fiyat = {2.14,3.67,1.11,0.95,5.00};
        int [] kilo = {0,0,0,0,0};
        String[] liste = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"};

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5;i++){
            System.out.println(liste[i]+" Kaç Kilo? :");
            kilo[i] = scanner.nextInt();
        }

        for(int i=0;i<5;i++){
            tutar += kilo[i] * fiyat[i];
        }
        System.out.println("Toplam Tutar :" +tutar);

    }
}
