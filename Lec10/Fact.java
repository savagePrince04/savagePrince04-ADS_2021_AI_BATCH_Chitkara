package Lec10;

public class Fact {
    public static void main(String[] args) {
        int n=5;
       int ans= fact(n);
        System.out.println(ans);
    }
    public static int  fact(int n){
        if(n==1){
           return 1;
        }
        int fn=fact(n-1);  // recursive call
        return fn*n;   // self work
    }
}
