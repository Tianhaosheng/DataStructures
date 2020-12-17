package leetcode;

public class T38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(3));
    }


    public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String s = "";
        String pre = countAndSay(n-1);
        for(int i = 0;i < pre.length();i++){
            int j = 0;
            char c = pre.charAt(i);
            while(i < pre.length() && pre.charAt(i) == c){
                i++;
                j++;
            }i--;
            s += j + "" + c;
        }
        return s;
    }


}
