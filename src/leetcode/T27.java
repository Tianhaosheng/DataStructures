package leetcode;

public class T27 {
    public static void main(String[] args) {

        int[] arr = {3,1,1,3};
        System.out.println(removeDuplicates(arr,3));

    }

    public static int removeDuplicates(int[] nums,int val) {
        if(nums.length == 0 ||nums.length == 1){
            return nums.length;
        }
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }

        return j;
    }
}
