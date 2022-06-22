package Matrix;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> TravesalArray= new ArrayList<>();
        int direction = 0,top = 0, right = matrix[0].length-1, left = 0,bottom =matrix.length-1,i;

        while(top <= bottom && left<=right){
        if(direction == 0){
            for(i=left;i<=right;i++){
                TravesalArray.add(matrix[top][i]);
            }
               top++;

        } else if(direction == 1){
            for(i=top;i<=bottom;i++){
                TravesalArray.add(matrix[(i)][right]);
            }
            right --;
        }
        else if(direction == 2){
            for(i=right;i>=left;i--){
                TravesalArray.add(matrix[bottom][i]);
            }
            bottom --;
        }
        else if(direction == 3){
            for(i=bottom;i>=top;i--){
                TravesalArray.add(matrix[i][left]);
            }
            left ++;
        }
            direction=(direction+1)%4;
        }


    return TravesalArray;
    }

    public static void main(String[] args) {
        Spiral_Matrix list = new Spiral_Matrix();
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println( list.spiralOrder(matrix));
    }


}
