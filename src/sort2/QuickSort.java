package sort2;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,11,10};
        quick(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr,int left,int right){

        if(left < right){
            int index = quickSort(arr, left, right);
            quick(arr,left,index - 1);
            quick(arr,index + 1,right);
        }
    }

    public static int quickSort(int[] arr,int left,int right){

        int temp = arr[left];

        while (left < right){
            while(arr[right] > temp && left < right){
                right--;
            }
            arr[left] = arr[right];

            while(arr[left] < temp && left <right){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;



        return left;
    }
}
