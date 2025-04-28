import java.util.Scanner;

public class Odev19 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int limit, result=0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen sınır değerini giriniz : ");
        limit = scanner.nextInt();

        System.out.println("Girilen Limite Göre 4'ün Katları :" +
                "\n----------\n");

        for (int i=1; i<=limit ; i*=4){
            System.out.println("4^"+result+" : "+i);
            result++;
        }
        result = 0;
        System.out.println("\nGirilen Limite Göre 5'in Katları :" +
                "\n----------\n");

        for (int i=1; i<=limit ; i*=5){
            System.out.println("55^"+result+" : "+i);
            result++;
        }

    }
}
