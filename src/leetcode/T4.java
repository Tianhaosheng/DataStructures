package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class T4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double mid = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length;i++) list.add(nums1[i]);
        for(int i = 0; i < nums2.length;i++) list.add(nums2[i]);
        int temp = 0;
        boolean flag = false;
        for(int i = 0;i < list.size() - 1;i++){
            for(int j = 0; j < list.size() - 1 - i;j++){
                if(list.get(j) > list.get(j + 1)){
                    temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                    flag = true;
                }
            }
            if(flag == false)
                break;
            else
                flag = false;
        }
        System.out.println(list.size()%2);
        if(list.size()%2 == 0){
            mid = (double)(list.get(list.size()/2) + list.get(list.size()/2-1))/2;
            System.out.println(list.get(list.size()/2));
            System.out.println(list.get(list.size()/2-1));
        }else {
            mid = list.get(list.size()/2);
        }
        System.out.println(list);
        return mid;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {-1,3};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
