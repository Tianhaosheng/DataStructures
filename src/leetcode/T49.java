package leetcode;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.sort;

public class T49 {

    public static void main(String[] args) {
        String[] strings ={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strings);
        System.out.println(lists);


    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(strs[i]);

        }
        System.out.println(map.values());
        return new ArrayList<>(map.values());
    }

}
