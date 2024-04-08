package Lec13;

public class Permutation {
    public static void main(String[] args) {
        String ques="abc";
        Combination(ques,"");
    }
    public static void Combination(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String s1 = str.substring(0,i);
            String s2 = str.substring(i+1);
            Combination(s1+s2,ans+ch);
        }
    }
}
