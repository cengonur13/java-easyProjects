import java.util.Scanner;

public class Odev12 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz :");
        num1 = scanner.nextInt();
        System.out.print("2. sayıyı giriniz :");
        num2 = scanner.nextInt();
        System.out.print("3. sayıyı giriniz :");
        num3 = scanner.nextInt();

        System.out.println("Sayılar küçükten büyüğe sıralanıyor...");
        System.out.print("Sıralanmış Sonuç :");

        if(num1<num2 && num1<num3){ // num1 -> smallest numb
            if(num2<num3){
                System.out.println(num1+" < "+num2+" < "+num3);
            }else {
                System.out.println(num1+" < "+num3+" < "+num2);
            }
        }else if (num2<num1 && num2<num3){ // num2 -> smallest numb
            if(num1<num3){
                System.out.println(num2+" < "+num1+" < "+num3);
            }else {
                System.out.println(num2+" < "+num3+" < "+num1);
            }
        }else { // num3 -> smallest numb
            if (num1<num2){
                System.out.println(num3+" < "+num1+" < "+num2);
            }else {
                System.out.println(num3+" < "+num2+" < "+num1);
            }
        }
    }
}
