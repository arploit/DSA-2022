package Matrix;

public class Search_2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
      if(matrix.length == 0) return false;

      int n = matrix.length, m = matrix[0].length,
              lo = 0,
        high= (n*m)-1;

      while(lo <=high){
          int mid = (lo + (high-lo)/2);
          if(matrix[mid/m][mid%m] == target) return true;

          else if (matrix[mid/m][mid%m] < target) lo = mid + 1;
          else high = mid -1;

      }

        return false;
    }

    public static void main(String[] args) {
        int [][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(
                searchMatrix(matrix,3)
        );
    }
}
