package Lec9;

public class BookAllocation {
    public static void main(String[] args) {
        int m=4;
        int n=2;
        int arr[]={12,34,67,90};
        MaxPaje(arr,m,n);
    }
    public static void MaxPaje(int arr[],int m,int n){
        // find search space
        int low=0;
        int high=0;
        for(int i=0;i< arr.length;i++){
            high=high+arr[i];
        }
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(IsNotPossible(arr,m,n,mid)){
                ans=mid;
                high=mid-1;
            }
            else {
                low=low+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean IsNotPossible(int arr[],int m,int n,int mid){
        int student=1;
        int readpaje=0;
        for(int i=0;i<m;){
            if(readpaje+arr[i]<=mid){
                readpaje=readpaje+arr[i];
                i++;
            }
            else {
                student++;
                readpaje=0;
            }
            if(student>n){
                return false;
            }
        }
        return true;
    }
}
