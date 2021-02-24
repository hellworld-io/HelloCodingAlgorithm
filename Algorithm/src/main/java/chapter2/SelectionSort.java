package main.java.chapter2;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]){
                    index = j;
                }
            }

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};

        System.out.println("Before Selection Sort " + Arrays.toString(arr1));

        selectionSort(arr1);

        System.out.println("After Selection Sort " + Arrays.toString(arr1));
    }
}
