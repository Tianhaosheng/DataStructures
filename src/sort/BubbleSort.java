package sort;

import java.util.Arrays;


//冒泡排序
public class BubbleSort {

    public static void main(String[] args) {


        int array[] = {1,3,4,5,11,10};

        int temp;
        boolean flag = false;
        for(int j = 0 ;j < array.length - 1; j++) {
            for(int i = 0;i < array.length - 1 - j;i++){
                if(array[i] > array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
            System.out.println(Arrays.toString(array));
            if(flag == false)
                break;
            else
                flag = false;

        }

    }
}
