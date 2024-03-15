package Lec2;

public class Product_Less_then_k {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k = 10;
        System.out.println(Product(arr,k));
    }
    public static int Product(int arr[],int k){
        int si=0;
        int ei=0;
        int p=1;
        int ans=0;
        while(ei<arr.length){
            // array grow
            p = p * arr[ei];
            while(p>=k && si<=ei){
                // array shrink
                p = p/arr[si];
                si++;
            }
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;
    }
}
