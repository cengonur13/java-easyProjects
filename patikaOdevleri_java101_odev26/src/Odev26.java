import java.util.Scanner;

public class Odev26 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int num1, num2;
        int ebob=1,ekok=1;
        boolean isContunie = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1.Sayı :");
        num1 = scanner.nextInt();
        System.out.print("2.Sayı :");
        num2 = scanner.nextInt();
        if(num1 <= num2){
            //EBOB
            int k = num1;
            while (isContunie){
                if((num1%k == 0) && (num2%k == 0)){
                    ebob = k;
                    isContunie = false;
                }
                k--;
            }
            //EKOK
            k=1;
            while (k <= (num1*num2)){
                if((k%num1 == 0) && (k%num2 == 0)){
                    ekok = k;
                    break;
                }
               k++;
            }

        }else{
            //EBOB
            int k = num2;

            while (isContunie){
                if((num2%k == 0) && (num1%k == 0)){
                    ebob = k;
                    isContunie = false;
                }
                k--;
            }
            //EKOK
            k=1;
            while (k <= (num1*num2)){
                if((k%num2 == 0) && (k%num1 == 0)){
                    ekok = k;
                    break;
                }
                k++;
            }

        }
        System.out.println("EBOB : "+ebob);
        System.out.println("EKOK : "+ekok);
        System.out.println("Sonuçların Sağlaması : ekok = (num1*num2)/ebob");
        System.out.println(ekok+" = "+((num1*num2)/ebob));
    }
}
