import java.util.Scanner;

public class Odev14 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double fiyat;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz :");
        mesafe = scanner.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas = scanner.nextInt();
        System.out.print("Yolculuk Türü :\n1 => Tek Yön," +
                "\n2 => Gidiş Dönüş\nSeçiminiz :");
        yolculukTipi = scanner.nextInt();

        if((mesafe>0) && (yas>0) && ((yolculukTipi == 1) || (yolculukTipi == 2))){
            fiyat = mesafe * 0.10;

            if(yas<12){
                fiyat *= 0.5;
            }else if (yas>=12 && yas<24){
                fiyat *= 0.9;
            }else if (yas>=65){
                fiyat *= 0.7;
            }

            if(yolculukTipi == 1){
                System.out.println("Toplam Tutar :"+fiyat);
            }else {
                double indirim = fiyat * 0.2;
                fiyat -= indirim;
                fiyat *= 2;
                System.out.println("Toplam Tutar :"+fiyat);
            }

        }else {
            System.out.println("Yanlış Bilgi girişi...");
        }

    }
}
