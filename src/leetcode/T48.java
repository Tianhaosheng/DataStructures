package leetcode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class T48 {

    public static void main(String[] args) {

        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }

    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
                matrix[n - 1 - j][n - 1 - i] = temp;
            }
        }
        for (int i = 0; i < (n >> 1); ++i){
            for (int j = 0; j < n; ++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }

        for(int[] a: matrix){

            System.out.println(Arrays.toString(a));
        }
    }
}
