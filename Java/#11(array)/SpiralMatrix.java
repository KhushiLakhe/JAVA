import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        
        // Step 2: Input elements into the matrix
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < rows; i++) { // rows
            for(int j = 0; j < cols; j++) { // cols
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 3: Initialize boundaries
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        System.out.println("Spiral Order Output:");

        // Step 4: Traverse in spiral order
        while(top <= bottom && left <= right) {
            
            // Move left to right (top row)
            for(int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // move down

            // Move top to bottom (right column)
            for(int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // move left

            // Move right to left (bottom row), only if there's a row left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // move up
            }

            // Move bottom to top (left column), only if there's a column left
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // move right
            }
        }

        sc.close();
    }
}