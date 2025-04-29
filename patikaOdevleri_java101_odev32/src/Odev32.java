import java.util.Scanner;

public class Odev32 {
    /**
     * @author Onur TAŞ, 2021...
     */
    static boolean isPalindrom(int numb){
        int temp = numb, reverseNumb=0, lastNumb;
        while (temp != 0){
            lastNumb = temp % 10;
            reverseNumb = (reverseNumb*10) + lastNumb;
            temp /= 10;
        }

         return (numb == reverseNumb) ? true : false;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen sayı giriniz : ");
        int number = scanner.nextInt();
        if(isPalindrom(number))
            System.out.println("Girilen "+number+" sayısı, Palindrom sayıdır.");
        else
            System.out.println("Girilen "+number+" sayısı, Palindrom sayı değildir.");
       
    }
}
