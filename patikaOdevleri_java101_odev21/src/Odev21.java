import java.util.Scanner;

public class Odev21 {
    /**
     * @author Onur TAŞ, 2021...
     */

    public static void main(String[] args) {
        int taban, us, sonuc=1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı :");
        taban = scanner.nextInt();
        System.out.print("Us değeri :");
        us = scanner.nextInt();

        for(int i=1; i<=us; i++){
            sonuc *= taban;
        }
        System.out.println(taban +"^"+us+" = "+sonuc);
    }
}
