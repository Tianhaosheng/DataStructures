package leetcode;

public class T53 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int min = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(nums[i-1]<0) nums[i] +=nums[i-1];
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}
