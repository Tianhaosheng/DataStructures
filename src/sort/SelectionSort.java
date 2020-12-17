package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }


    public static int[] selectionSort(int[] arr){

        int min,minIndex;
        for(int i = 0;i < arr.length - 1;i++){
            min = arr[i];
            minIndex = i;
            for(int j = i;j < arr.length - 1;j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];

            arr[i] = min;

        }
        return arr;
    }
}
