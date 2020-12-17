package leetcode;

public class T28 {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        if(needle.length()>haystack.length()){
            return -1;
        }
        int index = 0;
        for(int i = 0;i<haystack.length();i++){

            index = i;
            for(int j = 0;j < needle.length();j++){
                if(index==haystack.length()){
                    return -1;
                }
                if(j == needle.length() - 1 && haystack.charAt(index) == needle.charAt(j)){
                    return i;
                }
                if(haystack.charAt(index) != needle.charAt(j)){
                    break;
                }else {
                    index++;
                }
            }

        }
        return -1;
    }
}
