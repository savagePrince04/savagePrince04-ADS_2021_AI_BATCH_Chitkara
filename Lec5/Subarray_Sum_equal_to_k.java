package Lec5;
import java.util.*;
public class Subarray_Sum_equal_to_k {
    public static void main(String[] args){
        int arr[]={1,2,3,-1};
        int k=3;
        subarraySum(arr,k);
    }
    public static  void subarraySum(int[] nums, int k) {
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(map.containsKey(sum-k)){
                ans = ans+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}
