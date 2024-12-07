import java.util.Random;

public class MatrixProcessor {
    public static void main(String[] args) {
        try {
            int rows = 3;
            int cols = 3;
            int[][] matrixX = new int[rows][cols];
            int[][] matrixY = new int[rows][cols];
            int[][] resultMatrix = new int[rows][cols];

            Random rand = new Random();

            fillMatrix(matrixX, rand);
            fillMatrix(matrixY, rand);

            mergeMatrices(matrixX, matrixY, resultMatrix);

            System.out.println("Matrix X:");
            displayMatrix(matrixX);
            System.out.println("Matrix Y:");
            displayMatrix(matrixY);
            System.out.println("Matrix Result (X + Y):");
            displayMatrix(resultMatrix);

            int calculatedSum = computeColumnSum(resultMatrix); // Compute the required sum
            System.out.println("Sum of max elements in even columns and min in odd columns: " + calculatedSum);

        } catch (Exception ex) {
            System.err.println("An error occurred: " + ex.getMessage());
        }
    }

    // Fill the matrix with random values
    private static void fillMatrix(int[][] matrix, Random rand) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = rand.nextInt(10);
            }
        }
    }

    // Print the matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Add two matrices
    private static void mergeMatrices(int[][] matrix1, int[][] matrix2, int[][] result) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
    }

    // Compute the sum of max in even columns and min in odd columns
    private static int computeColumnSum(int[][] matrix) {
        int totalSum = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            int extremeValue = (col % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int[] row : matrix) {
                if (col % 2 == 0) {
                    extremeValue = Math.max(extremeValue, row[col]);
                } else {
                    extremeValue = Math.min(extremeValue, row[col]);
                }
            }
            totalSum += extremeValue;
        }
        return totalSum;
    }
}
