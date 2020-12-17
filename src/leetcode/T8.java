package leetcode;

public class T8 {


    public static void main(String[] args) {
        String s = "09+-";
        char c = s.charAt(2);
        int i = (int)c;
        System.out.println(i);
    }


    public int myAtoi(String s) {
        if(s.length() == 0 || s == "") return 0;
        int i = 0;
        while (s.charAt(i) == ' '){
            i++;
        }
        int k = (int)s.charAt(i);
        if(!(k >= 48 || k <= 57 || k == 43 || k==45)) return 0;
        
        return 0;
    }
}
