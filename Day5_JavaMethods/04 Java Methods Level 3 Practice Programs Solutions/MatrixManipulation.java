// Question: Perform matrix manipulation operations: addition, subtraction, multiplication

import java.util.Arrays;
import java.util.Random;

public class MatrixManipulation {

    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = random.nextInt(10);  // Random values from 0 to 9
        return matrix;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];

        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];

        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = b.length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += a[i][k] * b[k][j];

        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        int[][] matrixA = generateRandomMatrix(2, 3);
        int[][] matrixB = generateRandomMatrix(2, 3);
        int[][] matrixC = generateRandomMatrix(3, 2);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        System.out.println("\nMatrix C:");
        displayMatrix(matrixC);

        System.out.println("\nAddition (A + B):");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("\nSubtraction (A - B):");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("\nMultiplication (A * C):");
        displayMatrix(multiplyMatrices(matrixA, matrixC));
    }
}
