public class Odev43 {
    /**
     * @author Onur TAŞ, 2021...
     */
    static boolean isFind(int[] arr, int numb){
        for(int value : arr){
            if(value == numb){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,7,8,99,1,5,1,8,6,6,100,22,8,98,4,98,6,4,2};
        int[] duplicate = new int[arr.length];
        int index=0;

        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr.length;j++){
                if((i!=j) && (arr[i] == arr[j])){
                    if(!isFind(duplicate,arr[i]) && arr[i]%2 == 0){
                        duplicate[index++]=arr[i];
                        break;
                    }

                }
            }
        }
        //diziye burada da müdahale ederek çift sayıları ekrana yazdırabilirdik...
        for (int value : duplicate){
            if(value != 0){
                System.out.print(value+" ");
            }
        }
    }
}
