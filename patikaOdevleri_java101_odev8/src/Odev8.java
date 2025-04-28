import java.util.Scanner;

public class Odev8 {
    /**
     * @author Onur TAŞ, 2021...
     */

    public static void main(String[] args) {
        int num1, num2, islem;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen ilk sayıyı giriniz : ");
        num1 = scanner.nextInt();
        System.out.print("Lutfen ikinci sayıyı giriniz :");
        num2 = scanner.nextInt();

        System.out.println("--------");
        System.out.println("1- Toplama" +
                "         \n2- Çıkarma" +
                "         \n3- Çarpma" +
                "         \n4- Bölme");
        System.out.println("--------");
        System.out.print("Lutfen yapilacak islemi seciniz : ");
        islem = scanner.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplama Yapılıyor... Sonuc : "+(num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma Yapılıyor... Sonuc : "+(num1 - num2));
                break;
            case 3:
                System.out.println("Çarpma Yapılıyor... Sonuc : "+(num1 * num2));
                break;
            case 4:
                if(num2 != 0){
                    System.out.println("Bölme Yapılıyor... Sonuc : "+(num1 / num2));
                    break;
                }else{
                    System.out.println("0 a bölme işlemi yapmaya çalıştınız... Hatalı Giriş!");
                    break;
                }
            default:
                System.out.println("Hatalı İşlem Girişi... Lutfen tekrar deneyiniz...");
        }
    }
}
