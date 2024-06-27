package com.monocept.arrays;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1;
        int[][] matrix2;

        System.out.println("Enter the size of the first matrix:");
        System.out.print("Enter number of rows: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns1 = scanner.nextInt();

        System.out.println("Enter the size of the second matrix:");
        System.out.print("Enter number of rows: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns2 = scanner.nextInt();

        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            scanner.close();
            return;
        }

        matrix1 = new int[rows1][columns1];
        matrix2 = new int[rows2][columns2];

        System.out.println("Enter the elements of the first matrix:");
        enterMatrixElements(scanner, matrix1);
        System.out.println("Entered first matrix:");
        printMatrix(matrix1);

        System.out.println("Enter the elements of the second matrix:");
        enterMatrixElements(scanner, matrix2);
        System.out.println("Entered second matrix:");
        printMatrix(matrix2);

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Resultant Matrix after multiplication:");
        printMatrix(resultMatrix);

        scanner.close();
    }

    public static void enterMatrixElements(Scanner scanner, int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;

        int[][] result = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
