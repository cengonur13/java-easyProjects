import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Odev47 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int number, select;
        int[] arr = new int[5];
        int right=0;
        boolean isWin = false;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        number = random.nextInt(100);
        //System.out.println(number);

        while (right < 5){
            System.out.print("Tahmininiz : ");
            select = scanner.nextInt();

            if (select == number){
                System.out.println("Tebrikler, Doğru Tahmin!");
                isWin = true;
                break;
            }else {
                arr[right++] = select;
                System.out.println("Yanlış Tahmin...");
                if (select > number){
                    System.out.println("İpucu -> Girdiğiniz sayı, doğru sayıdan BÜYÜK!");
                    System.out.println("Kalan Deneme Hakkınız : "+(5-right));
                }else {
                    System.out.println("İpucu -> Girdiğiniz sayı, doğru sayıdan KÜÇÜK!");
                    System.out.println("Kalan Deneme Hakkınız : "+(5-right));
                }
            }
            System.out.println("--------------");
        }
        if (isWin){
            System.out.println("Oyunu kazandınız...");
        }else {
            System.out.println("Oyunu kaybettiniz...");
            System.out.println("Doğru cevap : "+number);
            System.out.println("Girdiğiniz sayılar : "+ Arrays.toString(arr));
        }
    }
}
