package leetcode;

import java.util.ArrayList;

public class T3 {
    public static int lengthOfLongestSubstring(String s) {
        ArrayList<Character> arrayList = new ArrayList<Character>();
        int max = 0;
        for(int i = 0;i < s.length();i++){

            int j = i;
            while (j < s.length() && !arrayList.contains(s.charAt(j))  ){
                arrayList.add(s.charAt(j));
                j++;
            }
            max = Math.max(max,arrayList.size());
        }
        return max;
    }
    public static int lengthOfLongestSubstring2(String s) {
        int start = 0,end = 0,max = 0;
        while(end < s.length()){
            if(start == end && end+1<s.length()) end++;
            if(s.substring(start,end ).contains(String.valueOf(s.charAt(end)))){
                start = s.substring(0,end ).indexOf(String.valueOf(s.charAt(end)),start) + 1;
            }
            max = Math.max(max,end - start + 1);
            end++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));

    }
}
