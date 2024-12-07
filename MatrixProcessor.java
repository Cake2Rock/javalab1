import java.util.Random;

public class MatrixProcessor {
    public static void main(String[] args) {
        try {
            int rows = 3;
            int cols = 3;
            int[][] matrixX = new int[rows][cols];
            int[][] matrixY = new int[rows][cols];

            Random rand = new Random();

            fillMatrix(matrixX, rand);
            fillMatrix(matrixY, rand);

            System.out.println("Matrix X:");
            displayMatrix(matrixX);
            System.out.println("Matrix Y:");
            displayMatrix(matrixY);

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
}
