// 2. Write a program in Java to sort numbers in ascending or descending order given by user.


// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.Collections;

// or 

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input array elements
        Integer[] arr = new Integer[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ask user for sorting preference
        System.out.print("Enter 'A' for Ascending or 'D' for Descending order: ");
        char choice = scanner.next().charAt(0);

        // Sorting based on user's choice
        if (choice == 'A' || choice == 'a') {
            Arrays.sort(arr); // Ascending order
            System.out.println("Array sorted in Ascending order:");
        } else if (choice == 'D' || choice == 'd') {
            Arrays.sort(arr, Collections.reverseOrder()); // Descending order
            System.out.println("Array sorted in Descending order:");
        } else {
            System.out.println("Invalid choice! Please enter 'A' or 'D'.");
            scanner.close();
            return;
        }

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
