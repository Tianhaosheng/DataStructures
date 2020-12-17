package leetcode;

public class T14 {

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String s = "";
        int min = strs[0].length();
        for(int i = 0;i < strs.length;i++){
            if(min > strs[i].length()){
                min = strs[i].length();
            }
        }
        boolean flag = true;
        char c = 0;
        for(int j = 0;j < min;j++){
            for(int k = 0;k < strs.length-1;k++){
                if(strs[k].charAt(j) != strs[k+1].charAt(j)){
                    flag = false;
                    break;
                }
                c = strs[k].charAt(j);
            }
            if(flag == true){
                s += c;
            }else {
                break;
            }
        }
        return s;
    }
}
