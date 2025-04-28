import java.util.Scanner;

public class Odev9 {
    /**
     * @author Onur TAŞ, 2021...
     */

    public static void main(String[] args) {
        String userName, password;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı Adı :");
        userName = scanner.nextLine();
        System.out.println("Şifre :");
        password = scanner.nextLine();

        if ((userName.equals("patika")) && (password.equals("java101"))) {
            System.out.println("Başarılı bir şekilde giriş yaptınız...");
        } else {
            System.out.println("Giriş bilgileriniz hatalı!");
            System.out.println("1- Yeni Şifre Girişi" +
                    "         \n2-Çıkış" +
                    "         \nSeçiminiz :");
            // sayı dışında giriş yapılırsa çöker...

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("-----------");
                    System.out.println("Yeni Şifre Belirleyiniz : ");

                    password = scanner.next(); //.nextLine de program kapanıyor idi...

                    if (password.equals("patika")) {
                        System.out.println("Lutfen Eski Şifre Kullanmayınız...");
                    } else {
                        System.out.println("Şifre Oluşturuldu...");
                    }

                    break;
                case 2:
                    System.out.println("Çıkış yapıldı...");
                    break;
                default:
                    System.out.println("Yanlış Seçim! Çıkış yapıldı...");
            }
        }
    }
}

