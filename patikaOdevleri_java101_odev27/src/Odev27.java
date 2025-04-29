import java.util.Scanner;

public class Odev27 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        //diziler kullanıp max ve min = dizi[0] ilk ataması daha mantıklı olur idi...
        int n,max=0,min=99999999,number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı girilecek :");
        n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i+". Sayıyı giriniz :");
            number = scanner.nextInt();
            if(number>max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println("En büyük sayı : "+max);
        System.out.println("En küçük sayı : "+min);
    }
}
