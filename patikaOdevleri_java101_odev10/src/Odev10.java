import java.util.Scanner;

public class Odev10 {
    /**
     * @author Onur TAŞ, 2021...
     */

    public static void main(String[] args) {
        int[] notlar = new int[5];
        String[] dersler = {"Matematik","Fizik","Türkçe","Kimya","Müzik"};

        double ort=0.0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println(dersler[i]+" Notunuz :");
            notlar[i] = scanner.nextInt();
            if (notlar[i] >= 0 && notlar[i]<=100) {
                ort += notlar[i];
            }
        }
        ort = ort/5.0; //2.değişken kullanma yerine tek değişkende ort hesaplandı böylece...
        if(ort<=55){
            System.out.println("Sınıfta kaldınız...");
        }else {
            System.out.println("Tebrikler, Sınıfı Geçtiniz...");
        }
        System.out.println("Ortalamanız :"+ort);

    }
}
