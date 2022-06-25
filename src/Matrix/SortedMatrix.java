package Matrix;

import java.util.Arrays;

public class SortedMatrix {

    //https://practice.geeksforgeeks.org/problems/sorted-matrix2333/1#
    static int[][] sortedMatrix(int N, int mat[][]) {
        // code here
        int arr[] = new int[N*N];
        int k=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[k++] = mat[i][j];
            }
        }
        Arrays.sort(arr);
        k=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                mat[i][j]=arr[k++];
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int N=4;
        int [][] Mat={{10,20,30,40},
                {15,25,35,45},
        {27,29,37,48},
    {32,33,39,50}};

        System.out.println(sortedMatrix(N,Mat));

    }
}
