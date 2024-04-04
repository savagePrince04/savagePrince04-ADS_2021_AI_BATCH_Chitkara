package Lec10;

public class IncOrder {
    public static void main(String[] args) {
        int n=5;
        dec(n);
    }
    public static void dec(int n){
        if(n==0){
            return;
        }
        dec(n-1);
        System.out.println(n);
    }
}
