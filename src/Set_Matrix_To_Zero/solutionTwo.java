package Set_Matrix_To_Zero;

public class solutionTwo {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4} , {5,0,7,8} , {0,10,11,12} , {13,14,15,0}};
        setZeros(matrix);
    }

    static void setZeros(int[][] matrix){
        boolean first = false;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j < matrix[0].length;j++ ){
                if(i == 0){
                    if(matrix[i][j] == 0){
                        first = true;
                    }
                }else if(matrix[i][j] == 0){
                    matrix[0][j] = 0; //setting for row
                    matrix[i][0] = 0; //setting for col
                }
            }
        }

        //start from below because what if first row is entirely 0, and every thing else is non-0, then also
        //entire matrix will become 0
        for(int i = matrix.length - 1;i>=0;i--){
            for(int j = matrix[0].length - 1;j>=0 ;j--){
                if(i == 0){
                    if(first){
                        matrix[0][j] = 0;
                    }
                }else if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }
}
