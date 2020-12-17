package leetcode;

public class T20 {
    public static void main(String[] args) {

        System.out.println(isValid2("[]"));
    }

    public static boolean isValid(String s){
        if(s.length()==0){
            return true;
        }
        if(s.length()==1){
            return false;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stringBuffer.append(s.charAt(i));
            }else{
                if(stringBuffer.length()==0){
                    return false;
                }
                if(s.charAt(i)==')'){
                    if(stringBuffer.charAt(stringBuffer.length()-1)=='('){
                        stringBuffer.deleteCharAt(stringBuffer.length()-1);
                    }else {
                        return false;
                    }
                }
                if(s.charAt(i)==']'){
                    if(stringBuffer.charAt(stringBuffer.length()-1)=='['){
                        stringBuffer.deleteCharAt(stringBuffer.length()-1);
                    }else {
                        return false;
                    }
                }
                if(s.charAt(i)=='}'){
                    if(stringBuffer.charAt(stringBuffer.length()-1)=='{'){
                        stringBuffer.deleteCharAt(stringBuffer.length()-1);
                    }else {
                        return false;
                    }
                }
            }
        }
        return stringBuffer.length() == 0;
    }

    public static boolean isValid2(String s){
        while (s.contains("{}") || s.contains("()") || s.contains("[]")){
            s = s.replace("()","");
            s = s.replace("[]","");
            s = s.replace("{}","");
        }
        return s.length() == 0;
    }
}
