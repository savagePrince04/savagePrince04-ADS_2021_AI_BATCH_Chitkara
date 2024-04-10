package Lec14;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
        String ques="23";
        Combinations(ques,"",ll);
        System.out.println(ll);
    }
    public static void Combinations(String s,String ans,List<String> ll){
        if(s.length()==0){
            //System.out.println(ans);
            ll.add(ans);
            return;
        }
        char ch = s.charAt(0);//2
        int num = ch-'0'; //2
        String press=map[num]; // abc
        for(int i=0;i<press.length();i++){
            Combinations(s.substring(1),ans+press.charAt(i),ll);
        }
    }
}
