package Lec7;

public class First_Bad_Version {
    public static void main(String[] args) {
        int n=5;
        int ans=firstBadVersion(n);
        System.out.println(ans);
    }
    public static int firstBadVersion(int n) {
        int low=1;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean isBadVersion(int data){  // You are given an API bool isBadVersion(version) on leetcode
        return true;// isBadVersion already give in the question so their was no need to
         // make IsBadVersion(Method) you can check this question on leetcode question no 278
    }
}

       // below leetCode Solution

   /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//public class Solution extends VersionControl {
//    public int firstBadVersion(int n) {
//        // search space
//        int low = 1;
//        int high= n;
//        int ans=0;
//        while(low<=high){
//            int mid= low+(high-low)/2;
//            if(isBadVersion(mid)){
//                ans=mid;
//                high=mid-1;
//            }
//            else{
//                low=mid+1;
//            }
//        }
//        return ans;
//    }
//}
