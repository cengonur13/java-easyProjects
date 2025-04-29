public class Odev40 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,99,100}; // ornek dizi
        double average=0.0;
        double total =0.0;


        for(int i=0; i< arr.length; i++){
            total += (double) 1/arr[i];
        }

        average = arr.length / total;
        System.out.println("Dizi elemanlarının Harmonik Serisi : "+total);
        System.out.println("Dizi elemanlarının Harmonik Ortalaması : "+average);
    }
}
