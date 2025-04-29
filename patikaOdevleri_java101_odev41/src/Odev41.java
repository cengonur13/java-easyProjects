import java.util.Arrays;
import java.util.Scanner;

public class Odev41 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,2,0};
        int numb;
        int maxNumb=-2147483648, minNumb=2147483647; // int veri tipi sınır değerleri girildi default olarak

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizi : "+ Arrays.toString(arr));
        System.out.print("Girilen Sayı : ");
        numb = scanner.nextInt();

        for(int i: arr){
            if (numb > i && maxNumb < i){
                maxNumb = i;
            }else if (numb < i && minNumb > i){
                minNumb = i;
            }
        }
        System.out.println("Girilen "+numb+" sayısından küçük en yakın sayı : "+maxNumb);
        System.out.println("Girilen "+numb+" sayısından büyük en yakın sayı : "+minNumb);
    }
}
