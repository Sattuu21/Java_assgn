package Assgn2;

public class q4 {
    public static void main(String [] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {3, 2, 1},
            {6, 5, 4},
            {17, 18, 19}
        };

        int[][] matrix3 = new int[3][3]; // Resultant matrix to store sum of matrix1 and matrix2

        // Adding matrix1 and matrix2 and storing the result in matrix3
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) { // Fixed the length check for columns
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Printing the resultant matrix3
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) { // Fixed the length check for columns
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println(); // Moved outside the inner loop to print each row correctly
        }
    }
}
