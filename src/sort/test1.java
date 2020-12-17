package sort;

import com.sun.deploy.util.StringUtils;

import java.util.*;

public class test1 {

    public static void main(String[] args) {

        Random r = new Random();
        int n;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<6;i++){
            n = r.nextInt(33)+1;
            if(list.contains(n)){
                i--;
                continue;
            }
            list.add(n);
        }
        Collections.sort(list);
        int m = r.nextInt(16)+ 1;
        System.out.println(list+" + " + m);
        System.out.println();

        int i = 1;
        while(!d(list,m)){
            i++;
        }
        System.out.println(i);
    }


    public static boolean d(ArrayList ZList,int ZM){
        Random r = new Random();
        int n;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<6;i++){
            n = r.nextInt(33)+1;
            if(list.contains(n)){
                i--;
                continue;
            }
            list.add(n);
        }
        Collections.sort(list);
        int m = r.nextInt(16)+ 1;
        System.out.println(list+" + " + m);

        return ZList.toString().equals(list.toString()) && m == ZM;
    }
}
