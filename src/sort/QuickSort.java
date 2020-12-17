package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5,6};
        System.out.println(Arrays.toString(quickSort(arr,0,arr.length-1)));

    }

    public static int[] quickSort(int[] arr,int left,int right){

        if(left < right){

            int index = getIndex(arr, left, right);
            quickSort(arr,left,index-1);
            quickSort(arr,index+1,right);

        }
        return arr;
    }

    public static int getIndex(int[] arr,int left,int right){

        int temp = arr[left];
        while(left<right){
            while (left<right&&arr[right]>temp){
                right--;
            }
            arr[left] = arr[right];
            while (left<right&&arr[left]<temp){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;


        return left;
    }
}
