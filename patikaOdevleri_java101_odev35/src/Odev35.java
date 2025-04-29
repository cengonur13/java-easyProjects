import java.util.Scanner;

public class Odev35 {
    /**
     * @author Onur TAŞ, 2021...
     */
    static int prime(int numb, int div){
        if(numb % div == 0){
            if(numb==2){
                return 1;
            }else
                return 0;
        }else if(div == 2){
            return 1;
        }else
            return prime(numb, div-1);
    }
    public static void main(String[] args) {
        int numb, result=0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        numb = scanner.nextInt();
        result = prime(numb,numb-1);

        if(result==0){
            System.out.println(numb+" sayısı ASAL değildir!");
        }else {
            System.out.println(numb+" sayısı ASALDIR!");
        }
    }
}
