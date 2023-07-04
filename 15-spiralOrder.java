package CrackYourPlacement;

import java.util.ArrayList;
import java.util.List;

class spiralOrder1 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return spiral;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = columns - 1;
        int top = 0;
        int bottom = rows - 1;

        while (left <= right && top <= bottom) {
            // Traverse from left to right
            for (int j = left; j <= right; j++) {
                spiral.add(matrix[top][j]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;

            // Check if there are more rows and columns to traverse
            if (top <= bottom && left <= right) {
                // Traverse from right to left
                for (int j = right; j >= left; j--) {
                    spiral.add(matrix[bottom][j]);
                }
                bottom--;

                // Traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }

        return spiral;
    }
    public static void main(String[] args) {
              spiralOrder1 solution = new spiralOrder1();

        // Example 1
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        List<Integer> spiral1 = solution.spiralOrder(matrix1);
        System.out.println("Spiral Order (Example 1): " + spiral1);

        // Example 2
        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        List<Integer> spiral2 = solution.spiralOrder(matrix2);
        System.out.println("Spiral Order (Example 2): " + spiral2);

    }

}
