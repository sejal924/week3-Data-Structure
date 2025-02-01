package com.sortingalgorithm.heapsort;


class HeapSort {

        public void heapify(int arr[], int n, int i) {

            // Initialize largest as root
            int largest = i;

            // left index = 2*i + 1
            int l = 2 * i + 1;

            // right index = 2*i + 2
            int r = 2 * i + 2;

            // If left child is larger than root
            if (l < n && arr[l] > arr[largest]) {
                largest = l;
            }

            // If right child is larger than largest so far
            if (r < n && arr[r] > arr[largest]) {
                largest = r;
            }

            // If largest is not root
            if (largest != i) {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;

                // Recursively heapify the affected sub-tree
                heapify(arr, n, largest);
            }
        }

        // Main function to do heap sort
        public void heapSort(int arr[]) {
            int n = arr.length;

            // Build heap (rearrange array)
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }

            // One by one extract an element from heap
            for (int i = n - 1; i > 0; i--) {

                // Move current root to end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                // Call max heapify on the reduced heap
                heapify(arr, i, 0);
            }
        }

        // A utility function to print array of size n
        static void printArray(int arr[]) {
            System.out.print("---salary demands in ascending order using heap sort---");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
import java.util.Arrays;
class CountSort {
    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;
        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }
        int[] countArray = new int[M + 1];
        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }
        int[] outputArray = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }
        return outputArray;
    }
}
public class SortStudentAges7 {
    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 12, 14, 10, 13, 17, 16, 15, 10};
        int[] sortedAges = CountSort.countSort(ages);
        System.out.println(Arrays.toString(sortedAges));
    }
}
