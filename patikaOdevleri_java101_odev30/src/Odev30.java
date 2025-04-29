public class Odev30 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        boolean isPrime = true;

        //1-100 arası asal sayılar -> n'e kadar için 100 yerine n yazarız...
        for(int i=2;i<=100;i++){

            for(int k=2; k<i;k++){
                if(i%k == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.print(i+" ");
            }
            isPrime = true;
        }
    }
}
