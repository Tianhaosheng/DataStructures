package leetcode;

public class T9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1211));
    }

    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        String s = x+"";
        for(int i = 0;i<s.length()/2;i++){
            while(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
