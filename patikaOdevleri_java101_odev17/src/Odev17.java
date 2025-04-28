import java.util.Scanner;

public class Odev17 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int num, bolen=0, toplam=0;
        double ort;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen sayı giriniz :");
        num = scanner.nextInt();

        for(int i=1; i <= num; i++){
            if((i%3==0) && (i%4==0)){
                System.out.println(i+" -> 3 ve 4'e tam bölünür");
                toplam += i;
                bolen++;
            }
        }
        ort = toplam / bolen;
        System.out.println("1 den "+num+"'e kadar 3 ve 4'e tam bölünen sayıların" +
                " toplamının ortalaması :"+ort);
    }
}
