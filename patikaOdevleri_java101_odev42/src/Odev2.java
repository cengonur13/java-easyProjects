public class Odev2 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        String[][] letterB = new String[7][4];
        String[][] letterP = new String[7][4];

        for(int i=0; i< letterB.length; i++){
            for (int j=0; j < letterB[i].length; j++){
                if(i==0 || i==3 || i==6){
                    letterB[i][j] = " * ";
                }else if (j==0 || j==3){
                    letterB[i][j]=" * ";
                }
                else {
                    letterB[i][j]="   ";
                }
            }
        }

        for (int i=0; i< letterP.length; i++){
            for (int j=0; j< letterP[i].length; j++){
                if(i==0 || i==2){
                    letterP[i][j]=" * ";
                }else if ((j==0) || (j==3 && i<=2)){
                    letterP[i][j]=" * ";
                }else{
                    letterP[i][j]="   ";
                }
            }
        }

        for (int i=0; i< letterB.length; i++){
            for(int j=0 ; j<letterB[i].length; j++){
                System.out.print(letterB[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i=0; i< letterP.length; i++){
            for(int j=0 ; j<letterP[i].length; j++){
                System.out.print(letterP[i][j]);
            }
            System.out.println("");
        }
    }
}
