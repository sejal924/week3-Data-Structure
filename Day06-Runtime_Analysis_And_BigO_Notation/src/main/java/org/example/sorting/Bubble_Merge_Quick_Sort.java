package org.example.sorting;

public class Bubble_Merge_Quick_Sort {
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        boolean swap;
        for (int i = 0; i < len - 1; i++) {
                swap = false;
                for (int j = 0; j < len - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swap = true;
                    }
                }
                if (!swap) {
                    break;
                }
            }
    }

    public static void merge(int[] arr,int left,int mid,int right){
        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i = 0;i<n1;i++){
            leftArray[i] = arr[left+i];
        for(int j=0;j<n2;j++){
            rightArray[j]= arr[mid+1+j];
        }
        }
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(leftArray[i]> rightArray[j]){
                arr[k]= rightArray[j];
                j++;
            }
            else{
                arr[k]=leftArray[i];
                i++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(i<n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr,int left,int right){
        if(left<right){
          int mid = left+(right-left)/2;

          mergeSort(arr,left,mid);
          mergeSort(arr,mid+1,right);
          merge(arr,left,mid,right);
        }

    }

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1, high);
        }
    }
private static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i= low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
               int temp = arr[i];
               arr[i]= arr[j];
               arr[j]= temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;

}
    public static void main(String[] args){
         int[] arr = {1000,10000,1000000};
         for(int i: arr){
             int[] newArr = new int[i];
             for(int j = 0;j<newArr.length;j++){
                newArr[j]= (int)(Math.random()*100000);
             }

             double start,end;
             start = System.nanoTime();
             if(i!=1000000)
              bubbleSort(newArr);
             end = System.nanoTime();

             System.out.println();
            System.out.println("Time Taken by bubble sort: " +(end-start)/1000 +"ms");

             for(int j = 0;j<newArr.length;j++){
                 newArr[j]= (int)(Math.random()*100000);
             }

             start = System.nanoTime();
             mergeSort(newArr,0,newArr.length-1);
             end = System.nanoTime();

             System.out.println();
             System.out.println("Time Taken by merge sort: " +(end-start)/1000 +"ms");

             start = System.nanoTime();
             quickSort(newArr,0,newArr.length-1);
             end = System.nanoTime();

             System.out.println();
             System.out.println("Time Taken by quick sort: " +(end-start)/1000 +"ms");
         }
    }
}
