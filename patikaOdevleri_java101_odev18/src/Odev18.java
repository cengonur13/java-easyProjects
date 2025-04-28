import java.util.Scanner;

public class Odev18 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int numb, total=0;

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("\nBir sayı giriniz \n(Çıkış için tek sayı giriniz...) :");
            scanner.reset();
            numb = scanner.nextInt();
            if(numb % 4 == 0){
                total += numb;
                System.out.println("-----\n "+numb+"\n-----");
            }
        }while (numb % 2 == 0);
        System.out.println("Girilen sayılardan çift ve 4ün katı olan sayıların toplamı" +
                " : "+total);
    }
}
