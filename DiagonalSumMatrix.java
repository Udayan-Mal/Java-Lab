// 19. Write a Java Program to Compute the Sum of Diagonals of a Matrix

import java.util.Scanner;

public class DiagonalSumMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the square matrix
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();

        // Declare and initialize the matrix
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Compute the sums of both diagonals
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];             // Primary diagonal elements: row == column
            secondaryDiagonalSum += matrix[i][n - 1 - i];   // Secondary diagonal elements: row + column = n - 1
        }

        // Display the matrix (optional for clarity)
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display the results
        System.out.println("Sum of Primary Diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);

        scanner.close();
    }
}
