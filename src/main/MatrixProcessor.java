public class MatrixProcessor {
    public static void main(String[] args) {
        try {
            int rows = 3;
            int cols = 4;
            double[][] matrixA = new double[rows][cols];
            double[][] matrixC;

            initializeMatrix(matrixA);

            System.out.println("Matrix A:");
            printMatrix(matrixA);

            matrixC = transposeMatrix(matrixA);
            System.out.println("Transposed Matrix C (BT):");
            printMatrix(matrixC);

            double average = calculateAverage(matrixC);
            System.out.println("Average value of Matrix C: " + average);

        } catch (Exception ex) {
            System.err.println("An error occurred: " + ex.getMessage());
        }
    }

    // Fill the matrix with random values
    private static void initializeMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random() * 100;
            }
        }
    }

    // Transpose the matrix
    private static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    // Print the matrix
    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f ", value);
            }
            System.out.println();
        }
    }

    // Calculate the average value of a matrix
    private static double calculateAverage(double[][] matrix) {
        double sum = 0;
        int count = 0;

        for (double[] row : matrix) {
            for (double value : row) {
                sum += value;
                count++;
            }
        }

        return sum / count;
    }
}
