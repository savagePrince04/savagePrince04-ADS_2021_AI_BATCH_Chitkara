package Lec10;

public class FactTail {
    public static void main(String[] args) {
        long n=36;
        long res=fact(n,1);
        System.out.println(res);
    }
    public static long fact(long n,long ans){
        if(n==0 || n==1){
            return ans;
        }
        return fact(n-1,n*ans);
    }
}
