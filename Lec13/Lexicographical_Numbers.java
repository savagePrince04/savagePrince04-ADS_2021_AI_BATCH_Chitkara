package Lec13;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Numbers {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        int n=1000;
        for(int i=1;i<=9;i++){
            Lexicographical(n,i,ll);
        }
        System.out.println(ll);
    }
    public static void Lexicographical(int n,int cur, List<Integer> ll){
        if(cur>n){
            return;
        }
       // System.out.println(cur);
        ll.add(cur);
        for(int i=1;i<=9;i++){
            Lexicographical(n,cur*10+i,ll);
        }
    }
}
