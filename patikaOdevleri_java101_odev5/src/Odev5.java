import java.util.Scanner;

public class Odev5 {
    /**
     * @author Onur TAŞ, 2021...
     */

    public static void main(String[] args) {
        double pi = 3.14;
        double r,alan;
        int derece;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Daire Yarıçapını Giriniz : ");
        r = scanner.nextDouble();
        System.out.println("Alanı Hesaplanacak Açı(Derece cinsinden) :");
        derece = scanner.nextInt();

        alan = (pi * (r * r) * derece) / 360;
        System.out.println("----------");
        System.out.println("Daire Alanı : "+alan);

    }
}
