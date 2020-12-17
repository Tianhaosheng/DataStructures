package sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {101,34,119,1,-1,89,6};
        System.out.println(Arrays.toString(shellSort(arr)));
        System.out.println(Arrays.toString(shellSort2(arr)));
    }


    public static int[] shellSort(int[] arr){
        int temp;
        for(int i = arr.length/2;i > 0;i /= 2){
            for(int j = i;j < arr.length;j++){
                for(int k = j - i;k >= 0;k-=i){
                    if(arr[k] > arr[k+i]){
                        temp = arr[k];
                        arr[k] = arr[k+i];
                        arr[k+i] = temp;
                    }
                }
            }
        }
        return arr;
    }

    public static int[] shellSort2(int[] arr){
        int temp;
        for(int i = arr.length/2;i > 0;i /= 2){
            for(int j = i;j < arr.length;j++){
                temp = arr[j];
                while(j - i >= 0 && temp < arr[j - i]){
                    arr[j] = arr[j-i];
                    j -= i;
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
}
