package Set_Matrix_To_Zero;

import java.sql.SQLOutput;

public class solutionOne {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0} , {3,4,5,2} , {1,3,1,5}};
        setZeros(matrix);
    }

    static void setZeros(int[][] matrix){
        int[] row = new int [matrix.length];
        int[] col = new int [matrix[0].length];

    //--------- populating row and col array-----------
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    col[j] = 1;
                    row[i] = 1;
                }
            }
        }

        //--------- adding 0 in row and col-----------
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(col[j] == 1 || row[i] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

        //---------print matrix-----------
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }


    }
}
