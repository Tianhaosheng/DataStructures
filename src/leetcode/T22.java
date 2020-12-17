package leetcode;

import java.util.ArrayList;
import java.util.List;

public class T22 {

    public static void main(String[] args) {
        List<String> strings = generateParenthesis(3);
        System.out.println(strings);

    }

    static List<String> res = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        generate(n,n,"");
        return res;
    }

    public static void generate(int left,int right,String curStr){
        if(left == 0 && right == 0){
            res.add(curStr);
            return;
        }

        if(left > 0){
            generate(left-1,right,curStr+"(");
        }
        if(right > left){
            generate(left,right-1,curStr+")");
        }


    }
}
