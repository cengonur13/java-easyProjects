import java.util.Scanner;

public class Odev3 {

    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int a, b, c, cevre;
        double alan, u;

        Scanner scanner = new Scanner(System.in);

        System.out.println("A kenarını giriniz :");
        a = scanner.nextInt();
        System.out.println("B kenarını giriniz :");
        b = scanner.nextInt();
        System.out.println("C kenarını giriniz :");
        c = scanner.nextInt();

        cevre = a + b + c;
        u = cevre / 2;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("--------");
        System.out.println("Girilen Ucgenin Alanı : "+alan);
    }
}
