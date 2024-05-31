package questions.math;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int N = matrix.length-1;
        int n = (matrix.length) /2;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N-j][i];
                matrix[N-j][i] = matrix[N-i][N-j];
                matrix[N-i][N-j] = matrix[j][N-i];
                matrix[j][N-i] = temp;
            }
        }
        N=N+1;
        if(N%2==1){
            int i = 0;
            int j = N/2;
            N= N-1;
            for(i = 0; i < n; i++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N-j][i];
                matrix[N-j][i] = matrix[N-i][N-j];
                matrix[N-i][N-j] = matrix[j][N-i];
                matrix[j][N-i] = temp;
            }
        }
    }
}
