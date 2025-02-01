package com.sortingalgorithm.selectionsort;

public class SelectionSort {

        public void selectionSort(int[] arr){
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {

                int min_idx = i;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[min_idx]) {

                        min_idx = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }

        public void printArray(int[] arr){
            System.out.println("---Students’ exam scores in ascending order using selection sort---");
                for(int i = 0;i<arr.length;i++) {
                    System.out.print(arr[i] + " ");
            }
        }
    }

