import java.util.Scanner;

public class Odev23 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int numb;
        double total = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harmonik sayılar :" +
                "\n1+(1/2)+(1/3)+(1/4)+... şeklinde n=0 ve n=∞ arasındaki 1/n toplamı ile hesaplanır.");
        System.out.print("N sayısını giriniz :");
        numb = scanner.nextInt();

        // ornek for ile yapıldığından proje while ile tamamlanmıştır.
        // ideal kullanım, for dongusu kullanmak...
        int i=1;
        while (i<=numb){
            total += 1.0 / i;
            i++;
        }
        System.out.println("Girilen "+numb+" değerine göre " +
                "Harmonik sayılar toplamı :"+total);
    }
}
