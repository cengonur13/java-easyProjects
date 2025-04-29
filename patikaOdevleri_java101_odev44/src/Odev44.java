import java.util.Arrays;
import java.util.Scanner;

public class Odev44 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        number = scanner.nextInt();

        int[] arr = new int[number];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i=0; i<arr.length; i++){
            System.out.print((i+1)+". Elemanı : ");
            arr[i]= scanner.nextInt();
        }
        System.out.println("Dizinin Orjinal Hali  : ");
        System.out.print(Arrays.toString(arr)); // for ile kendimizde yazdırabilirdik...
        System.out.println("\n\nDizinin Sıralı Hali :");
        Arrays.sort(arr); // sort algoritmalarından kendimiz manuel olarak sıralatabilirdik...
        System.out.print(Arrays.toString(arr));

    }
}
