package leetcode;

public class T58 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a  "));
    }

    public static int lengthOfLastWord(String s) {
        int l = 0;
        if(s.length() == 0){
            return 0;
        }
        int i = s.length()-1;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while( i >= 0 && s.charAt(i) != ' ' ){
            i--;
            l++;
        }
        return l;
    }
}
