import java.util.Scanner;

public class Odev28 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int numb, total=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mukemmel Sayı : Bir sayının kendisi hariç, " +
                "kendisini tam bolen sayıları toplamı kendisine eşit sayıya denir. ");
        System.out.print("Bir sayı giriniz :");
        numb = scanner.nextInt();

        for(int i=1; i< numb; i++){
            if(numb%i == 0){
                total += i;
            }
        }
        if(total == numb){
            System.out.println(numb+" Mükemmel sayıdır.");
        }else {
            System.out.println(numb+" Mükemmel sayı değildir.");
        }
    }
}
