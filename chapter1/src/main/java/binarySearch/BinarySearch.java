package main.java.binarySearch;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int firstIndex, int lastindex, int key) {
        Arrays.sort(arr);

        if (lastindex >= firstIndex){
            int midIndex = firstIndex + (lastindex - firstIndex) / 2;

            if (arr[midIndex] == key){
                return midIndex;
            }

            if (arr[midIndex] > key){
                return binarySearch(arr, firstIndex, midIndex - 1, key);
            } else {
                return binarySearch(arr, midIndex + 1, lastindex, key);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {90,20,30,40,50};
        int key = 40;
        int last=arr.length-1;
        int result = binarySearch(arr,0,last,key);

        if (result == -1) {
            System.out.println("Element is not found!");
        } else {
            System.out.println("Element is found at index: "+result);
        }
    }

}
