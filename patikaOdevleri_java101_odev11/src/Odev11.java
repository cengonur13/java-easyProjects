import java.util.Scanner;

public class Odev11 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int sicaklik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sıcaklık Değeri :");
        sicaklik = scanner.nextInt(); // double sayı girilirse çöker...

        System.out.println("Oneri Olusturuluyor..." +
                "\n******************************");
        if(sicaklik < 5){
            System.out.println("-> Kayak yapabilirsiniz... Sıcaklık oldukça ideal!");
        }else if (sicaklik >=5 && sicaklik < 15){
            System.out.println("-> Sinemaya gidebilirsiniz... Hava gayet iyi!");
        }else if (sicaklik >= 15 && sicaklik < 25){
            System.out.println("-> Piknik yapabilirsiniz... Hava mükemmel!");
        }else {
            System.out.println("-> Yüzmeye gidebilirsiniz... Hava yüzmek için güzel!");
        }
    }
}
