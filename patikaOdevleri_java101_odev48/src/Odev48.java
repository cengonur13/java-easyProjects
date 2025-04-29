import java.util.Scanner;

public class Odev48 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static boolean isPalindrome1(String str){
        for(int i=0, j=str.length() -1; i<j; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str){
        String reverseStr ="";
        for (int i= str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }
        return (str.equals(reverseStr));
    }
    
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrom Kelime      : Tersten okunuşu, kendisi ile aynı kelimelere denir.");
        System.out.println("                        kavak, kabak, asa, ada gibi kelimeler örnek verilebilir...");
        System.out.print("Lütfen kelime giriniz : ");
        str = scanner.nextLine();

        if(isPalindrome2(str)){
            System.out.println("Girilen "+str+" kelimesi Palindromdur.");
        }else {
            System.out.println("Girilen "+str+" kelimesi Palindrom değildir...");
        }
    }
}
