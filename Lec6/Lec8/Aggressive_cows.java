package Lec8;
import java.util.*;
public class Aggressive_cows {
    public static void main(String[] args) {
        int arr[]={1,2,8,4,9};
        int n=5;
        int c=3;
        AggressiveCow(arr,n,c);
    }
    public static void AggressiveCow(int arr[],int n,int c){
        Arrays.sort(arr);
        int left=1;
        int ans=0;
        int right= arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(IsPossible(arr,n,c,mid)){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(ans);
    }
    public static Boolean IsPossible(int arr[],int n,int c,int mid){
        int pos=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-pos>=mid){
            count++;
            pos=arr[i];
            }
            if(count==c){
                return true;
            }
        }
        return false;
    }
}
