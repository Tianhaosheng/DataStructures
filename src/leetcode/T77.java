package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T77 {
    public static void main(String[] args) {

        List<List<Integer>> combine = combine(4, 2);
        System.out.println(combine);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        combines(n,k,1,res,new ArrayList());
        return res;
    }
    public static void combines(int n, int k,int begin,List res,List curList) {
        System.out.println(curList);
        if(curList.size() == k){
            res.add(new ArrayList<>(curList));
            return;
        }

        for(int i = begin;i < n + 1;i++){
            curList.add(i);
            combines(n,k,i+1,res,curList);
            curList.remove(curList.size()-1);
        }

    }
}
