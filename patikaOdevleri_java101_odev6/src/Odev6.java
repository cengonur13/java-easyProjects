import java.util.Scanner;

public class Odev6 {
    /**
     * @author Onur TAŞ, 2021...
     */

    public static void main(String[] args) {
        int  kilo;
        double boy, vucutKitleIndex;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz :");
        boy = scanner.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz : ");
        kilo = scanner.nextInt();

        vucutKitleIndex = (kilo)/(boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndex);
    }
}
