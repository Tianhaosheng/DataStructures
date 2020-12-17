package sort2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        bubbleSort(arr);
    }


    public static void bubbleSort(int[] arr){

        int temp;
        boolean flag = false;
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = 0;j < arr.length - 1 - i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }else {
                flag = false;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
