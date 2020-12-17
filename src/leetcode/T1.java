package leetcode;

import com.sun.javafx.scene.control.behavior.TwoLevelFocusBehavior;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,11,10};
        int[] ints = twoSum(arr, 5);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        for(int i = 0;i < nums.length - 2;i++){
            for(int j = i + 1;j < nums.length - 1;j++){
                if(nums[i]+nums[j] == target){
                     arr = new int[]{i,j};
                    break;

                }
            }
        }
        return arr;
    }
}
