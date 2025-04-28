import java.util.Scanner;

public class Odev16 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int yil;
        boolean isLeapYear = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl giriniz :");
        yil = scanner.nextInt();

        if(yil%4==0){
            if(yil%100==0){
                if(yil%400==0){
                    isLeapYear = true;
                }
            }
            isLeapYear = true;
        }
        if(isLeapYear){
            System.out.println(yil+" bir artık yıldır...");
        }else {
            System.out.println(yil+" bir artık yıl değildir!");
        }
    }
}
