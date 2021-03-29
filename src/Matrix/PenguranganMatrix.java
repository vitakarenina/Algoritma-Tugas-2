package Matrix;
public class PenguranganMatrix {
    public static void main(String[] args) {
        int[][] MatrixA = {
            {16, 32},
            {64, 128},
            {192, 224}
        };
        int[][] MatrixB = {
            {8, 21},
            {31, 45},
            {87, 52}
        };
        if((MatrixA.length == MatrixB.length) && (MatrixA[0].length == MatrixB[0].length)){
            int [][] c = new int[MatrixA.length] [MatrixA[0].length];
            for(int i=0; i<MatrixA.length; i++) {
                for(int j=0; j<MatrixA[0].length; j++){
                    c[i][j] = MatrixA[i][j] - MatrixB[i][j];
                }    
            }
            for(int[]C: c){
                for(int q: C){
                    System.out.print(q+ " ");
                }
                System.out.println();
            }
        }
        System.out.println("Vita Karenina");
     } 
}
