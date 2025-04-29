import java.util.Scanner;

public class Odev24 {
    /**
     * @author Onur TAŞ, 2021...
     */

    public static void main(String[] args) {
        int numb;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmas şekli için basamak değerini giriniz :");
        numb = scanner.nextInt();

        for(int i=1; i<= numb; i++){
            for(int k=1; k<=(numb-i); k++){
                System.out.print(" ");
            }
            for (int j=1; j<= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=numb-1; i>=1; i--){
            for (int k=1; k<=(numb-i);k++){
                System.out.print(" ");
            }
            for (int j=1; j<= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
