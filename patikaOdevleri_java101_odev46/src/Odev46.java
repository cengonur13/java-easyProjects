import java.util.Scanner;

public class Odev46 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static int[][] transpozeMatris(int[][] arr){
        int[][] traMatris = new int[arr[0].length][arr.length];
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                traMatris[j][i] = arr[i][j];
            }
        }

        return traMatris;
    }
    public static void main(String[] args) {
        int[][] matrix;
        int[][] transposeMatrix;
        int row, col;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısı : ");
        row = scanner.nextInt();
        System.out.print("Sütun sayısı : ");
        col = scanner.nextInt();

        matrix = new int[row][col];
        transposeMatrix = new int[col][row];

        System.out.println("Eleman Ekleme :");
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print("["+i+"]"+"["+j+"] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Oluşturulan Matris :");
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpoze : ");
        transposeMatrix = transpozeMatris(matrix);
        for (int i=0; i<transposeMatrix.length; i++){
            for (int j=0; j<transposeMatrix[i].length;j++){
                System.out.print(transposeMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
