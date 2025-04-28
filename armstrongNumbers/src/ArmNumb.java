import java.util.Scanner;

public class ArmNumb {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int number, numDigit=0,total=1,result=0;
        int tempNumber;
        int numValue;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen sayıyı giriniz : ");
        number = scanner.nextInt();
        tempNumber = number;

        // basamak sayısı belirlendi
        while (tempNumber != 0){
            tempNumber /= 10;
            numDigit++;
        }

        tempNumber = number;

        while (tempNumber != 0){
            numValue = tempNumber % 10; // basamaktaki sayı bulundu

            for(int i=1; i<= numDigit; i++){ // sayı^N hesaplandı
                total *= numValue;
            }

            result += total; // sayı^N toplama eklendi
            total = 1;
            tempNumber /= 10;
        }
        if(result == number){
            System.out.println("Girilen "+number+" sayısı Armstrong sayıdır.");
        }else {
            System.out.println("Girilen "+number+" sayısı Armstrong sayı değildir.");
        }
    }
}
