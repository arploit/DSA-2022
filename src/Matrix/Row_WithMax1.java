package Matrix;

//question - https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1#
/*
*
*
*  It's about the move, how you move in the array, Since array is sorted
*   we can start moving from left, once we can encounter 1 we move left
* and once we encounter 0 we move down once we have traversed whole row. we'll get the
* row with max zero
*
* TC: O(row+col.)
* SC:0(1)
*
* */

public class Row_WithMax1 {
    static int rowWithMax1s(int arr[][], int n, int m) {

        int maxN = 0, currentRow=-1,i,k;
        for(i = 0;i<n;i++){
            int sum=0;
            for(k=0;k<m;k++){
                sum = sum+arr[i][k];
            }
            if(sum > maxN ){
                maxN = sum;
                currentRow = i;
            }
        }
        return currentRow;
    }

    static int optimisedRowWithMax1s(int arr[][], int n, int m) {
        int i = 0 , j = m-1, maxRow = -1;

        while(i<n && j>=0){
            if(arr[i][j] == 1){
                maxRow = i;
                j--;
            }
            else{
                i++;
            }

        }

        return maxRow;
    }


    public static void main(String[] args) {
        int N = 4 , M = 4,
        Arr[][] = {{0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}};
        System.out.println(rowWithMax1s(Arr, N,M));
        System.out.println(optimisedRowWithMax1s(Arr, N,M));
    }
}
