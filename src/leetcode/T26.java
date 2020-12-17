package leetcode;

import java.util.Arrays;

public class T26 {
    public static void main(String[] args) {

        int[] arr = {0,1,1,2};
        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 ||nums.length == 1){
            return nums.length;
        }
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[j] != nums[i]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}
