// 1. Write a java program to reverse an array.
import java.util.*;

import java.util.Scanner;

public class _1ReverseArray {

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers towards the center
            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display original array
        System.out.println("Original Array:");
        printArray(arr);

        // Reverse the array
        reverseArray(arr);

        // Display reversed array
        System.out.println("Reversed Array:");
        printArray(arr);

        scanner.close();
    }
}
