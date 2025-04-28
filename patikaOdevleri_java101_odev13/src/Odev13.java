import java.util.Scanner;

public class Odev13 {
    /**
     * @author Onur TAŞ, 2021...
     *
     * -Ay ve Gün bir fonksiyona parametre verilip doğruluğu kontrol edilebilir.(Daha Kullanışlı)
     * -For yapısı ile daha kısa kod yazılabilir idi...
     */
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;
        String[] aylar = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos",
                "Eylül","Ekim","Kasım","Aralık"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum Ayınızı Giriniz :");
        System.out.println("1- Ocak" +
                "         \n2- Şubat" +
                "         \n3- Mart" +
                "         \n4- Nisan" +
                "         \n5- Mayıs" +
                "         \n6- Haziran" +
                "         \n7- Temmuz" +
                "         \n8- Ağustos" +
                "         \n9- Eylül" +
                "        \n10- Ekim" +
                "        \n11- Kasım" +
                "        \n12- Aralık");
        System.out.print("Seçiminiz :");
        month = scanner.nextInt();

        if(!(month>=1 && month<=12)){
            System.out.println("Hatalı Giriş!");
            isError = true;
        } else {
            System.out.println(aylar[month-1]+" Ayının Hangi Günü :");
            day = scanner.nextInt();

            if(month == 1){ // Ocak
                if(day >= 1 && day <=31){
                    if(day<=21)
                        burc = "Oğlak";
                    else
                        burc = "Kova";
                }else{
                    isError = true;
                }
            }else if (month == 2){ // Şubat
                if(day >= 1 && day <=28){
                    if(day<=19)
                        burc = "Kova";
                    else
                        burc = "Balık";
                }else{
                    isError = true;
                }
            }else if (month == 3){ // Mart
                if(day >= 1 && day <=31){
                    if(day<=20)
                        burc = "Balık";
                    else
                        burc = "Koç";
                }else{
                    isError = true;
                }
            }else if (month == 4){ // Nisan
                if(day >= 1 && day <=30){
                    if(day<=20)
                        burc = "Koç";
                    else
                        burc = "Boğa";
                }else{
                    isError = true;
                }
            }else if (month == 5){ // Mayıs
                if(day >= 1 && day <=31){
                    if(day<=21)
                        burc = "Boğa";
                    else
                        burc = "İkizler";
                }else{
                    isError = true;
                }
            }else if (month == 6){ // Haziran
                if(day >= 1 && day <=30){
                    if(day<=22)
                        burc = "İkizler";
                    else
                        burc = "Yengeç";
                }else{
                    isError = true;
                }
            }else if (month == 7){ // Temmuz
                if(day >= 1 && day <=31){
                    if(day<=22)
                        burc = "Yengeç";
                    else
                        burc = "Aslan";
                }else{
                    isError = true;
                }
            }else if (month == 8){ // Ağustos
                if(day >= 1 && day <=31){
                    if(day<=22)
                        burc = "Aslan";
                    else
                        burc = "Başak";
                }else{
                    isError = true;
                }
            }else if (month == 9){ // Eylül
                if(day >= 1 && day <=30){
                    if(day<=22)
                        burc = "Başak";
                    else
                        burc = "Terazi";
                }else{
                    isError = true;
                }
            }else if (month == 10){ // Ekim
                if(day >= 1 && day <=31){
                    if(day<=22)
                        burc = "Terazi";
                    else
                        burc = "Akrep";
                }else{
                    isError = true;
                }
            }else if (month == 11){ // Kasım
                if(day >= 1 && day <=30){
                    if(day<=21)
                        burc = "Akrep";
                    else
                        burc = "Yay";
                }else{
                    isError = true;
                }
            }else if (month == 12){ // Aralık
                if(day >= 1 && day <=31){
                    if(day<=21)
                        burc = "Yay";
                    else
                        burc = "Oğlak";
                }else{
                    isError = true;
                }
            }
        }

        if(isError){
            System.out.println("Yanlış bilgi girdiniz...");
        }else {
            System.out.println("Burcunuz :"+burc);
        }
    }
}
