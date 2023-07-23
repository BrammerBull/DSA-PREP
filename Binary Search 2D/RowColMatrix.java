//Here we will search the Element in 2D matrix using Binary Search
import java.util.*;
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                        {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {28, 29, 37, 49},
                        {33, 34, 38, 50}

        };

        int target = 37;
        System.out.println("Target element is found at "+Arrays.toString(search(matrix, target))+ "position");
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while(row < matrix.length && col >= 0 ){
                if(matrix[row][col] == target){
                   return new int[]{row,col};
                }

                if(matrix[row][col] < target){
                    row++;  //we will move to next row because all elements in that row are smaller than target.
                }
                else{
                    col--;  //we will eliminate the column because all elements are greater than target in that column..
                }
        }
        return new int[]{-1,-1};
    }
}