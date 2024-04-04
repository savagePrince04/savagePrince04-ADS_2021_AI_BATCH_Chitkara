package Lec11;

public class Dice_problem {
    public static void main(String[] args) {
        int n=4;
        Printans(n,0,"");
    }
    public static void Printans(int n,int cur,String ans){
        if(cur==n){
            System.out.println(ans);
            return;
        }
        if(cur>n){
            return;
        }
//        Printans(n,cur+1,ans+1);
//        Printans(n,cur+2,ans+2);
//        Printans(n,cur+3,ans+3);
         for(int i=1;i<=3;i++){
             Printans(n,cur+i,ans+i);
         }
    }
}
