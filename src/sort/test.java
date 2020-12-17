package sort;

import java.util.ArrayList;
import java.util.Arrays;
//["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"],"32"
//["零","壹","贰","叁","肆","伍","陆","柒","捌","玖"],"叁叁"
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list2.add(1);
        System.out.println(list1.toString().equals(list2.toString()));
    }
    public static String test1(String[] chars, String currentValue){

        int a = 0;
        int sum = 0;
        int k = 1;
        for(int i = currentValue.length()-1;i>=0;i-- ){
            while(currentValue.charAt(i) != chars[a].charAt(0)){
                a++;
            }
            sum += a * k;
            k *= 10;

        }
        sum += 1;
        String o = "";

        ArrayList<Integer> ints = new ArrayList<Integer>();
        do{
            //将每个数放入按数组中
            ints.add(0,sum%10);
            sum = sum/10;

        }while(sum !=0);
        for(int n = 0;n < ints.size();n++){
            o = o + chars[ints.get(n)];

        }


        return o;
    }
}
