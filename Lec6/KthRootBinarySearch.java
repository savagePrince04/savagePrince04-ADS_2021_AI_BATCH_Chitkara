package Lec6;

public class KthRootBinarySearch {
    public static void main(String[] args) {
        int n=150;
        int k=3;
        kthRoot(n,k);
    }
    public static void kthRoot(int n,int k){
        int low=0;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
