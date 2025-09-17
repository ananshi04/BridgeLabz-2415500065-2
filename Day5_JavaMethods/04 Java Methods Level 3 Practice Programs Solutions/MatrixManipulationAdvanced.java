// Question: Perform matrix manipulation operations: transpose, determinant, inverse

import java.util.Arrays;
import java.util.Random;

public class MatrixManipulationAdvanced {

    public static double[][] generateRandomSquareMatrix(int size) {
        Random random = new Random();
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = random.nextInt(10);  // Random values 0 to 9
        return matrix;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        int size = matrix.length;
        double[][] transposed = new double[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) return matrix[0][0];
        if (n == 2)
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double det = 0;
        for (int col = 0; col < n; col++) {
            double[][] subMatrix = new double[n - 1][n - 1];

            for (int i = 1; i < n; i++) {
                int subCol = 0;
                for (int j = 0; j < n; j++) {
                    if (j == col) continue;
                    subMatrix[i - 1][subCol++] = matrix[i][j];
                }
            }

            det += Math.pow(-1, col) * matrix[0][col] * determinant(subMatrix);
        }
        return det;
    }

    public static double[][] inverseMatrix(double[][] matrix) {
        int n = matrix.length;
        double det = determinant(matrix);
        if (det == 0) return null;

        double[][] cofactor = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double[][] subMatrix = new double[n - 1][n - 1];
                int r = 0;
                for (int row = 0; row < n; row++) {
                    if (row == i) continue;
                    int c = 0;
                    for (int col = 0; col < n; col++) {
                        if (col == j) continue;
                        subMatrix[r][c++] = matrix[row][col];
                    }
                    r++;
                }
                cofactor[i][j] = Math.pow(-1, i + j) * determinant(subMatrix);
            }
        }

        double[][] adjugate = transposeMatrix(cofactor);
        double[][] inverse = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                inverse[i][j] = adjugate[i][j] / det;

        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix)
            System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        int size = 3;  // Fixed 3x3 matrix
        double[][] matrix = generateRandomSquareMatrix(size);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose of Matrix:");
        displayMatrix(transposeMatrix(matrix));

        double det = determinant(matrix);
        System.out.printf("\nDeterminant: %.2f%n", det);

        if (det != 0) {
            System.out.println("\nInverse of Matrix:");
            displayMatrix(inverseMatrix(matrix));
        } else {
            System.out.println("\nMatrix is singular; inverse does not exist.");
        }
    }
}
