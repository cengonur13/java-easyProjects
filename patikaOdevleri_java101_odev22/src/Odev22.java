import java.util.Scanner;

public class Odev22 {
    /**
     * @author Onur TAŞ, 2021...
     *
     */
    public static void main(String[] args) {
        int num,total=0;
        int tempNum;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen sayı giriniz :");
        num = scanner.nextInt();
        tempNum = num;
        while (tempNum != 0){
            total += tempNum % 10;
            tempNum /= 10;
        }
        System.out.println("Girilen "+num+" sayısının basamakları toplamı :"+total);
    }
}
