import java.util.Scanner;

public class Odev34 {
    /**
     * @author Onur TAŞ, 2021...
     */
    static int pow(int a, int b){

        if(b==0){
            return 1;
        }else if(b==1){
            return a;
        }else
        return a*pow(a,(b-1));
    }

    public static void main(String[] args) {
        int base, exponent, result =1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        base = scanner.nextInt();
        System.out.print("Üs değerini giriniz : ");
        exponent = scanner.nextInt();
        result = pow(base, exponent);
        System.out.println("Sonuç : "+result);
    }
}
