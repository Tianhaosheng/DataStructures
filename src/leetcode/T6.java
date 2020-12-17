package leetcode;

import java.util.ArrayList;

public class T6 {

    public static void main(String[] args) {

        String s = "LEETCODEISHIRING";
        String convert = convert(s, 4);
        System.out.println(convert);
    }


    public static String convert(String s, int numRows) {
        if(s.length() == 0 && s == "") return s;
        StringBuilder ss = new StringBuilder();
        StringBuilder[] array = new StringBuilder[numRows];
        for(int i = 0;i<numRows;i++){
            array[i] = new StringBuilder();
        }
        for(int i = 0;i<s.length();i++){
            int j = i % (2*numRows - 2);
            if(j < numRows){
                array[j].append(s.charAt(i));
            }else {
                int k = 2*numRows - 2 - j;
                array[k].append(s.charAt(i));
            }
        }
        for(int i = 0;i<numRows;i++){
            ss.append(array[i]);
        }

        return ss.toString();
    }
}
