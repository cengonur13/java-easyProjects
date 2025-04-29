import java.util.Scanner;

public class Odev36 {
    /**
     * @author Onur TAŞ, 2021...
     */
    static void func(int n,int n2){
        System.out.print(n+" ");

        if(n<=0){
            // Döngü olmadan tersten yazım zor!
            while (n2 > n){
                n +=5;
                System.out.print(n+" ");
            }
        }else
            func(n-5,n2);

    }
    public static void main(String[] args) {
        int numb;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı : ");
        numb = scanner.nextInt();
        System.out.print("Çıktısı : ");
        func(numb,numb);
    }
}
