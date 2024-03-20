package Lec7;

import java.util.Arrays;

public class Aggressive_cows {
    public static void main(String[] args) {
        int arr[] = { 1,2,8,4,9};
        int n= 5;
        int c=3;
        Aggressive(arr,n,c);
    }
    public static void Aggressive(int arr[],int n,int c){
        Arrays.sort(arr);
        int low=1;
        int high = arr[arr.length-1]-arr[0];
        int ans=0;
        while(low<=high){
            // mid represent the minimum distance between two cows
            int mid=(low+high)/2;
            if(IsPossible(arr,n,c,mid)){
                // if it is possible to kept mid distance between two cows
                // then i want to increase mid distance apart
                ans=mid;
                low=mid+1;
            }
            else {
                // if it is not possible to kept mid distance between two cows
                // then i want to decrease mid distance apart
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
    public static Boolean IsPossible(int arr[],int n,int c,int mid){
        int cow=1;
        int pos=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-pos>=mid){
                cow++;
                pos=arr[i];
            }
            if(cow==c){
                return true;
            }
        }
        return false;
    }
}
