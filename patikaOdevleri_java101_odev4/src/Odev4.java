import java.util.Scanner;

public class Odev4 {
    /**
     * @author Onur TAŞ, 2021...
     */

    public static void main(String[] args) {
        int km;
        double tutar=10.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Gidilecek Mesafeyi Km olarak Giriniz :");
        km = scanner.nextInt();
        tutar += km * 2.2;

        tutar = (tutar < 20 ) ? 20 : tutar;
        System.out.println("Odenecek Tutar : "+tutar);


    }
}
