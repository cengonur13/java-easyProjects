import java.util.Scanner;
/** @author Onur TAS, 2021
 */

public class Odev1 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        int toplam;
        double sonuc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz :");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuz :");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunuz :");
        kimya = scanner.nextInt();

        System.out.println("Turkce notunuz :");
        turkce = scanner.nextInt();

        System.out.println("Tarih notunuz :");
        tarih = scanner.nextInt();

        System.out.println("Müzik notunuz :");
        muzik = scanner.nextInt();

        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        sonuc = toplam / 6.0;

        System.out.println("-------------");
        String durum = (sonuc>=60.0) ? "Gectiniz..." : "Kaldınız...";
        System.out.println("Ortalamanız : "+sonuc+"\nDurumunuz : "
                +durum);


    }
}
