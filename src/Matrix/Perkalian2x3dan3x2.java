package Matrix;
public class Perkalian2x3dan3x2 {
    public static void main(String[] args) {
        int[][] MatrixA = new int[][]{
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] MatrixB = new int[][]{
            {2, 1},
            {4, 3},
            {6, 5}
        };
        
        System.out.println("Cetak Matrix A :");
        for(int i=0; i<MatrixA.length; i++){
            for(int j=0; j<MatrixA[0].length; j++){
                System.out.print(MatrixA[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("Cetak Matrix B :");
        for(int i=0; i<MatrixB.length; i++){
            for(int j=0; j<MatrixB[0].length; j++){
                System.out.print(MatrixB[i][j]+ " ");
            }
            System.out.println(" ");
        }
    if(MatrixA[0].length == MatrixB.length){
        int[][] c = new int[MatrixA.length][MatrixB[0].length];
        System.out.println("Hasil Perkalian Matrix A * Matrix B");
        for(int i=0; i<MatrixA.length; i++){
        for(int j=0; j<MatrixB[0].length; j++){    
        for(int k=0; k<MatrixA[0].length; k++){
            c[i][j] += MatrixA[i][k] * MatrixB[k][j];
            
        }
        }
        }
        for(int[] C : c){
            for(int i : C){
                System.out.print(i+ " ");
            }
            System.out.println(" ");
        }
    }
    else {
        System.out.println("Ukuran Kolom A Tidak Sama Dengan Baris B");
    }
        System.out.println("Vita Karenina");
    }
}
