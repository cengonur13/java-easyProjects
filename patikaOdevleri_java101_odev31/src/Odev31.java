import java.util.Scanner;

public class Odev31 {
    /**
     * @author Onur TAŞ,2021...
     */
    public static void main(String[] args) {
        int n, fib1=0, fib2=1,temp=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci Serisi\n---------" +
                "\n0-1-1-2-3-5-8-13... şeklinde devam eden, her elemanın kendisinden önceki" +
                "2 elemanın toplamından oluşan serilere denir.\nSayı, kendinden önceki sayıya " +
                "bölünerek \"Altın Oran\" a yaklaşır. ");
        System.out.println("----------\n");
        System.out.println("Fibonacci Serisinde hesaplanacak eleman sayısını giriniz :");
        n = scanner.nextInt();
        System.out.println("fib(n-2)  fib(n-1)  fib(n)");
        for(int i=1; i<=n; i++){
            System.out.println("  "+fib1+"     +    "+fib2+"     = "+(fib1+fib2));
            temp = fib2;
            fib2 += fib1;
            fib1 = temp;
        }

    }
}
