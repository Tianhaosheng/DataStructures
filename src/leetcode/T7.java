package leetcode;

import java.util.ArrayList;
import java.util.List;

public class T7 {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(dalao(x));
    }

    public static int reverse(int x) {

        List<Integer> arr = new ArrayList<Integer>();
        do{
            arr.add(0,x%10);
            x /= 10;
        }while (x!=0);
        System.out.println(arr);
        long y = 0;
        long k = 1;
        for(int i = 0;i < arr.size();i++){
            y += arr.get(i) * k;
            k *= 10;
            System.out.println(y);
        }
        System.out.println(y);
        return (int)y ==  y ? (int)y : 0;

    }

    public static int dalao(int x) {

        long y = 0;
        do{
            y = y*10 + x%10;
            x /= 10;

        }while (x!=0);

        return (int)y ==  y ? (int)y : 0;

    }
}
