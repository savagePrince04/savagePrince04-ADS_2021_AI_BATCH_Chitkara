package Lec12;
import java.util.*;
public class Generate_Parentheses {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        int n=3;
        printans(n,0,0,"",li);
        System.out.println(li);
    }
    public static void printans(int n,int open,int close,String ans,List<String>li){
        if(open==n && close==n){
            //System.out.print(ans+" ");
            li.add(ans);
            return;
        }
//        if(open<n) {
//            printans(n, open + 1, close, ans+"(",li);
//        }
//        if(close<open){
//            printans(n,open,close+1,ans+")",li);
//        }
        if(open>n || close>open){
            return;
        }
        printans(n, open + 1, close, ans+"(",li);
        printans(n, open, close+1, ans+")",li);
    }
    }
