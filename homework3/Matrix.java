import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matrix A");
        System.out.print("Enter number of Matrix A's rows: ");
        int rowA = sc.nextInt();
        System.out.print("Enter number of Matrix A's columns: ");
        int colA = sc.nextInt();
        int[][] matrixA = new int[rowA][colA];

        System.out.println("Matrix B");
        System.out.print("Enter number of Matrix B's rows: ");
        int rowB = sc.nextInt();
        System.out.print("Enter number of Matrix B's columns: ");
        int colB = sc.nextInt();
        int[][] matrixB = new int[rowB][colB];


        //void createRandomMatrix
        createRandomMatrix(matrixA);
        createRandomMatrix(matrixB);

        //int[][] createRandomMatrix
        matrixA = createRandomMatrix(rowA, colA);
        matrixB = createRandomMatrix(rowB, colB);

        //print
        System.out.println("Matrix A: ");
        print(matrixA);

        System.out.println("Matrix B: ");
        print(matrixB);

        System.out.println("Sum: ");
        print(add(matrixA, matrixB));

        System.out.println("Subtraction: ");
        print(subtract(matrixA, matrixB));

        System.out.println("Multiplication: ");
        print(mutiply(matrixA, matrixB));

        System.out.println("Have same dimension ? : " + haveSameDimension(matrixA, matrixB));
    }

    public static void createRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] tempMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tempMatrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return tempMatrix;
    }

    public static void print(int[][] matrix) {

        if (matrix == null) {
            System.out.println("Cannot calculate");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void print(double[][] matrix) {

        if (matrix == null) {
            System.out.println("Cannot calculate.");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        } else if (matrix1[0].length != matrix2[0].length) {
            return false;
        }
        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        } else if (matrix1[0].length != matrix2[0].length) {
            return false;
        }
        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {

        if (matrix1 == null || matrix1.length == 0) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int[][] resultSum = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultSum;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {

        if (matrix1 == null || matrix1.length == 0) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        double[][] resultSum = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultSum;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {

        if (matrix1 == null || matrix1.length == 0) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int[][] subtractMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                subtractMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return subtractMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {

        if (matrix1 == null || matrix1.length == 0) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        double[][] subtractMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                subtractMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return subtractMatrix;
    }

    public static int[][] mutiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        } else {
            int[][] mutiMatrix = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    mutiMatrix[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        mutiMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return mutiMatrix;
        }
    }

    public static double[][] mutiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        } else {
            double[][] mutiMatrix = new double[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    mutiMatrix[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        mutiMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return mutiMatrix;
        }
    }
}
