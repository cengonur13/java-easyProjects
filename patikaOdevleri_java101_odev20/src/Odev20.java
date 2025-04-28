import java.util.Scanner;

public class Odev20 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int n, r, nFact=1, rFact=1 ,nRFact=1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kombinasyon\n--------");
        System.out.println("N'nin r'li kombinasyonu " +
                "C(n,r)=n!/(r!*(n-r)!) formülü ile hesaplanır.");

        System.out.print("N sayısını giriniz : ");
        n = scanner.nextInt();
        System.out.print("R sayısını giriniz : ");
        r = scanner.nextInt();

        for(int i =1; i<=n; i++){
            nFact *= i;
        }
        System.out.println("n! = "+nFact);

        for(int i =1; i<=r; i++){
            rFact *= i;
        }
        System.out.println("r! = "+rFact);

        for(int i =1; i<=(n-r); i++){
            nRFact *= i;
        }
        System.out.println("(n-r)! = "+nRFact);
        System.out.println("Sonuç Hesaplanıyor...");
        System.out.println(n+"'nin "+r+"'li kombinasyonu = "+(nFact/(rFact*nRFact)));



    }
}
