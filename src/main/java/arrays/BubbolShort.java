package arrays;

import java.util.Arrays;

public class BubbolShort {

    public static void main(String[] args) {
        System.out.println("Sorted Array By Bubble Sort!");
        int[] num = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(num));
        // Call the sorting method (making it static or instantiating the class)
        bubbleSort(num);
        System.out.println("Sorted Array: " + Arrays.toString(num));
    }

    // Changed return type to void since sorting happens in-place
    public static void bubbleSort(int[] num) {
        if (num == null || num.length <= 1) {
            return;
        }
        int len = num.length;
        // Outer loop for passes
        for (int i = 0; i < len - 1; i++) {
            boolean swapped = false; // tracks if a swap happened
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < len - 1 - i; j++) {
                // Corrected: Compare adjacent elements (num[j] and num[j+1])
                if (num[j] > num[j + 1]) {
                    // Swap elements
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred during this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}