import java.util.Scanner;

public class Odev29 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen basamak sayısını giriniz : ");
        n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            //boşluk
            for(int k=1; k<= i-1; k++){
                System.out.print(" ");
            }
            //yıldız
            for (int j=1; j<= 2*(n-i)+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
