package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {101,34,119,1,-1,89};
        insertionSort(arr);
    }
    public static int[] insertionSort(int[] arr){
        for(int i = 1;i < arr.length;i++){
            int insert = arr[i];
            int index = i - 1;
            while(index >= 0 && insert < arr[index]){
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index+1] = insert;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
