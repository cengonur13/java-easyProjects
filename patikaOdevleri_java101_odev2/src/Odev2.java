import java.util.Scanner;

public class Odev2 {

    /**
     * @author Onur TAŞ, 2021
     */

    public static void main(String[] args) {
        double tutar;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Tutarı Giriniz : ");
        tutar = scanner.nextDouble();

        if( (tutar >0.0) && (tutar <= 1000.0) ){
            System.out.print("Girilen Tutar : "+tutar+"\n");
            System.out.print("KDV Oranı : 0.18"+"\n");
            System.out.print("KDV'li Tutar : "+(tutar * 1.18));
        }
        else if(tutar > 1000.00){
            System.out.print("Girilen Tutar : "+tutar+"\n");
            System.out.print("KDV Oranı : 0.08"+"\n");
            System.out.print("KDV'li Tutar : "+(tutar * 1.08));
        }else{
            System.out.println("Lutfen Tutar Miktarını Doğru Giriniz...");
        }

    }
}
