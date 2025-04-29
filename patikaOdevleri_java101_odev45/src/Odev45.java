public class Odev45 {
    /**
     * @author Onur TAŞ, 2021...
     */
    static boolean isFind(int[] arr, int numb, int index){
        for (int i=0; i<arr.length;i++){
            if((arr[i] == numb ) && (i != index)){
                return true;
            }
        }
        return false;
    }

    static int counts(int[] arr, int numb, int index){
        int repeat=0;
        for (int i=0; i<arr.length; i++){
            if ((arr[i] == numb)){
                repeat++;
            }
        }
        return repeat;
    }
    static int counts(int[] arr, int numb){
        int repeat=0;
        for (int i=0; i<arr.length; i++){
            if ((arr[i] == numb)){
                repeat++;
            }
        }
        return repeat;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,20,10,10,20,5,20};
        int[] duplicate = new int[arr.length];
        int index=0;

        System.out.println("Tekrar Sayıları : ");

        for (int i=0; i<arr.length; i++){
            if(isFind(arr,arr[i],i)){
                if(!isFind(duplicate,arr[i],i)){
                    System.out.println(arr[i]+" sayısı "+counts(arr,arr[i],i)+" kere tekrar etti.");
                    duplicate[index++]=arr[i];
                }
            }
        }
        // 1 kere girilmiş sayılarda isteniyormuş :D
        for(int i=0; i<arr.length; i++){
            if(counts(arr,arr[i]) == 1){
                System.out.println(arr[i]+" sayısı 1 kere tekrar etti.");
            }
        }
    }
}
