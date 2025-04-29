
import java.util.Scanner;

public class Odev33 {
    /**
     * @author Onur TAŞ, 2021...
     */


    static void menu(){
        System.out.println("1- Toplama İşlemi" +
                "\n2- Çıkarma İşlemi" +
                "\n3- Çarpma İşlemi" +
                "\n4- Bölme İşlemi" +
                "\n5- Üslü Sayı İşlemleri" +
                "\n6- Faktoriyel İşlemi" +
                "\n7- Mod İşlemi" +
                "\n8- Dikdortgen Alan ve Çevre İşlemleri");
        System.out.println("*********************");
    }
    static void sum(){
        int result=0, i=1, number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çıkış için -> 0");
        while (true){
            System.out.print(i+". sayı :");
            number = scanner.nextInt();
            result += number;
            if (number == 0){
                break;
            }
            i++;
        }
        System.out.println("Girilen "+i+" adet sayı toplamı : "+result);
    }
    static void minus(){
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayı :");
        num1 = scanner.nextInt();
        System.out.print("2. Sayı :");
        num2 = scanner.nextInt();
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }
    static void times(){
        int result=1, number, i=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çıkış için -> 1");
        while (true){
            System.out.print(i+". sayı :");
            number = scanner.nextInt();

            if(number == 0){
                result = 0;
                break;
            }else if(number == 1){
                break;
            }
            result *= number;
            i++;
        }
        System.out.println("Çarpım sonucu : "+ result );
    }
    static void divided(){
        int num1, num2;
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bolunen Sayı : ");
        num1 = scanner.nextInt();
        System.out.print("Bolen Sayı : ");
        num2 = scanner.nextInt();

        if(num2 == 0){
            System.out.println("0'a bölme hatası... İşlem sonlandırıldı!");
        }else {
            result = num1 / num2;
            System.out.println("Sonuc : "+result);
        }
    }
    static void power(){
        int base, exponent, result=1;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Taban : ");
        base = scanner.nextInt();
        System.out.print("Us : ");
        exponent = scanner.nextInt();
        for(int i=1; i<= exponent; i++){
            result *= base;
        }
        System.out.println(base+"^"+exponent+" = "+result);

    }
    static void fact(){
        int result=1, numb;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktoriyeli alınan sayı : ");
        numb = scanner.nextInt();

        for(int i=1; i<=numb; i++){
            result *= i;
        }
        System.out.println(numb+"! = "+result);
    }
    static void mod(){
        int numb, mod, result=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı : ");
        numb = scanner.nextInt();
        System.out.print("Mod : ");
        mod = scanner.nextInt();
        result = numb % mod;
        System.out.println(numb+" % "+mod+" = "+result);


    }
    static void rectangle(){
        int edge1, edge2, area, perimeter;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uzun kenar : ");
        edge1 = scanner.nextInt();
        System.out.print("Kısa kenar : ");
        edge2 = scanner.nextInt();
        if(edge1==0 || edge2==0){
            System.out.println("Yanlış kenar bilgisi... İşlem sonlandırıldı!");
        }else {
            area = edge1*edge2;
            perimeter = 2 * (edge1+edge2);
            System.out.println("Çevre : "+perimeter);
            System.out.println("Alan : "+area);
        }

    }
    public static void main(String[] args){
        int select;
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);

        while (isTrue){
            menu();

            System.out.print("Seçiminiz : ");
            select = scanner.nextInt();

            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Yanlış bir seçim yaptınız...");
                    isTrue = false;
            }
            System.out.println("-----------");
        }
        System.out.println("Hesap Makinesi Kapatıldı...");
    }
}
