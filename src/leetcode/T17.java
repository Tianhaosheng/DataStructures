package leetcode;

import javax.security.sasl.SaslServer;
import java.util.ArrayList;
import java.util.List;

public class T17 {


    public static void main(String[] args) {
        List<String> strings = letterCombinations("234");
        System.out.println(strings);
//        String s = "3";
//        System.out.println(s.substring(1));
//        System.out.println(s.substring(1).length());
    }

    public static List<String> letterCombinations(String digits) {
        String[] strings = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> res = new ArrayList<>();
        if(digits.length()==0 || digits == "") return res;
        backtrack(res,digits,strings,"",digits.length());
        return res;
    }

    public static void backtrack(List res,String digits,String[] strings,String s,int length){

        for(char c : strings[(digits.charAt(0)-'0')].toCharArray()){
            String ss = s + c;
            if(digits.length()>1){
                String digitss = digits.substring(1);
                backtrack(res,digitss,strings,ss,length);
            }
            if(ss.length()<length) continue;
            res.add(ss);
        }
    }
}
